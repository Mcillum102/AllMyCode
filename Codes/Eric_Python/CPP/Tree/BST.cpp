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
// identities/attributes/fields/properties
    int value;
    Node* left;
    Node* right;
// The two pointers, left and right are represeting the address we will put for the potiential child node

// If we want to create struct contain value, a constructor must be here
// The name of the consturctor must match the struct name
// Node: for those that you know the type >> (type parameters) : identities(parameters)
//       for those that you may not have type or pointes >> identities(nullptr)
// nullptr means null, nothing contained in the variable
    Node() : value(0), left(nullptr), right(nullptr) {}
    Node(int val) : value(val), left(nullptr), right(nullptr) {}
};

Node* createTree(vector<int> numbers) {
    // If the vector is empty, return nullptr. Prevent the program from crashing.
    if (numbers.empty()) {
        return nullptr;
    }

    Node* root = new Node(numbers.at(0));
    
    for (int i = 1; i < numbers.size(); i++) {
        Node* current = root;
        Node* newNode = new Node(numbers.at(i));
        
        while (true) {
            // For pointers, we use -> to access the value.
            if (numbers.at(i) < current->value) {
                if (current->left == nullptr) {
                    current->left = newNode;
                    break;
                } else {
                    current = current->left;
                }
            } else {
                if (current->right == nullptr) {
                    current->right = newNode;
                    break;
                } else {
                    current = current->right;
                }
            }
        }
    }
    
    return root;
}

void printTree(Node* root) {
    if (root == nullptr) {
        return;
    }
    
    cout << "[";
    
    // Print left subtree
    printTree(root->left);
    
    // Print current node
    cout << root->value;
    
    // Print right subtree
    printTree(root->right);
    
    cout << "]";
}

int main() {
    vector<int> numbers;
    numbers.push_back(13);
    numbers.push_back(7);
    numbers.push_back(15);
    numbers.push_back(3);
    numbers.push_back(8);
    numbers.push_back(14);
    numbers.push_back(19);
    numbers.push_back(18);
    cout << numbers.size() << endl;     // endl means new line ("\n")
    Node* tree = createTree(numbers);
    
    cout << "BST as list: ";
    printTree(tree);
    cout << endl;
    
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
