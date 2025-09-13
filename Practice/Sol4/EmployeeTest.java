package Practice.Sol4;

public class EmployeeTest {
    public static void main(String[] args) {
        Manager m = new Manager(100,"Mohit",100000,25000);
        Developer d = new Developer(405,"saran",8000,"JavaScript");
        System.out.println(m.calculateSalary());
        System.out.println(m.displayDetails());
        System.out.println(d.calculateSalary());
        System.out.println(d.displayDetails());
    }
}
