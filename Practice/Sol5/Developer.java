package Practice.Sol5;

public class Developer extends Employee {
    String programmingLanguage;

    public Developer(int id, String name, double salary, String programmingLanguage) {
        super(id, name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateSalary(){
        return this.salary;
    }
}
