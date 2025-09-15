import ssl
import nltk

# Disable SSL certificate verification
ssl._create_default_https_context = ssl._create_unverified_context

# Download stopwords
nltk.download('stopwords')

print("NLTK stopwords downloaded successfully!")

