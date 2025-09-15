import requests
from bs4 import BeautifulSoup
import pandas as pd
from IPython.display import display

# URL of the Craigslist page
url = 'https://vancouver.craigslist.org/search/apa'

# Send a request to fetch the raw HTML of the page (static content)
response = requests.get(url)
# Save the response content to an HTML file
# Parse the HTML
soup = BeautifulSoup(response.text, "html.parser")
with open('/Users/shuhancao/Desktop/LJHtest/craigslist_page.html', 'w', encoding='utf-8') as file:
    file.write(soup.prettify())
# print(soup.prettify())
# Extract the first 360 postings
postings = soup.find_all('li', class_='cl-static-search-result')
    
# Initialize empty lists to store title, prices, location, link
titles = []
prices = []
locations = []
links = []

# Loop through each posting and extract the title, price, location, and link
for post in postings:
    title = post.find('div', class_='title')
    if title:
        titles.append(title.text.strip())
    else:
        titles.append(None)  # Append None if title is not found

    price = post.find('div', class_='price')
    if price:
        prices.append(price.text.strip())
    else:
        prices.append(None)  # Append None if price is not found

    location = post.find('div', class_='location')
    if location:
        locations.append(location.text.strip())
    else:
        locations.append(None)  # Append None if location is not found

    link = post.find('a', class_="")
    if link:
        links.append(link["href"])
    else:
        links.append(None)  # Append None if link is not found

# Create a DataFrame from the first 360 listings
data = pd.DataFrame({
    'Title': titles,
    'Price': prices,
    'Location': locations,
    'Link': links
})
print(data)


# # Step 1: Check for missing values
# missing_summary = data.isnull().sum()

# # Step 2: Clean the Price column by removing "$" and quotes, then convert to numeric
# data['Price'] = data['Price'].str.replace(r'\$', '', regex=True).str.replace(',', '', regex=True).astype(float)

# # Step 3: Standardize Location names
# data['Location'] = data['Location'].str.replace('"', '').str.strip().str.title()

# # Step 4: Detect and handle outliers in the Price column
# Q1 = data['Price'].quantile(0.25)
# Q3 = data['Price'].quantile(0.75)
# IQR = Q3 - Q1
# lower_bound = Q1 - 1.5 * IQR
# upper_bound = Q3 + 1.5 * IQR

# # Remove outliers
# cleaned_data = data[(data['Price'] >= lower_bound) & (data['Price'] <= upper_bound)]


# # Step 5: Reset the index to start from 1
# cleaned_data.reset_index(drop=True, inplace=True)
# cleaned_data.index += 1

# # Save the cleaned dataset to file and display the result
# display(cleaned_data)
# # Return summaries of missing values and the cleaned data description
# missing_summary, cleaned_data.describe()

# import matplotlib.pyplot as plt

# # Recreate the histogram after confirming that the dataset excludes outliers
# # Prices have already been cleaned and outliers removed in the "cleaned_data" dataframe

# # Extract cleaned prices
# cleaned_prices = cleaned_data['Price']

# # Calculate mean and median for the cleaned dataset
# mean_cleaned_price = cleaned_prices.mean()
# median_cleaned_price = cleaned_prices.median()

# # Create a histogram for the cleaned dataset
# plt.figure(figsize=(10, 6))
# plt.hist(cleaned_prices, bins=20, alpha=0.7, edgecolor='black', color='orange', label='Price Distribution')

# # Add mean and median lines
# plt.axvline(mean_cleaned_price, color='blue', linestyle='--', label=f'Mean: ${mean_cleaned_price:.2f}')
# plt.axvline(median_cleaned_price, color='green', linestyle='-', label=f'Median: ${median_cleaned_price:.2f}')

# # Add labels, title, and legend
# plt.title('Distribution of Property Prices (Outliers Removed)', fontsize=16)
# plt.xlabel('Price ($)', fontsize=12)
# plt.ylabel('Frequency', fontsize=12)
# plt.legend()
# plt.grid(axis='y', alpha=0.3)

# # Display the updated plot
# plt.show()