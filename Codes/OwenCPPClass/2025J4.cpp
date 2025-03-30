#include<iostream>
#include<vector>
using namespace std;

int main() {
    int n;
    cin >> n;

    vector<string> arr(n + 1);
    arr[0] = "-1";
    bool allS = true;

    for (int i = 1; i <= n; ++i) {
        cin >> arr[i];
        if (arr[i] != "S") {
            allS = false;
        }
    }

    if (allS) {
        cout << n - 1 << endl;
        return 0;
    }

    vector<vector<int>> dp(n + 1, vector<int>(2, 0));

    for (int i = 1; i <= n; ++i) {
        if (arr[i] == "S") {
            dp[i][0] = dp[i - 1][0] + 1;
            dp[i][1] = dp[i - 1][1] + 1;
        } else {
            dp[i][0] = 0;
            dp[i][1] = dp[i - 1][0] + 1;
        }
    }

    int result = 0;
    for (int i = 0; i <= n; ++i) {
        result = max(result, max(dp[i][0], dp[i][1]));
    }

    cout << result << endl;

    return 0;
}
