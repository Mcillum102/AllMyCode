#include <iostream>
using namespace std;

// This is for array
int main() {
    // how to create an int array
    // we first declare the array type; followed by array name with [] at end
    // all arrays in c++ has to have a standard size
    int arr[4] = {1,2,3,4};        // condition 1
    // int arr1[5];                   // condition 2, empty array. Default stores 0s inside the array

    // string arrays
    string arr2[8];
    string arr3[3] = {"A", "B", "C"};
    
    // How do I output data in array?
    // cout << arr[3] << "\n";

    for (int i : arr) {
        cout << i << " ";
    }
    // the index for loop is not often used because it's not precise
    // the is not a direct way to get the size of array unless
    for (int i = 0; i < 5; i++) {}

    // get the size of array
    // sizeof() method returns the size of array in bytes
    int arr_size = sizeof(arr) / sizeof(arr[0]);

    // Question practice:
    /*  First, write a code that creates an int array by itself. 
        The array should contain numbers from 20 - 50, include 50.
        Think about an easy way to do it.
        // array has set size, cannot add or remove
        arr[1] = 10;    Use this technique to set values for array

        After creating the array, write a code that changes all the even numbers to 100
    */
    int arr1[30];
    // repeat adding a value at each index, the index is increasing, the value is alos increasing
    int value=20;
    for (int i=0;i<30;i++) {
        arr1[i]=value;
        value++;
    }
    for (int i=0;i<30;i++) {
        if (arr1[i]%2==0) {
            arr1[i]=100;
        }
        cout << arr1[i] << " ";
    }
}