package Practice.Sol4;

abstract class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    abstract double calculateSalary();

    public String displayDetails(){
        return this.name + " " +this.salary;

    }
}
