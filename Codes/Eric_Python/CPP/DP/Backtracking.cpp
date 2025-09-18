#include <iostream>
#include <vector>
#include <numeric>
using namespace std;
int n;
int count = 0;
vector<vector<int>> solutions;
vector<int> current_path;
vector<int> column, diag1, diag2;

void visualizeBoard(int y)
{
    cout << "\n--- Checking possibilities for row " << y << " ---" << endl;

    // Create a temporary 2D board representation
    vector<string> board(n, string(n, '.'));

    // 1. Mark all currently attacked squares with 'X'
    for (int row = 0; row < n; ++row)
    {
        for (int col = 0; col < n; ++col)
        {
            if (column[col] || diag1[col + row] || diag2[col - row + n - 1])
            {
                board[row][col] = 'X';
            }
        }
    }

    // 2. Place the queens that are already on the board from previous steps
    // The 'current_path' vector tells us where they are.
    for (int row = 0; row < current_path.size(); ++row)
    {
        board[row][current_path[row]] = 'Q';
    }

    // 3. Print the final visualized board
    for (int row = 0; row < n; ++row)
    {
        for (int col = 0; col < n; ++col)
        {
            cout << board[row][col] << " ";
        }
        cout << endl;
    }
    cout << "In row " << y << ", queens can be placed at '.' spots." << endl;
}

void search(int y)
{
    if (y == n)
    {
        count++;
        return;
    }
    for (int x = 0; x < n; x++)
    {
        if (column[x] || diag1[x + y] || diag2[x - y + n - 1])
            continue;
        visualizeBoard(y);
        column[x] = diag1[x + y] = diag2[x - y + n - 1] = 1;
        current_path.push_back(x);
        search(y + 1);
        current_path.pop_back();
        column[x] = diag1[x + y] = diag2[x - y + n - 1] = 0;
    }
}

int main()
{
    cout << "Enter the size of the board (n): ";
    cin >> n;

    column.resize(n, 0);
    diag1.resize(2 * n - 1, 0);
    diag2.resize(2 * n - 1, 0);
    search(0);
    cout << "number of solutions for a " << n << "x" << n << " board: " << count << endl;

    return 0;
}