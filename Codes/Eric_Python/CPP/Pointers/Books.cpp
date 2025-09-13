#include <iostream>
#include <vector>
using namespace std;

int main() {
    int book = 4;
    int time = 5;
    int book_min[] = {3, 1, 2, 1};

    int left = 0, time_spent = 0;
    int max_books = 0;

    for (int right = 0; right < book; ++right) {
        // get the reading min for the first book and add it into my total time
        time_spent += book_min[right];

        while (time_spent > time) {
            time_spent -= book_min[left];
            left++;
        }

        max_books = max(max_books, right - left + 1);
    }
    cout << max_books << endl;
}