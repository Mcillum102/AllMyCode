#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    
    int numberOfTestCases;
    cin >> numberOfTestCases;
    
    while (numberOfTestCases--) {
        int numberOfCows;
        cin >> numberOfCows;
        
        map<int, int> heightFrequency;   // sorted map so we can easily look at lower heights
        for (int i = 0; i < numberOfCows; i++) {
            int height;
            cin >> height;
            heightFrequency[height]++;
        }
        
        int largestPossiblePhoto = 1;     // always possible with one cow
        
        // Try every possible height as the peak height
        for (const auto& peakPair : heightFrequency) {
            int peakHeight = peakPair.first;
            int countAtPeak = heightFrequency[peakHeight];
            
            if (countAtPeak == 0) continue;
            
            int currentPhotoSize = 1;                    // one cow is the peak
            int remainingAtPeak = countAtPeak - 1;       // cows of peak height left after using one for peak
            
            // Add mirrored pairs from heights STRICTLY LESS than the peak
            for (const auto& lowerPair : heightFrequency) {
                if (lowerPair.first >= peakHeight) break;   // only strictly lower
                currentPhotoSize += (lowerPair.second / 2) * 2;
            }
            
            // Add mirrored pairs from the remaining cows of the peak height itself
            currentPhotoSize += (remainingAtPeak / 2) * 2;
            
            largestPossiblePhoto = max(largestPossiblePhoto, currentPhotoSize);
        }
        
        cout << largestPossiblePhoto << "\n";
    }
    return 0;
}