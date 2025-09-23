
    vector<int> coins = {1,2,5,10,20,50,100,200};
    int money = 120;

    // create a result vector to hold used coins
    vector<int> used;
    // Start an iteration from the back of the vector coins.
    for (int i = coins.size() - 1; i > 0; i--) {
        // If we can always choose the largest coin possible, we keep choosing it until we cannot.
        int curr_coin = coins.at(i);
        while (money >= curr_coin) {
            used.push_back(curr_coin);    // add the possible coin into used
            money -= curr_coin;
        }
    }
    cout << "The coins used are: ";
    for (int j : used) {
        cout << j << " ";
    }
    cout << endl;
}