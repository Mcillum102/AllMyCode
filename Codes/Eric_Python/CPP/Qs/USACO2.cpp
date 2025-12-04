#include <iostream>
#include <vector>
#include <algorithm>

void solve() {
    int N;  // Number of cows and max height
    if (!(std::cin >> N))   return; // If no input is found, stop the method

    std::vector<int> freq(N + 1, 0);
    int max_h = 0;

    // The forloop repeats N times to accept cows
    for (int i = 0; i < N; ++i) {
        int h;  // small h is the height of the cow
        std::cin >> h;
        freq[h]++;  // For cows with height h, we increase the number
        if (h > max_h) {
            max_h = h;  // If a higher cow is found, replace max_h
        }
    }

    int pairs = 0;  // count the pairs on side of peak (max_h)
    for (int h = 1; h < max_h; ++h) {   // h basically means height
        if (freq[h] >= 2) {     // If we found more than 1 cow for this height
            pairs++;    // We count it as a useable pair
        }
    }

    std::cout << (pairs*2) + 1 << std::endl;
}

int main() {
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(NULL);

    int T;  // testcase
    if (std::cin >> T) {
        while (T--) {
            solve();    // solve each testcase one by one
        }
    }
    return 0;
}