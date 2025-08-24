#include <iostream>
#include <string>

using namespace std;

int main() {
    string str = "Hello";
    string &str1 = str;
    string* str2 = &str;
    // * symbol behind the type will make it into a pointer
    // A pointer stores the memory address of the object 
    // (a reference will be stored in a pointer)

    // & symbol in front of var will make it into a reference
    // A reference refers to another object
    str = "car";
    str1 = "new";

    cout << str << "\n";
    cout << str1 << "\n";
    cout << str2 << "\n";
    // output reference without & will show the same value it refers
    // output with & will show the memory address
}