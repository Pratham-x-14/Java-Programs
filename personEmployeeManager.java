
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

