/*Problem Description
Problem Description
Create a Java program that implements multilevel inheritance involving three
classes: Person, Employee, and Manager. The program should accept user input
and print all details using the final subclass.

Requirements
Class Person
String name
int age
Method: displayPersonDetails()

Class Employee (extends Person)
String employeeId
double salary
Method: displayEmployeeDetails()

Class Manager (extends Employee)
String department
Method: displayManagerDetails() -> must print all parent + child details

Main class
Read input from user
Create Manager object
Call method to print details
Constraints
age > 0
salary ≥ 0
name, employeeId, department cannot be empty strings
Use constructor chaining with super()

Input Format
name
age
employeeId
salary
department

Output Format
Name: <value>
Age: <value>
Employee ID: <value>
Salary: <value>
Department: <value>

Examples
Example 1
Input:
James Gosling
20
NIT123
32000
Development
Output:
Name: James Gosling
Age: 20
Employee ID: NIT123
Salary: 32000.0
Department: Development


         -----PROGRAM-----

public class displayDetails
{
    void main()
    {
        var name = IO.readln();
        var age = Integer.parseInt(IO.readln());
        var employeeId = IO.readln();
        var salary = Double.parseDouble(IO.readln());
        var department = IO.readln();

        Manager mg = new Manager(name , age , employeeId , salary , department);
        mg.displayManagerDetails();
        
    }
}

class Person
{
    protected String name;
    protected int age;

    public Person(String name , int age)
    {
        if(name == null || name.isEmpty())
        {
            System.err.println("Name cannot be empty");
            System.exit(0);
        }
        
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails()
    {
        IO.println("Name: " + this.name);
        IO.println("Age: " + this.age);
    }
}

    class Employee extends Person
    {
        protected String employeeId;
        protected double salary;

        public Employee(String name , int age , String employeeId , double salary)
        {
            super(name,age);
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public void displayEmployeeDetails()
        {
            displayPersonDetails();
            IO.println("Employee ID: " + this.employeeId);
            IO.println("Salary: " + this.salary);
        }
    }

class Manager extends Employee
{
    protected String department;
    
    public Manager(String name , int age , String employeeId , double salary , String department)
    {
        super(name , age , employeeId , salary);
        this.department = department;
    }

    public void displayManagerDetails()
    {
        displayEmployeeDetails();
        IO.println("Department: " + this.department);
    }
}

*/

/*

3) Write a Java program to create a class called Account with instance variables accountNumber accountHolderName and balance.
 Implement a parameterized constructor that initializes these variables with the following validations:
	1) accountNumber should not be empty.
	2) balance should not be negative.
Print an error message if the validation fails.

Examples
Example 1
Input:
Account Number: ACC101
Account Holder: Ravi
Balance: 5000
Output:
Account Number : ACC101
Account Holder : Ravi
Balance        : 5000.0

*/

/*

1) Write a Java program to demonstrate constructor overloading by creating a class Student.
The program should accept input from the user and initialize objects using different constructors based on the provided input.
Display the student details for each object.

Examples
Example 1
Input:
2
101
Ravi
Output:
Student Details:
Student ID   : 101
Student Name : Ravi
Student Age  : 0

*/