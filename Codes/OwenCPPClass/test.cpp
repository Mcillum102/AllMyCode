#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    srand(time(NULL));
    // try to print something
    cout << "Hello World!\n";

    // // primitive types
    // int num = 100;
    // double deci = 10.2;
    // cout << "The number is " << num << "\n"
    //      << deci << "\n";

    // // reference types
    // string name = "Owen";

    // input
    // create a variable to store your input

    /* Question 1:
        Write a code that will accept 3 different int.
        For these 3 numbers, please do the following:
        1. find the largest number
        2. calculated the average number
        output both results
    */
    cout << "MAGIC 8-BALL:\n\n";

    int answer = rand() % 6 + 3;

    cout << answer << "\n";

    /*  1 byte = 8 bits
        decimal 10 -> binary 00001010 (4 bits)
        int x = 10; x is taking 4 bytes (int) of memory

        int y = 1; y = 00000001, it's still taking 4 bytes

        int z = 20; 0001 0100
    */
}