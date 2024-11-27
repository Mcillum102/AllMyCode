from sklearn.feature_extraction.text import TfidfVectorizer
from collections import Counter
import numpy as np

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

# Apply the word count method
filtered_data_2020['top_keywords_word_count'] = filtered_data_2020['item_1_text'].apply(lambda x: get_top_keywords_word_count(x, 10))

# Apply the TF-IDF method
texts = filtered_data_2020['item_1_text'].fillna('')
top_keywords_tfidf = get_top_keywords_tfidf(texts, 10)
filtered_data_2020['top_keywords_tfidf'] = top_keywords_tfidf

# Display the first few rows to confirm the changes
filtered_data_2020.head()