#include <iostream>
using namespace std;

int main() {
    int machines = 3;
    int products = 7;

    int machine_time[] = {3,2,5};
    int lo = 0, hi = 100;
    int answer = hi;

    while (lo <= hi) {
        int mid = lo + (hi - lo) / 2;

        int products_made = 0;
        for (int i = 0; i < machines; i++) {
            products_made += mid / machine_time[i];
            // mid 
            if (products_made >= products) {
                break;
            }
        }
    }
}