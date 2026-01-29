public class SimpleVehicleInheritance
{
    void main()
    {
        Car car = new Car("Audi","Q8",2021,0);
        IO.println("Car Details");
        car.displayDetails();
        IO.println();
        Bike bike = new Bike("Yamaha","MT-07",2020,"Sports");
        IO.println("Bike Details");
        bike.displayDetails();
    }
}

class Vehicle
{
    protected String make; 
    protected String model; 
    protected int year;

    public Vehicle(String make , String model , int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
    } 

    public void displayDetails()
    {
        IO.println("Make: "+this.make);
        IO.println("Model: "+this.model);
        IO.println("Year: "+this.year);
    }
}

class Car extends Vehicle
{
    protected int numberOfDoors;

    public Car(String make , String model , int year , int numberOfDoors)
    {
        super(make , model , year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails()
    {
        if(numberOfDoors<=0)
        {
            System.err.println("Error Invalid Input");
            System.exit(0);
        }
        super.displayDetails();
        IO.println("Number of Doors: "+numberOfDoors);
    }
} 

class Bike extends Vehicle
{
    protected String type;

    public Bike(String make , String model , int year , String type)
    {
        if(year<=0)
        {
            System.err.println("Error Invalid Input");
            System.exit(0);
        }
        super(make,model,year);
        this.type = type;
    }
    public void displayDetails()
    {
        super.displayDetails();
        IO.println("Type: "+this.type);
    }
}