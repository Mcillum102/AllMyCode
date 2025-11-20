#include <iostream>
#include <vector>
#include <sstream>
#include <string>

int main()
{
    std::vector<int> numbers;
    std::string line;

    std::cout << "Enter numbers separated by spaces: ";
    std::getline(std::cin, line); // Read the whole line

    std::stringstream ss(line);
    int num;

    // Extract integers from the stringstream
    while (ss >> num)
    {
        numbers.push_back(num);
    }

    // Output the numbers to verify
    std::cout << "You entered: ";
    for (int n : numbers)
    {
        std::cout << n << " ";
    }
    std::cout << "\n";

    return 0;
}