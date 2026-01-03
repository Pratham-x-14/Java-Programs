public class EmployeeManagementSystem
{
    public static void main(String args[])
    {
        int number = Integer.parseInt(IO.readln());
        String name = IO.readln();
        double salary = Double.parseDouble(IO.readln());

        Employee emp = new Employee(number , name , salary);
        

        IO.print("--- Updated Employee Details ---");
		IO.println();
        double increment = Double.parseDouble(IO.readln());
        double updatedSalary = emp.getEmployeeSalary() + increment;
        emp.setEmployeeSalary(updatedSalary);
        IO.println(emp);
        //IO.println();
        IO.print(emp.getEmployeeDesignation(updatedSalary));
        //IO.print(emp.getEmployeeDesignation(updatedSalary));



    }
}
 class Employee
{
    private int employeeNumber;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeNumber , String employeeName , double employeeSalary)
    {
        this.employeeNumber = employeeNumber;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeNumber()
    {
       return this.employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeName()
    {
        return this.employeeName;
    }
    public void setEmployeeName(String employeeName)
    {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary()
    {
        return this.employeeSalary;
    }
    public double setEmployeeSalary(double employeeSalary)
    {
        return this.employeeSalary = employeeSalary;
    }

    public String getEmployeeDesignation(double updatedSalary)
    {
        if(updatedSalary == 120000)
        {
            return "Employee is a HR Manager.";
        }
        else if(updatedSalary == 90000)
        {
            return "Employee is a Developer.";
        }
        else if(updatedSalary == 60000)
        {
            return "Employee is a Designer.";
        }
        else
        {
            return "Employee is a Tester.";
        }
    }

    public String toString()
    {
        return "\nEmployee Number : " + employeeNumber +
               "\nEmployee Name   : " + employeeName +
               "\nEmployee Salary : " + employeeSalary;
    }    
}   






/*
public class TestEmployee          //doubt running infinitly in test case
{
    void main()
    {
        while(true)
        {
            var name = IO.readln();
            var idstr = IO.readln();
            if(idstr == null || idstr.isEmpty())
            {
                IO.println("Id cannot be null or empty");
                continue;
            }
            var id = Integer.parseInt(idstr);
            var department = IO.readln();
            var salary = Double.parseDouble(IO.readln());

            var emp = Employee.createEmployeeObject(name , id , department , salary);
            IO.println(emp);

            IO.println(emp.calculateAnnualSalary());

            IO.println("Enter your choice (yes/no)");
            var choice = IO.readln();
            if(choice.equalsIgnoreCase("No"))
            {
                break;
            }
        }
    }
}
class Employee
{
    private String name;
    private int id;
    private String department;
    private double salary;

    private Employee(String name , int id , String department , double salary)
    {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public static Employee createEmployeeObject(String name , int id , String department , double salary)
    {
        return new Employee(name , id , department , salary);
    }

    public double calculateAnnualSalary()
    {
        double annualSalary = salary*12;

        double bonus = switch(department)
        {
            case "Sales" -> annualSalary*0.10;
            case "Engineering" -> annualSalary*0.15;
            case "HR" -> annualSalary*0.08;
            default -> annualSalary*0.05;
        };
        return annualSalary + bonus;
    }

    public String toString()
    {
        return "Name is : " + name +
               ", Id is : " + id +
               ", department is : " + department +
               ", Salary is : " + salary;
    }


                                
            
            

}




*/