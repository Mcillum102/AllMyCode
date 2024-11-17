# Almost everything in Python is an object, with its properties and methods
# A class is a "blueprint" for the object. Containing its properties and methods
# class namd and object TYPE are the same thing

# Class
class Gr4Student:
    # default properties
    grade = 4
    age = 9
    sleep_status = 'Not sleeping'
    
    # Constructor creates properties that we assign to the object
    # __init__ means initialize the properties we can assign to each student in this class
    def __init__(self, gender, name, nation, height):
        self.gender = gender
        self.name = name
        self.nation = nation
        self.height = height
        
    # Functions (methods) is functions that the object can use
    def sleep(self):
        self.sleep_status = 'sleeping'
        print('Student just feel asleep')
        
    def introduce(self):
        print('Hello, I am', self.name)
        
Student1 = Gr4Student('Male', 'Sam', 'Canada', 143)
# Student2 = Gr4Student('Female')
Student1.introduce()
print(Student1.sleep_status)
Student1.sleep()
print(Student1.sleep_status)