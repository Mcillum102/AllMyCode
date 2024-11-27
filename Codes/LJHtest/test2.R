# Load necessary libraries
library(tidyverse)
library(stringr)

# Part 1
# Load the dataset
# Assuming the dataset is located in "data/2020_10K_item1_full.csv"
ten_k_df <- read.csv("2020_10K_item1_full.csv", stringsAsFactors = FALSE)

# Display the structure of the dataset to verify the column names
str(ten_k_df)

# Check if the 'item_1_text' column exists
if (!"item_1_text" %in% colnames(ten_k_df)) {
  stop("The column 'item_1_text' does not exist in the DataFrame. Please check the column names.")
}

# Ensure the 'item_1_text' column is of character type
ten_k_df$item_1_text <- as.character(ten_k_df$item_1_text)

# Remove rows with missing or empty values in the 'item_1_text' column
ten_k_df <- ten_k_df %>% filter(!is.na(item_1_text) & item_1_text != "")

# Preprocessing the text
# 1. Convert text to lowercase
ten_k_df$text_clean <- str_to_lower(ten_k_df$item_1_text)

# 2. Remove punctuation
ten_k_df$text_clean <- str_replace_all(ten_k_df$text_clean, "[[:punct:]]", "")

# 3. Tokenize the text (split into words)
ten_k_df$text_tokens <- str_split(ten_k_df$text_clean, "\\s+")

# Part 2
# Assuming that you've generated word clouds and identified keywords manually
# Here, we'll define the chosen representative keywords for analysis

# Example chosen keywords based on manual inspection of word clouds
keywords <- c("innovation", "sustainability", "growth")


# Part 3
# Load necessary libraries
library(text2vec)  # For Word2Vec
library(data.table)  # For data manipulation

# Load the pre-trained Word2Vec model
# Replace "10k_word2vec.model" with the actual file path to your trained model
word2vec_model <- fread("10k_word2vec_vectors.csv", data.table = FALSE)

# Define the selected keywords
selected_keywords <- c("innovation", "sustainability", "growth")

# Check if the selected keywords exist in the Word2Vec vocabulary
valid_keywords <- selected_keywords[selected_keywords %in% rownames(word2vec_model)]

if (length(valid_keywords) == 0) {
  stop("None of the selected keywords exist in the Word2Vec vocabulary.")
}

# Find the most similar words for each valid keyword
similar_words <- lapply(valid_keywords, function(keyword) {
  # Compute cosine similarity for the given keyword
  similarity_scores <- word2vec_model[keyword, ] %*% t(word2vec_model)
  # Sort and retrieve top 5 similar words
  similar <- sort(similarity_scores, decreasing = TRUE)[1:5]
  return(names(similar))
})

# Combine the results into a named list
names(similar_words) <- valid_keywords

# Display the similar words
print("Most similar words for each selected keyword:")
print(similar_words)


