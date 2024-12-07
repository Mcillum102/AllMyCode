# Parent: an abstract class name that can be used as a genral thing
class Job:
    # Properties
    salary = 0
    
    # Constructor
    def __init__(self, salary, balance):
        self.salary = salary
        self.balance = balance
        
    # Methods
    def payday(self):
        self.balance += self.salary
        print(f"You have been paid! Your balance is {self.balance}")


# Child : it has access to all the properties and methods of the parent class
# Child can also have it's own properties and methods
class Cashier(Job):
    # Overriding __init__
    def __init__(self, name, salary, balance):
        # you must use super().__init__ or Parent.__init__ to call the parent constructor
        # super() is more suitable if you have multiple inheritance or you are not sure about the parent class
        # we must inherit all properties of the parent class in the bracket below
        super().__init__(salary, balance)
        self.name = name
    
    # Unique methods
    # This method should first test if the customer paid enough to the price.
    # If the customer paid enough, the method should return the change.
    def calculate_change(self, price, paid):
        if paid >= price:
            return f"Your change is {paid - price}"
        else:
            return "Not enough to pay"
        
        

cashier1 = Cashier("Ali", 2000, 10000)
cashier1.payday()
print(cashier1.calculate_change(60, 50))
print(cashier1.balance)