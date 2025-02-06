# Regular Expression (re)
# It is a searching tool that helps to search for items through string values
# It provides more precise searches for Python string
import re
# This line means we are able to use anything that belongs to the re module.

# re.search(): check if the searched item is in the string
#   This method returns value, we should have a variable to accept it.
#   It returns the first time searched item appears in str.
#   If the searched item doesn't exist, it returns None.
str1 = 'The quick brown fox, named jd Roxanne, jumped over Bruno, a lazy dog.'
searched_letter = re.search('[m-o]', str1)
# re.search() returns a match object, which can be used as condition (true or false)
if searched_letter:
    print('any letter between m - o exists')
    
# re.findall() returns a list containing the things we want to search for
#   This method is used to count how many times something appears in my str
letter_list = re.findall('fox', str1)
print(len(letter_list))

# re.split() returns a list where the string is sperated by the matched item
splited_list = re.split('[,. ]', str1)
print(splited_list)

# re.sub() returns a new string that replaces a character when the match is found in the str
str2 = re.sub('o', '0', str1)
print(str2)

# Metacharacters: special characters that can help us do different kinds of search
# []: we can search for items in a specific set of characters
#       1. a-z: meaning the set will be from a to z
#       2. az: mearning the set will be a or z
#       3. ^az: meaning the set wiil not include a and z
#       3a. ^a-z: meaning the set will not include anything between a to z
# | : search for multiple items at the same time
# . : search for any character
# ^ : search for string that starts with specific item
# $ : search for string that ends with specific item
# * : search for an item that appears 0 or more times
# + : search for an item that appears 1 or more tiems
# ? : search for an item that appears 0 or 1 times
# {}: with number inside, search for an item that appears exactly some times
print(re.search('j.*d', str1))
print(re.search('j.+d', str1))
print(re.search('j.?d', str1))
print(re.search('j.{4}d', str1))

# Please complete the question on the left
email1 = "My email is test.email@example.com"
# Check if this email constains @
foundat = re.search('@', email1)
if foundat: print("contains @")

# Check the amount of vowels used in the sentence
vowellist = re.findall('a|e|i|o|u', email1.lower())
print(len(vowellist))

# Count the amount of specials characters in email
specialcharlist = re.findall('[^a-z ]', email1.lower())
print(specialcharlist)
print(len(specialcharlist))

# check if the emails domain name (left to the @) is all alphanumeric and at least 1 dot
domainlist = re.findall(' .*@', email1.lower())
domainlist = domainlist[0].split(' ')
domain = domainlist[-1][:-1]
# As we get to this part, we have domain email extracted. Try to find out if it satisfies the condition
print(domain)
