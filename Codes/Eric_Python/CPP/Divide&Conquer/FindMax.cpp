#include <iostream>
#include <vector>
using namespace std;

int findMax(vector<int> &arr)
{
    int low = 0, high = arr.size() - 1;
    while (low <= high)
    {
        int mid = low + (high - low) / 2;
        if ((mid == 0 || arr[mid - 1] < arr[mid]) && (mid == arr.size() - 1 || arr[mid + 1] < arr[mid]))
        {
            return arr[mid];
        }
        if (arr[mid] < arr[mid + 1])
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }
}

int main()
{
    vector<int> arr = {1, 2, 4, 5, 7, 8, 3};
    cout << findMax(arr) << endl;
    return 0;
}