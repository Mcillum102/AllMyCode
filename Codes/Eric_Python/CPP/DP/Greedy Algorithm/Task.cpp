#include <iostream>
#include <vector>
#include <numeric>
#include <algorithm>
using namespace std;

struct Task {
    char task;
    int duration;
    int deadline;
};

int getMostPoints(vector<Task> tasks) {
    if (tasks.size() == 0) {
        return 0;
    }

    sort(tasks.begin(), tasks.end(), [](const Task& a, const Task& b) {
        return a.duration < b.duration;
    });

    int points = 0;
    int start_time = 0;
    /*  To calculate the points you get, you need to use tasks.deadline - tasks.duration,
        notice that tasks is the vector name. You need to first iterate through the vector
        and use objects to compare.
    */
    
    for (int i = 0; i < tasks.size(); ++i) {
        // calculate the points each event worth.
        Task t = tasks[i];  // t will represent each task in the vector
        // deadline - (duration + start_time) = points
        points += t.deadline - (t.duration + start_time);
        start_time += t.duration;
    }

    return points;
}

int main() {
    vector<Task> tasks = {
        {'A', 4, 2},
        {'B', 3, 5},
        {'C', 2, 7},
        {'D', 4, 5}
    };

    int score = getMostPoints(tasks);

    cout << "The max score will be " << score << endl;
}