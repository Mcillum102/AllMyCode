#include <iostream>
#include <vector>
#include <algorithm>
#include <iomanip>
#include <queue>

using namespace std;

int main()
{
    // ios_base::sync_with_stdio(false);
    // cin.tie(NULL);

    // int n;

    // cout << "Program started. Please enter a number for n: " << endl;
    // cin >> n;
    // cout << "You entered: " << n << endl;

    // if (n <= 0) {
    //     cout << "n is zero or negative. No matrix will be printed." << endl;
    //     return 0; // Exit program
    // }

    // cout << "Creating the matrix..." << endl;
    // vector<vector<int>> matrix(n, vector<int>(n));

    // for (int r = 0; r < n; ++r) {
    //     for (int c = 0; c < n; ++c) {
    //         int top_dist = r;
    //         int bottom_dist = n - 1 - r;
    //         int left_dist = c;
    //         int right_dist = n - 1 - c;
    //         int layer = min({top_dist, bottom_dist, left_dist, right_dist});
    //         matrix[r][c] = layer + 1;
    //     }
    // }

    // cout << "Printing the final matrix:" << endl;
    // for (int r = 0; r < n; ++r) {
    //     for (int c = 0; c < n; ++c) {
    //         cout << setw(2) << matrix[r][c];
    //         if (c < n - 1) {
    //             cout << " ";
    //         }
    //     }
    //     cout << "\n";
    // }

    // return 0;
    // pq<type, container (default vector), case (which priority)> pq_name
    priority_queue<int> pq;     // It will always put biggest value on the top, default, with no change to priority
    // Max-heap means putting all bigger conditions as priority


    priority_queue<int, vector<int>, greater<int>> pq1;     // It will always put biggest value on the top, min-heap, make smaller value higher priority
    // Min-heap means putting all smaller conditions as priority

    queue<int> q;

    q.push(10);
    q.push(20);
    q.push(5);

    pq.push(10);
    pq.push(20);
    pq.push(5);

    pq1.push(10);
    pq1.push(20);
    pq1.push(5);
    pq1.pop();      // no index allowed

    cout << q.front() << endl;
    cout << pq.top() << endl;
    cout << pq1.top() << endl;

    int arr[4] = {1,2,3,4};
    int arr2d[2][2] = {{1,2}, {2,5}};
}