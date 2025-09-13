package Practice.Sol3;

abstract public class Vehicle {
    String brand;
    String model;
    int year;

    public Vehicle(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    abstract void start();
    abstract void stop();
    public String displayDetails()
    {
        return this.brand +" "+ this.model+" "+this.year;
    }


}
