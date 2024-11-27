import pandas as pd
import re
import string
from sklearn.feature_extraction.text import TfidfVectorizer
from collections import Counter
import numpy as np
import pandas as pd

# Load the 10-K and public_firm data files with a specified chunk size
chunk = 10000

# Initialize an empty list to store processed chunks
processed_chunks = []

# Read the 10-K data in chunks and process each chunk
data_10k_chunks = pd.read_csv('2020_10K_item1_full.csv', chunksize=chunk)

for data_chunk in data_10k_chunks:
    # Convert 'item_1_text' to lowercase
    data_chunk['item_1_text'] = data_chunk['item_1_text'].str.lower()
    
    # Remove punctuation from 'item_1_text'
    data_chunk['item_1_text'] = data_chunk['item_1_text'].apply(
        lambda x: re.sub(f"[{string.punctuation}]", "", x) if isinstance(x, str) else x
    )
    
    # Append the processed chunk to the list
    processed_chunks.append(data_chunk)

# Concatenate all processed chunks into a single DataFrame
data_10k = pd.concat(processed_chunks, ignore_index=True)

public_firm_data = pd.read_csv('public_firms.csv')

# Perform an inner join on a common key (e.g., 'gvkey')
merged_data = pd.merge(data_10k, public_firm_data, on='gvkey', how='inner')

# Ensure the 'sic' column is treated as a numeric type if it isn't already
merged_data['sic'] = pd.to_numeric(merged_data['sic'], errors='coerce')

# Filter to include only selected industry sectors (both 5810 and 5812)
selected_sectors = [5810, 5812]  # SIC codes for selected industries
filtered_data = merged_data[merged_data['sic'].isin(selected_sectors)]

# Function to get top N keywords based on word counts
def get_top_keywords_word_count(text, n=10):
    if isinstance(text, str):
        words = text.split()
        word_counts = Counter(words)
        top_keywords = word_counts.most_common(n)
        return [word for word, count in top_keywords]
    return []

# Function to get top N keywords based on TF-IDF score
def get_top_keywords_tfidf(texts, n=10):
    vectorizer = TfidfVectorizer(stop_words='english')
    tfidf_matrix = vectorizer.fit_transform(texts)
    feature_names = np.array(vectorizer.get_feature_names_out())
    
    top_keywords_list = []
    for row in tfidf_matrix:
        sorted_indices = np.argsort(row.toarray()).flatten()[::-1]
        top_keywords = feature_names[sorted_indices][:n]
        top_keywords_list.append(top_keywords)
    
    return top_keywords_list

# Ensure filtered_data is a copy (optional, but safer)
filtered_data = filtered_data.copy()

# Apply the word count method
filtered_data.loc[:, 'top_keywords_word_count'] = filtered_data['item_1_text'].apply(lambda x: get_top_keywords_word_count(x, 10))

# Apply the TF-IDF method
texts = filtered_data['item_1_text'].fillna('')
top_keywords_tfidf = get_top_keywords_tfidf(texts, 10)
filtered_data.loc[:, 'top_keywords_tfidf'] = top_keywords_tfidf

# Display the first few rows to confirm changes
# gvkey_filtered_data = merged_data[merged_data['gvkey'] == 165914]

# # Display the first few rows of the filtered DataFrame to confirm join and filter
# print(gvkey_filtered_data)
print(filtered_data.columns)