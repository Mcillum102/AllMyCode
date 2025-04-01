#include <iostream>

using namespace std;

int main() {
    int K, m;
    cin >> K >> m;
    vector<int> invitees;
    for (int i = 1; i <= K; i++) {
        invitees.push_back(i);
    }

    for (int round = 0; round < m; round++) {
        int r;
        cin >> r;
        vector<int> remaining;
        for (int i = 0; i < invitees.size(); i++) {
            if ((i + 1) % r != 0) {
                remaining.push_back(invitees[i]);
            }
        }
        invitees = remaining;
    }

    sort(invitees.begin(), invitees.end());
    for (int invitee : invitees) {
        cout << invitee << endl;
    }
    
    return 0;
}