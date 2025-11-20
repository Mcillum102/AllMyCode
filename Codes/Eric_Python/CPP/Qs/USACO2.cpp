#include <iostream>
#include <vector>
#include <string>
#include <sstream>
using namespace std;

int main()
{
    vector<int> answers;
    // number of test cases (input)
    int testCases;
    cin >> testCases;

    cin.ignore(1024, '\n');

    // repeat by testcases time, accept more inputs
    while (testCases > 0)
    {
        int maxHeight; // also is the number of cows
        cin >> maxHeight;

        cin.ignore(1024, '\n');

        string cowInput;
        vector<int> cows;

        getline(cin, cowInput);
        stringstream ss(cowInput);
        int cow;

        while (ss >> cow)
        {
            cows.push_back(cow);
        }

        int count = 1; // symmetric cows count;
        // using index form to write the for loop
        for (int i = 1; i < maxHeight; ++i)
        {
            // compare the current number with previous number to see if it's larger
            // compare i to i-1
            if (cows.at(i) > cows.at(i-1))
            {
                // if it's larger, it means we are able to form increasing pattern
                count++;
            }
        }
        answers.push_back(count); // add all counts into a vector for output

        count = 0; // reset count for the next testcase
        testCases--;
    }

    // repeat the answers to output all the results
    for (int a : answers)
    {
        cout << a << endl;
    }
}