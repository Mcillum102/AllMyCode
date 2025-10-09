#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

int main()
{
    int n = 8;
    // vector<int> length(n, 1);
    vector<int> array = {6,2,5,1,7,4,8,3};
    // for (int k = 0; k < n; k++)
    // {
    //     for (int i = 0; i < k; i++)
    //     {
    //         if (array[i] < array[k])
    //         {
    //             length[k] = max(length[k], length[i] + 1);
    //         }
    //     }
        
    // }
    
    // Apply binary search to make the code more efficient.
    vector<int> tails;

    for (int num : array) {
        // Case 1: there are bigger numbers
        if (tails.empty() || num > tails.back()) {
            tails.push_back(num);
        // Case 2: num will replace a number in tails
        } else {
            // Option 1: Hard solve
            // int low = 0;
            // int high = tails.size() - 1;
            // int temp = 0;

            // while (low <= high) {
            //     int mid = low + (high - low) / 2;   // middle element index
            //     if (tails[mid] >= num) {
            //         temp = mid;
            //         high = mid - 1;
            //     } else {
            //         low = mid + 1;
            //     }
            // }
            // tails[temp] = num;

            // Option 2: lower_bound() method
            auto it = lower_bound(tails.begin(), tails.end(), num);
            *it = num;
        }
    }
    cout << tails.size() << endl;
}