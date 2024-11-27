from collections import defaultdict
# import csv, pickle, json

# f = []
# r = []

# with open('public_firms.csv') as csvfile:
#     csvreader = csv.reader(csvfile, delimiter="\t")
#     # 我们不能直接output reader，也不能用loop去output
#     f = next(csvreader)     # 第一次使用next的时候，它会代表Colunm name / fields 
    
#     # 只有在with open内才可以loop reader 或 writter
#     for row in csvreader:       # 这个loop可以把每一行的数据，以str的type，单独存到list里 / 或者直接print，
#         print(row)              # reader allows direct print because each line is considered str
        
#     csvwriter = csv.writer(csvfile)
#     csvwriter.writerow(f)       # write the first row, which is the colunms
#     csvwriter.writerows(r)      # write for everything in the file you provide
        
# # when you use different types of reader / writter, try use them in different with open.
# with open('public_firms.csv') as csvfile2:
#     csvreader2 = csv.DictReader(csvfile2)
#     for i in csvreader2:
#         r.append(i)
        
# dict1 = {"1": 99}
tupl = (1, 1999)
dict1 = defaultdict(list)

# for country, pairs in decoded_emissions.items():
#     new_decoded_emissions[country].append(data)

dict1 = dict(tupl)

# for country, pairs in new_decoded_emissions.items():
#     pairs[0]['1930'] -> CO2 emissions

    
print(dict1)