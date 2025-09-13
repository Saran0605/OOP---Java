package Practice.Sol5;

public class Manager extends Employee{
    double bonus;

    public Manager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }
    public double calculateSalary(){
        return this.salary+this.bonus;
    }
}
