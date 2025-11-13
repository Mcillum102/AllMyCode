#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

// How to apply binary search method here?
int countOccurance(vector<int> &arr, int target) {
    int count = 0;  // this is how many times the target appears 
    int first = 0;
    int last = arr.size()-1;

    // Using first and last as the two index reference.
    while (first<=last) {
        int mid = first + (last - first) /2;

        if (arr[mid]==target) {
            // increase the number of count
            count++;
            mid++;
        }
        else if (arr[mid] < target) {
            first = mid+1;}
        else {
            last = mid -1;
        }
    }

    return count;
}

int countFreq(vector<int> &arr, int target) {
    int l = lower_bound(arr.begin(), arr.end(), target) - arr.begin();
    int r = upper_bound(arr.begin(), arr.end(), target) - arr.begin();
    // Return the differnce between upper
    // bound and lower bound of the target
    return r - l;
}

// Example Binary Search
// int fixedPoint(vector<int> &arr) {
//     int low = 0, high = arr.size()-1;

//     while (low <= high) {
//         int mid = low + (high - low) / 2;

//         if (arr[mid] == mid) {
//             return mid;
//         } else if (arr[mid] < mid) {
//             low = mid + 1;
//         } else {
//             high = mid - 1;
//         }
//     }
//     return -1;
// }


int main()
{
    vector<int> arr = {1, 1, 2, 2, 2, 2, 3};
    // int target = 3;
    // int ans = 0;
    // for (int i : arr)
    // {
    //     if (i == target)
    //         ans++;
    // }
    // cout << ans << endl;
    int t = 2;
    cout << countFreq(arr, t);

    return 0;
}