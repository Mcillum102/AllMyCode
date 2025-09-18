import pandas as pd

data = pd.read_csv('public_firms.csv')
# total_sales = data.groupby(['conm','sic','gvkey'])['sale'].sum().reset_index()
# top_down_by_sale = total_sales.sort_values(by='sale', ascending=False)

# print(top_down_by_sale.head(10))

# total_sales.rename(columns={'sale': 'total_sale'}, inplace=True)
# total_sales = pd.merge(data, total_sales, on='conm')

location = data.groupby('location')['conm'].nunique().reset_index()
location.rename(columns={'conm': 'firm_count'}, inplace=True)
top_10_locations = location.sort_values(by='firm_count', ascending=False).head(10)
print(top_10_locations)
