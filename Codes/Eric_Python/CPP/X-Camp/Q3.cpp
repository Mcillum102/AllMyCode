#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <set>
using namespace std;

// Operation 1: attack jiro's attacking cards and 'remove' them when they are defeated
int operation1(vector<int> &jiro_atk, vector<int> &ciel_cards)
{
    // Make two local reference so we are not misdirected
    vector<int> jiro = jiro_atk;
    vector<int> ciel = ciel_cards;
    sort(ciel.rbegin(), ciel.rend());
    int total_damage = 0;
    for (int c : ciel)
    {
        int highest = -1; // defaultly cannot beat jiro's card
        int index = -1;   // find out which card is the one we want to fight. defaulty DNE
        // Find the best ATK Card
        for (int j = 0; j < jiro.size(); ++j)
        {
            // we have variable c represent ciel's card; j is the index of jiro's card
            // how to compare them?
            if (c > jiro[j])
            {
                int d = c - jiro[j]; // c is our best card. We want to find out the best card for j and then attack it
                if (d > highest)
                {
                    highest = d;
                    index = j;
                }
            }
        }

        // If there is a card we can attack
        if (index != -1)
        {
            total_damage += highest;          // we successfully beat jiro's card and earned the points
            jiro.erase(jiro.begin() + index); // vector don't remove with value. we need to provide the precise index to remove.
        }
    }

    return total_damage;
}

// Operation 2: attack all jiro's cards. Remove ciel's card after attacking
int operation2(vector<int> &jiro_atk, vector<int> &jiro_def, vector<int> &ciel_cards)
{
    // make local reference
    vector<int> atk = jiro_atk;
    vector<int> def = jiro_def;

    // creating a multiset can help us easily remove the card thats used
    multiset<int> ciel(ciel_cards.begin(), ciel_cards.end());
    sort(def.begin(), def.end()); // we want to attack the smaller numbers first

    // 1: use the weakest card that ciel has to attack all jiro's defense cards
    for (int d : def)
    {
        auto it = ciel.upper_bound(d);

        if (it == ciel.end())
        {
            return 0; // none of your card is able to beat def cards. no points granted
        }

        ciel.erase(it); // we find out the smallest card to attack def cards to save more points possible
    }

    vector<int> c_remain(ciel.begin(), ciel.end());
    sort(atk.begin(), atk.end()); // we want to attack the smaller cards first

    // when there are not enough ciel cards to attack jiro's cards
    if (atk.size() > c_remain.size())
    {
        return 0;
    }

    for (int i = 0; i < atk.size(); ++i)
    {
        // if our bet card is not able to beat the first card jiro has
        if (c_remain[c_remain.size() - atk.size() + i] < atk[i])
        {
            return 0;
        }
    }

    // Until now, we have dicussed about all case that will not give us any damamge.
    // we will start to count damage now.
    int total_damage = 0;
    for (int c : c_remain)
    {
        total_damage += c;
    }
    for (int a : atk)
    {
        total_damage -= a;
    }

    return total_damage;
}

int main()
{
    // write inputs for n and m
    int n, m;
    cin >> n >> m;

    // two vectors to store their cards
    vector<int> jiro_atk, jiro_def, ciel_cards;
    // repeat n times to get jiro has
    for (int i = 0; i < n; ++i)
    {
        string type;
        int damage;
        cin >> type >> damage;
        if (type == "ATK")
        {
            jiro_atk.push_back(damage);
        }
        else
        {
            jiro_def.push_back(damage);
        }
    }
    // repeat m times to get ciel has
    for (int i = 0; i < m; ++i)
    {
        int damage;
        cin >> damage;
        ciel_cards.push_back(damage);
    }

    // this is calling operations 1 to use ciel's cards and attack jiro's attacking card
    int damage_1 = operation1(jiro_atk, ciel_cards);
    int damage_2 = operation2(jiro_atk, jiro_def, ciel_cards);
    cout << max(damage_1, damage_2) << endl;

    // While Loop
    
}