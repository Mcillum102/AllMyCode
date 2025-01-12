'''
Question:
Two players are competing in a word game where they earn points based on the types of letters used in their words. 
The scoring rules are as follows:

Vowels (A, E, I, O, U): 2 points each
Consonants from A to M (B, C, D, F, G, H, J, K, L, M): 1 point each
Consonants from N to Z (N, P, Q, R, S, T, V, W, X, Y, Z): 3 points 

You are given two strings representing the words submitted by each player. 
Calculate the scores for each player and output the scores in descending order. 
If the scores are tied, the order does not matter.

All input are considered as length 5. 
'''
# Ex:
# Input 1:   HELLO
#            WORLD
# Output 1:  10 7
# Input 2:   YOUSHJIJCISJ
#            SNKCSCOPSL
# Output 2:  23 22