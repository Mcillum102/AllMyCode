#include <iostream>
#include <string>
using namespace std;

// TODO: Create a struct called "Student" with the following properties:
// - name (string)
// - age (int) 
// - grade (int)
// - favorite_subject (string)
//
// Then complete the functions below!

// Your struct goes here:
struct Student {
    string name;
    int age;
    int grade;
    string subject;

    // Constructor
    Student() : name(""), age(0), grade(0), subject("") {}
    Student(string name, int age, int grade, string subject) : name(name), age(age), grade(grade), subject(subject) {}
};

// Function to create and return a new Student
// TODO: Complete this function
Student createStudent(string name, int age, int grade, string subject) {
    // Your code here
    // To create an object:
    // 1. The type of your object 
    // 2. Variable name for the object
    //  =
    // 3. new (only for pointers)
    // 4. Constructor
    Student newStudent = Student(name, age, grade, subject);
    return newStudent;
}

// Function to display student information
// TODO: Complete this function
void displayStudent(Student s) {
    // Your code here - print all student info in a nice format
    // Ex: [John] is [12] years old in grade [7]. He likes [Math].
    // [] are where you will put variables

    // For most of void functions, you can use cout to print some information out.
    // s in the top is a Student object, it contains the identities we set. use s.name to out put the name
    cout<<s.name;
}

// Function to check if a student is in high school (grade 9-12)
// TODO: Complete this function
bool isHighSchool(Student s) {
    // Your code here - return true if grade is 9, 10, 11, or 12
}

int main() {
    cout << "=== Student Information System ===" << endl;
    Student s1 = createStudent("John", 12, 7, "Math");
    displayStudent(s1);
    // TODO: Create 3 different students using your createStudent function
    // Example: Student student1 = createStudent("Alice", 14, 9, "Math");
    
    // TODO: Display all students using your displayStudent function
    
    // TODO: Check and display which students are in high school using your isHighSchool function
    
    cout << "\n=== Challenge ===" << endl;
    // TODO: Create an array of 5 students and find the student with the highest grade
    
    return 0;
}
