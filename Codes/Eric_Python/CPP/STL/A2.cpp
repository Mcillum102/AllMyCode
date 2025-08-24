#include <iostream>
#include <vector>
#include <iomanip>
#include <algorithm>
#include <string>
#include <cmath>
#include <array>
#include <set>
#include <list>
#include <tuple>
#include <queue>
#include <deque>
#include <stack>
#include <unordered_set>
#include <map>
#include <unordered_map>
using namespace std;

int main()
{
    list<string> cars = {"BMW", "BMW", "BMW", "Volkswagen", "Mercedes", "Tesla", "Tesla", "Tesla"};
    unordered_set<string> unique;
    for (auto element = cars.begin(); element != cars.end();)
    {
        // The begin() and end() methods do not contain any value itself. It is an interator
        if (unique.count(*element))
        // In C++, when a if condition is called; 0 will be false. any other number will be true.
        {
            element = cars.erase(element);
        // The erase() method will remove the value that the pointer is pointing to.
        // It also returns the pointer that's removed
        }
        else
        {
            unique.insert(*element);
            element++;
        // The line above moves the pointer to the next one
        }
    }
    for (string s : cars) {
        cout << s << "\n";
    }
}
