#include <iostream>
#include <vector>
#include <string>
using namespace std;

// struct: a self create "object" type that can contain more than one data at once.
struct Person {
    int age;
    string name;
};
// struct should also be closed with ;

// A tree is formed based on a special structure;
struct Node {
// identities
    int value;
    Node* left;
    Node* right;
// The two pointers, left and right are represeting the address we will put for the potiential child node

// If we want to create struct contain value, a constructor must be here
// The name of the consturctor must match the struct name
// Node: for those that you know the type >> (parameters) : identities(parameters)
//       for those that you may not have type or pointes >> identities(nullptr)
// nullptr means null, nothing contained in the variable
    Node(int val) : value(val), left(nullptr), right(nullptr) {}
};

int main() {
    vector<int> numbers = {13, 7, 15, 3, 8, 14, 19, 18};
    vector<Node> tree;
    
    for (int i = 0; i < 8; i++) {
        tree.push_back(Node(numbers.at(i)));
    }
    
    // the left and right are defaultly set to null. no need to declare here

    // Node type are used in trees
    // Person p1, p2, p3;
    // p1.age = 10;
    // p1.name = "Martin";

    // cout << p1.age;
    // cout << p1.name;
}

/*
                    13
            7               15
        3       8       14      19
                            18
When we record the tree into any iterator, we read topdown, leftright
*/