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

    sort(events.begin(), events.end(), [](const Event& a, const Event& b) {
        return a.end < b.end;
    });

    vector<Event> scheduled;

    scheduled.push_back(events[0]);
    int end_time = events[0].end;

    for (int i = 1; i < events.size(); ++i) {   // we use ++i. It means we increment i after we check the condition. i value will be different at the end of loop comparing to i++
        if (events[i].start >= end_time) {
            Event e = events[i];
            scheduled.push_back(e);
            end_time = e.end;
        }
    }
    return scheduled;
}


int main() {
    // Each line under that has a {} is considered 1 event structure
    vector<Event> events = {
        {'A', 1, 3},
        {'B', 2, 5},
        {'C', 3, 9},
        {'D', 6, 8}
    };

    vector<Event> result = selectMaxEvents(events);

    for (const auto& e : result) {
        cout << "Event " << e.name << " [Start: " << e.start << ", End: " << e.end << "]" << endl;
    }

}