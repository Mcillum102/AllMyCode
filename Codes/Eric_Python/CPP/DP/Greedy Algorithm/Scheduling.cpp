#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

struct Event {
    char name;
    int start;
    int end;
};

// A method that can select the max number of events
vector<Event> selectMaxEvents(vector<Event> events) {
    if (events.size() == 0) {
        return {};
    }

    sort(events.begin(), events().end());
}


int main() {
    // Each line under that has a {} is considered 1 event structure
    vector<Event> events = {
        {'A', 1, 3},
        {'B', 2, 5},
        {'C', 3, 9},
        {'D', 6, 8}
    };


}