-- Create a sample table
CREATE TABLE Employees (
    EmployeeID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Department VARCHAR(50),
    Salary DECIMAL(10, 2)
);

-- Insert sample data
INSERT INTO Employees (EmployeeID, FirstName, LastName, Department, Salary)
VALUES
(1, 'John', 'Doe', 'Engineering', 75000.00),
(2, 'Jane', 'Smith', 'Marketing', 65000.00),
(3, 'Alice', 'Johnson', 'HR', 60000.00),
(4, 'Bob', 'Brown', 'Engineering', 80000.00);

-- Query the data
SELECT * FROM Employees;

-- Update a record
UPDATE Employees
SET Salary = 70000.00
WHERE EmployeeID = 3;

-- Delete a record
DELETE FROM Employees
WHERE EmployeeID = 2;

-- Drop the table
DROP TABLE Employees;