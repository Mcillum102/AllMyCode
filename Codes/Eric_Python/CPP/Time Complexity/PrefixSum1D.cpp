#include <iostream>
using namespace std;

void prefixSum1D(int arr[], int n, int prefixSum[]) {
    prefixSum[0] = arr[0]; // first element is same as input array
    for (int i = 1; i < n; i++) {
        prefixSum[i] = prefixSum[i - 1] + arr[i]; // calculate prefix sum
    }
}

int main() {
    int arr[6] = {1, 6, 4, 2, 5, 3};            // input array
    int n = sizeof(arr) / sizeof(arr[0]);       // size of array
    int prefixSum[n];                           // prefix sum array
    prefixSum[0] = arr[0];                      // first element is same as input array
    // prefixSum = {1, ?, ?, ?, ?, ?}
    prefixSum1D(arr, n, prefixSum);             // function call to calculate prefix sum
    int x = prefixSum[5] - prefixSum[2];        // sum of elements from index 3 to 5
}