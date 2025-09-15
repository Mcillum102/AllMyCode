#include <iostream>
#include <vector>
#include <numeric>
using namespace std;
int n;
vector<int> permutation;
vector<bool> chosen;

void search() {
    if (permutation.size() == n) {
        for (int i = 0; i < n; ++i) {
            cout << permutation[i] << " ";
        }
        cout << endl;
    } else {
        for (int i = 0; i < n; ++i) {
            if (chosen[i])
                continue;
            chosen[i] = true;
            permutation.push_back(i);
            search();
            chosen[i] = false;
            permutation.pop_back();
        }
    }
}

int main() {
    n = 3;
    chosen.resize(n, false);
    cout << "All permutations of {0, 1, 2， 3}:" << endl;
    search();
    return 0;
}