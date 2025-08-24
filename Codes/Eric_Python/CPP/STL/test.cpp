#include <iostream>
#include <vector>
#include <algorithm>
#include <iomanip>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int n;

    cout << "Program started. Please enter a number for n: " << endl;
    cin >> n;
    cout << "You entered: " << n << endl;

    if (n <= 0) {
        cout << "n is zero or negative. No matrix will be printed." << endl;
        return 0; // Exit program
    }

    cout << "Creating the matrix..." << endl;
    vector<vector<int>> matrix(n, vector<int>(n));

    for (int r = 0; r < n; ++r) {
        for (int c = 0; c < n; ++c) {
            int top_dist = r;
            int bottom_dist = n - 1 - r;
            int left_dist = c;
            int right_dist = n - 1 - c;
            int layer = min({top_dist, bottom_dist, left_dist, right_dist});
            matrix[r][c] = layer + 1;
        }
    }

    cout << "Printing the final matrix:" << endl;
    for (int r = 0; r < n; ++r) {
        for (int c = 0; c < n; ++c) {
            cout << setw(2) << matrix[r][c];
            if (c < n - 1) {
                cout << " ";
            }
        }
        cout << "\n";
    }

    return 0;
}