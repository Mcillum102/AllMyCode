#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

// Calculate the sum of the vector and store into summary vector
void generate_sum(const vector<int>& arr, int index, int curr_sum, vector<int>& sums) {
    // When we reach the end of arr (A or B), we stop
    if (index == arr.size()) {
        sums.push_back(curr_sum);
        return;     // We are allowed to return a void function C++
    }

    // move to the next index and add the value, has not considered the starting index arr[index].
    generate_sum(arr, index + 1, curr_sum, sums);
    generate_sum(arr, index + 1, curr_sum + arr[index], sums);
}

// Find out if it is possible to have a subset for x (target)
bool sum_in_middle(const vector<int>& nums, int x) {
    int n = nums.size();
    // After recursion all elements, if no answer matches x, we return false.
    if (n == 0) {
        return x == 0;
    }

    int mid = n / 2;
    vector<int> A(nums.begin(), nums.begin() + mid);    // this technique choose the range of vector from nums
    // Vector B will start with the ending index of A
    vector<int> B(nums.begin() + mid , nums.end());

    // For odd number vectors, A will have 1 more element than B.

    vector<int> S_A;    // summarizes all possible sums of the subsets in A
    // Generate sum for A. Starting at index 0 with 0 as sum. Put result into S_A
    generate_sum(A, 0, 0, S_A);

    vector<int> S_B;    // summarizes all possible sums of the subsets in B
    // Generate sum for A. Starting at index 0 with 0 as sum. Put result into S_A
    generate_sum(B, 0, 0, S_B);

    sort(S_B.begin(), S_B.end());

    // iterator through all elements in A and B
    for (int s_a: S_A) {
        int goal = x - s_a;     // the goal here means the required sum we want to find in S_B after minus 1 possible value in S_A
        // we apply a binary search to S_B to find if it's possible to get a goal
        if (binary_search(S_B.begin(), S_B.end(), goal)) {
            return true;
        }
    }
    return false;
}


int main() {
    vector<int> nums = {2, 4, 5, 9};
    int target = 15;

    if (sum_in_middle(nums, target)) {
        cout << "For vector {2,4,5,9}, we can find the target sum 15" << endl;
    } else {
        cout << "For vector {2,4,5,9}, we cannot find the target sum 15" << endl;
    }
}