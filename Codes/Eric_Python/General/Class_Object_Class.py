# Almost everything in Python is an object, with its properties and methods
# A class is a "blueprint" for the object. Containing its properties and methods
# class namd and object TYPE are the same thing

# An Object is a bigger storage system for informations.
# Each object can contain many different values as it's properties
# A Class is not mandatory
# Class
class Gr4Student:
    # default properties
    grade = 4
    age = 9
    sleep_status = 'Not sleeping'
    
    # depending properties
    gender = ""
    name = ""
    nation = ""
    height = 0
    
    # Constructor creates properties that we assign to the object
    # __init__ means initialize the properties we can assign to each student in this class
    def __init__(self, gender, name, nation, height):
        self.gender = gender
        self.name = name
        self.nation = nation
        self.height = height
        
    # Functions (methods) is functions that the object can use
    # You want to also include self as one argument
    
    # Depeding on if a value is created by the function or not, you will choose between print and return based on the use of function
    def sleep(self):
        self.sleep_status = 'sleeping'
        print(f"{self.name} just feel asleep")
        
    def introduce(self):
        print('Hello, I am', self.name)
        
Student1 = Gr4Student('Male', 'Sam', 'Canada', 143)
Student2 = Gr4Student('Female', 'Sam', 'Canada', 131)

int1 = 10
str1 = "EHHL"
# Student2 = Gr4Student('Female')
Student1.introduce()
print(Student1.sleep_status)
print(Student1.sleep())
print(Student1.sleep_status)