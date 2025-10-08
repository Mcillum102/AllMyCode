#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int N = 6;
vector<int> coins = {1, 3, 4};
const int INF = 1e9; // Define INF as a large constant value
bool ready[6];
int value[6];

int solve(int x)
{
    if (x < 0)
        return INF;
    if (x == 0)
        return 0;
    if (ready[x])
        return value[x];
    int best = INF;
    for (int c : coins)
    {
        best = min(best, solve(x - c) + 1);
    }
    ready[x] = true;
    value[x] = best;
    return best;
}

// Very simple greedy algorithm example
// Keep in mind that not all case would work in greedy algorithm.
int main()
{
    // int money = 120;
int main()
{
    // int money = 120;

    // // create a result vector to hold used coins
    // vector<int> used;
    // // create a result vector to hold used coins
    // vector<int> used;
    // Start an iteration from the back of the vector coins.
    // for (int i = coins.size() - 1; i > 0; i--)
    // {
    //     // If we can always choose the largest coin possible, we keep choosing it until we cannot.
    //     int curr_coin = coins.at(i);
    //     while (money >= curr_coin)
    //     {
    //         used.push_back(curr_coin); // add the possible coin into used
    //         money -= curr_coin;
    //     }
    // }
    // cout << "The coins used are: ";
    // for (int j : used)
    // {
    //     cout << j << " ";
    // }
    // cout << endl;
    cout << solve(N) << endl;
    // for (int i = coins.size() - 1; i > 0; i--)
    // {
    //     // If we can always choose the largest coin possible, we keep choosing it until we cannot.
    //     int curr_coin = coins.at(i);
    //     while (money >= curr_coin)
    //     {
    //         used.push_back(curr_coin); // add the possible coin into used
    //         money -= curr_coin;
    //     }
    // }
    // cout << "The coins used are: ";
    // for (int j : used)
    // {
    //     cout << j << " ";
    // }
    // cout << endl;
    cout << solve(N) << endl;
}