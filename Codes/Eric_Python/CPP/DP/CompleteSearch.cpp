#include <iostream>
#include <vector>
#include <numeric>
using namespace std;

int n;
vector<int> subset;

void search(int k) {
    if (k == n) {
        cout << "{ ";
        for (int x : subset) {
            cout << x << " ";
        }
        cout << "}" << endl;
    } else {
        search(k + 1);
        subset.push_back(k);
        search(k + 1);
        subset.pop_back();
    }
}

int main() {
    n = 3;
    cout << "All subsets of {0, 1, 2}:" << endl;
    search(0);
    return 0;
}