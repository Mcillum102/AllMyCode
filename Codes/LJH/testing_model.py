# Import required libraries
import pandas as pd
from gensim.models import Word2Vec
import re
from nltk.corpus import stopwords
import ssl
import nltk

# Disable SSL certificate verification
ssl._create_default_https_context = ssl._create_unverified_context

# Download stopwords
nltk.download('stopwords')

print("NLTK stopwords downloaded successfully!")

# Load the Dataset
# Replace 'data/2020_10K_item1_full.csv' with your actual file path
data = pd.read_csv('2020_10K_item1_full.csv')

# Define a simple text cleaning function (no stopwords yet)
def preprocess_text(text):
    if isinstance(text, str):  # Ensure input is a string
        text = text.lower()  # Convert to lowercase
        text = re.sub(r'[^\w\s]', '', text)  # Remove punctuation
        text = re.sub(r'\d+', '', text)  # Remove numbers
        return text.split()  # Split into tokens
    return []

# Apply the preprocessing function to each row
data['item_1_text'] = data['item_1_text'].apply(preprocess_text)

# Train the model using the tokenized text
model = Word2Vec(
    sentences=data['item_1_text'],  # Tokenized sentences
    vector_size=10,  # Dimensionality of word embeddings
    window=1,         # Context window size
    min_count=10,      # Ignore words with frequency lower than this
    workers=1,         # Number of threads for training
    sg=1
)

# # Save the Trained Word2Vec model to a file
# model.save("word2vec_model_no_stopwords.model")
# print("Word2Vec model trained and saved as 'word2vec_model_no_stopwords.model'.")

# # Display the first 10 words in the vocabulary
# print("\nVocabulary (First 10 words):")
# print(list(model.wv.key_to_index.keys())[:10])
