#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
#include <set>
using namespace std;

int main()
{
    int n, k;
    cin >> n >> k;
    vector<pair<int, int>> movies(n);
    for (int i = 0; i < n; i++)
        cin >> movies[i].first >> movies[i].second;
    sort(movies.begin(), movies.end(), [](auto &a, auto &b)
         { return a.second < b.second; });
    multiset<int> available;
    for (int i = 0; i < k; i++)
        available.insert(i);
    int watched = 0;
    for (auto &[start, end] : movies)
    {
        auto it = available.upper_bound(start);
        if (it == available.begin())
            continue;
        --it;
        available.erase(start);
        available.insert(end);
        watched++;
    }
    cout << watched << endl;
}