# Inheritance represents relationships between different classes.

# Parent class: Animal
class Animal:
    # Properties of the class are optional to be defined here
    # name = ""
    # color = ""
    # height = 0
    # sleep_time = 0

    def __init__(self, name, color, height, sleep_time, wake_time):
        self.name = name
        self.color = color
        self.height = height
        self.sleep_time = sleep_time
        self.wake_time = wake_time
   
    def late_sleep(self):
        if self.sleep_time > 23:
            print(f"{self.name} sleeps late")
        else:
            print(f"{self.name} sleeps on time")

    # who_sleeps_later is used to check if animal (self) that calls the function sleeps later than the one in ()
    def who_sleeps_later(self, other):
        if self.sleep_time > other.sleep_time:
            print(f"{self.name} sleeps later")
        else:
            print(f"{other.name} sleeps later")
        

# Inheritance: arent lass needs to be defined with the child class in parentheses.
# Child Class 1: SnowLeopard
class SnowLeopard(Animal):
    
    def __init__(self, name, color, height, sleep_time, wake_time):
        # super() function is used to call the __init__() of the parent class
        # You always have to call the __init__() of the parent class
        super().__init__(name, color, height, sleep_time, wake_time)
        
# Child Class 2: Cow
class Cow(Animal):
    
    def __init__(self, name, color, height, sleep_time, wake_time,is_milked):
        super().__init__(name, color, height, sleep_time, wake_time)
        self.is_milked = is_milked
        
    def can_be_milked(self):
        # I want to compare my sleep time with number 6. How can I do it?
        # To calculate the sleep time, you want to use wake time - sleep time.
        # Wake time might be very large, how do you make sure you get the correct hour for sleep time.
        # Ex: 20 - 5 gives us 9 hours of sleep time.
        
        if 24 - self.sleep_time + self.wake_time > 6:
            return True
        else:
            return False
    
    def milk(self):
        if self.can_be_milked():
            self.is_milked = True
            print(f"{self.name} is being milked")
        else:
            print(f"{self.name} cannot be milked")
    
cow1 = Cow("Bessie", "White", 5, 20, 5, False)
sl1 = SnowLeopard("10.6", "Silver", 9, 19, 4)

print(cow1.can_be_milked())
cow1.milk()
# Each child will be themselves. Does not inherit each other.
# sl1.milk()

# With the function/method in parent class, we can use them with different child classes at the same time
sl1.who_sleeps_later(cow1)