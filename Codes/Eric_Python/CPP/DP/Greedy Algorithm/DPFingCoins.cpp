#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int N = 5;
vector<int> coins = {1, 3, 4};
const int INF = 1e9; // Define INF as a large constant value
int first[5];
int value[5];
int coinCount[5];
int m = 10 ^ 9 + 7;

void solve()
{
    value[0] = 0;
    for (int x = 1; x <= N; x++)
    {
        value[x] = INF;
        for (auto c : coins)
        {
            if (x - c >= 0 && value[x - c] + 1 < value[x])
            {
                value[x] = value[x - c] + 1;
                first[x] = c;
            }
        }
    }
    while (N > 0)
    {
        cout << first[N] << "\n";
        N -= first[N];
    }
}

void solve1()
{
    coinCount[0] = 1;
    for (int x = 1; x <= N; x++)
    {
        for (auto c : coins)
        {
            if (x - c >= 0)
            {
                coinCount[x] += coinCount[x - c];
                coinCount[x] %= m;
            }
        }
    }
    cout << coinCount[N] << endl;
}

int main()
{
    // solve();
    solve1();
}