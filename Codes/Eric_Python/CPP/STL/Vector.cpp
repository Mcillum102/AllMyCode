#include <iostream>
#include <vector>
using namespace std;

// This is for array
int main() {
    // C++ vectors are very similar to Python list
    // Vectors do not need to set size
    // int vector
    vector<int> v_int;                                      // Condition 1
    vector<int> v_int1 = {1,2,3,4,5,6,7,8,9,0,10};          // Condition 2

    // methods:

    // getting values
    // get the first element in vector: .front()
    cout << v_int1.front() << " ";
    // get the last element in vector:  .back()
    cout << v_int1.back() << " ";
    // get value at specific index:     .at()
    cout << v_int1.at(6) << " ";
    // this method can also change value at index
    v_int1.at(8) = 99;
    cout << v_int1.at(8) << " ";

    // add elements:        .push_back()
    // adding a value at the back of the vector, so we need to provide the value we want to add
    v_int1.push_back(1000);
    
    // remove elements:     .pop_back()
    // removing a value at the end of the vector, don't enter anything to be removed
    v_int1.pop_back();

    // telling how many items are there in vector:  .size()

    // checking if the vector is empty:     .empty()
    // Either true of false
}