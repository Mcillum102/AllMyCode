#include <iostream>
#include <vector>
using namespace std;

int fixedPoint(vector<int> &arr) {
    int low = 0, high = arr.size()-1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (arr[mid] == mid) {
            return mid;
        } else if (arr[mid] < mid) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return -1;
}

int main()
{
    vector<int> arr = {-10, -5, 0, 3, 7};
    for (int i = 0; i < arr.size(); i++)
    {
        if (arr[i] == i)
        {
            cout << i << endl;
            return 0;
        }
    }
    cout << -1 << endl;

    cout << "The answer from Binary Searcb is " << fixedPoint(arr) << endl;
}