#include <iostream>
#include <vector>
#include <algorithm>
#include <map>

// Use namespace std as requested in our previous conversation
using namespace std;

// Structure to hold cow types
struct Cow {
    int w, a; // weight, count
};

// Comparison function to sort cow types by weight
bool compareCows(const Cow& c1, const Cow& c2) {
    return c1.w < c2.w;
}

int main() {
    int n;
    int m, k;
    cin >> n >> m >> k;

    vector<Cow> tower(n);
    for (int i = 0; i < n; ++i) {
        cin >> tower[i].w >> tower[i].a;
    }

    // 1. Sort all cow types by weight
    sort(tower.begin(), tower.end(), compareCows);

    int total_cows_used = 0;
    int current_towers_count = 0;
    
    // 2. Map to store: key = bottom_weight, value = count_of_towers
    map<int, int> towers;

    // 3. Iterate through cows from lightest to heaviest
    for (int i = 0; i < n; ++i) {
        int w = tower[i].w;
        int a = tower[i].a;
        
        int cows_to_place = a;

        // --- Step 1: Try to extend existing towers ---
        // We greedily match with the lightest available tower bottoms
        // that satisfy the condition (it->first <= w - k).
        auto it = towers.begin();
        while (cows_to_place > 0 && it != towers.end()) {
            
            // Check if this tower's bottom is light enough to build on
            if (it->first <= w - k) {
                int bottom_weight = it->first;
                int num_towers_with_this_bottom = it->second;

                // We can match min(cows_we_have, towers_available)
                int num_to_match = min(cows_to_place, num_towers_with_this_bottom);

                // Add these cows to the total
                total_cows_used += num_to_match;
                cows_to_place -= num_to_match;

                // These 'num_to_match' towers no longer end at 'bottom_weight'.
                // They now end at the new weight 'w'.
                towers[w] += num_to_match;
                it->second -= num_to_match;

                // If all towers of this bottom_weight are used, erase it
                if (it->second == 0) {
                    // map::erase(iterator) returns the next valid iterator
                    it = towers.erase(it);
                } else {
                    ++it;
                }
            } else {
                // This tower (and all subsequent) are too heavy
                // (it->first > w - k), so we can't extend them.
                break;
            }
        }

        // --- Step 2: Use remaining cows to start new towers ---
        if (cows_to_place > 0 && current_towers_count < m) {
            // We can start at most 'm - current_towers_count' new towers
            int num_to_start = min(cows_to_place, m - current_towers_count);

            total_cows_used += num_to_start;
            current_towers_count += num_to_start;
            
            // Add these new towers, which all have a bottom weight of 'w'
            towers[w] += num_to_start;
        }
    }

    // 4. Output the final answer
    cout << total_cows_used << endl;

    return 0;
}