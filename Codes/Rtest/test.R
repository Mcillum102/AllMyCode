library(dplyr)

# Load the CSV file
data <- read.csv("public_firms.csv")

# Filter rows where 'sic' starts with '58'
filtered_firms <- data %>%
  filter(grepl("^58", as.character(sic)))

# Display the filtered data
print(filtered_firms)

# Define the range of years
years_range <- 1994:2020

# Group by 'conm' and get unique 'fyear' values for each firm
firms_years <- filtered_firms %>%
  group_by(conm) %>%
  summarize(fyear = list(unique(fyear)))

# Filter firms that have records for all years in the range
firms_all_years <- firms_years %>%
  filter(sapply(fyear, function(x) all(years_range %in% x)))

# Display list of firms that meet the criteria
print(firms_all_years$conm)

# Count the number of such firms
num_firms_all_years <- nrow(firms_all_years)
print(num_firms_all_years)

# Calculate the start year and span of years for each company
company_years_info <- filtered_firms %>%
  group_by(conm) %>%
  summarize(
    start_year = min(fyear),                # The first recorded year for each company
    year_span = max(fyear) - min(fyear) + 1 # The total number of years the company spans
  )

# Display the start year and span of years for each company
print(company_years_info)
