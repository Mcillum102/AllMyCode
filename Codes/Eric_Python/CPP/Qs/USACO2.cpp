#include <bits/stdc++.h>
using namespace std;

// int main()
// {
//     vector<int> answers;
//     // number of test cases (input)
//     int testCases;
//     cin >> testCases;

//     cin.ignore(1024, '\n');

//     // repeat by testcases time, accept more inputs
//     while (testCases > 0)
//     {
//         int maxHeight; // also is the number of cows
//         cin >> maxHeight;

//         cin.ignore(1024, '\n');

//         string cowInput;
//         vector<int> cows;

//         getline(cin, cowInput);
//         stringstream ss(cowInput);
//         int cow;

//         while (ss >> cow)
//         {
//             cows.push_back(cow);
//         }

//         int count = 1; // symmetric cows count;
//         // using index form to write the for loop
//         for (int i = 1; i < maxHeight; ++i)
//         {
//             // compare the current number with previous number to see if it's larger
//             // compare i to i-1
//             if (cows.at(i) > cows.at(i-1))
//             {
//                 // if it's larger, it means we are able to form increasing pattern
//                 count++;
//             }
//         }
//         answers.push_back(count); // add all counts into a vector for output

//         count = 0; // reset count for the next testcase
//         testCases--;
//     }

//     // repeat the answers to output all the results
//     for (int a : answers)
//     {
//         cout << a << endl;
//     }
// }

int main() {
    /*
    1. Improve input taking
    2. Add more conditions to make things considered symmetric
    3. Shorten the code
    */
    int T; cin >> T;    // T means the number of testcases
    while (T--) {       // This is a short hand while loop that will end when T == 0
        int cows; cin >> cows;    // This is the number of cows each testcase
        // Use map to store the cows. map<> in c++ is similar to dict in Python
        map<int, int> heightFrequency;  // the first int is the height. the second int is the frequency of that height
        for (int i = 0; i < cows; i++) {
            int h; cin >> h;    // h is the height of the cow
            heightFrequency[h]++;       // This steps means, for height h in hF map, we increase the frequency of it
        }
        int maxSize = 1;
        for (const auto& e : heightFrequency) {
            int peak = e.first;
            int peakCows = heightFrequency[peak];

            if (peakCows == 0) continue;
            // For all heights that are shorter than peak, we use pairs
            int size = 1;   // 1 cow with peak height
            int remainCow = peakCows - 1;   // remaining cows without peak

            for (const auto& lower : heightFrequency) {
                if (lower.first >= peak) break;
                int available = lower.second;   // When the height is shorter than peak, we need to know how many cows we are using to make symmetric
                size += (available / 2) * 2;
            }
            size += (remainCow / 2) * 2;
            maxSize = max(size, maxSize);
        }
        
        cout << maxSize << endl;
    }
}