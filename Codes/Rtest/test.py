import pandas as pd

# Load the data
data = pd.read_csv('public_firms.csv')

# Filter rows where 'sic' starts with '58'
filtered_firms = data[data['sic'].astype(str).str.startswith('58')]
print(filtered_firms)  # Display filtered DataFrame

# Define the range of years
years_range = set(range(1994, 2021))

# Group by 'conm' and aggregate the unique 'fyear' values for each firm
firms_years = filtered_firms.groupby('conm')['fyear'].unique()

# Filter firms that have records for all years in the range
firms_all_years = firms_years[firms_years.apply(lambda x: years_range.issubset(set(x)))]
print(list(firms_all_years))  # Display list of firms with full year range

# Count the number of such firms
num_firms_all_years = len(firms_all_years)
print(num_firms_all_years)
