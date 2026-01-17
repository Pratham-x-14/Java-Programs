public class ZooManagementSystem
{
    void main()
    {
        var name = IO.readln();
        var hasFur = Boolean.parseBoolean(IO.readln());
        var breed = IO.readln();
        
        Dog tuffy = new Dog(name , hasFur , breed);
        IO.println(tuffy);
    }
}

class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return "Animal[getName()="+this.name+"]";
    }
}

class Mammal extends Animal
{
    private boolean hasFur;

    public Mammal(String name , boolean hasFur)
    {
        super(name);
        this.hasFur = hasFur;
    }

    public boolean isHasFur()
    {
        return this.hasFur;
    }
    public void setHasFur(boolean hasFur)
    {
        this.hasFur = hasFur;
    }

    public String toString()
    {
        return "Animal [getName()="+getName()+", isHasFur()="+isHasFur()+"]";
    }
}

class Dog extends Mammal
{
    private String breed;

    public Dog(String name , boolean hasFur , String breed)
    {
        super(name , hasFur);
        this.breed = breed;
    }

    public String getBreed()
    {
        return this.breed;
    } 

    public void setBreed(String breed)
    {
        this.breed = breed;
    }

    public String toString()
    {
        return "Dog [getName()="+getName()+", isHasFur()="+isHasFur()+", breed="+getBreed()+"]";
    }
}