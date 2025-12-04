#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> a;

int solve(int l, int r, int removed) {
    if (l > r) {
        return 0;
    }

    int min_val = 2e9; 
    for (int i = l; i <= r; ++i) {
        min_val = min(min_val, a[i]);
    }

    int solution_1 = r - l + 1;
    int solution_2 = min_val - removed;

    int i = l;
    while (i <= r) {
        if (a[i] > min_val) {
            int start = i;
            while (i <= r && a[i] > min_val) {
                i++;
            }
            solution_2 += solve(start, i - 1, min_val);
        } else {
            i++;
        }
    }
    return min(solution_1, solution_2);
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    if (cin >> n) {
        a.resize(n);
        for (int i = 0; i < n; ++i) {
            cin >> a[i];
        }
        cout << solve(0, n - 1, 0) << endl;
    }

    return 0;
}