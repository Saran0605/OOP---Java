package Practice.Sol5;

public class Main {
    public static void main(String[] args) {
        EmployeeManagement mt = new EmployeeManagement();
        Employee emp1 = new Manager(100,"Mohit",100000,25000);
        Employee dev1 = new Developer(101,"Saran",40000,"Java");
        mt.addEmployee(emp1);
        mt.addEmployee(dev1);
//        mt.displayAll();
//        System.out.println(mt.fetchById(101));
        mt.displayAll();
        mt.deleteEmployee(100);
        System.out.println("hiiii");
        mt.displayAll();
        mt.fetchById(100);
        mt.updateEmployeeSalary(101,300000);
        mt.displayAll();

    }
}
