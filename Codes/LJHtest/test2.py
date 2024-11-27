import pandas as pd
from gensim.models import Word2Vec
import re
import string


# Assuming 'ten_k_df' contains the full 10-K text data with a 'text' column
# Preprocess text: remove punctuation, lowercase, and split into words
ten_k_df = pd.read_csv("2020_10K_item1_full.csv")

''' Step 1: Preprocess the text'''
def preprocess_text(text):
    text = str(text).lower()  # Lowercase
    text = re.sub(f'[{string.punctuation}]', '', text)  # Remove punctuation
    return text.split()  # Tokenize text into words

# Apply preprocessing to each document in the 10-K dataset
ten_k_df['item_1_text'] = ten_k_df['item_1_text'].apply(preprocess_text)
print(ten_k_df)