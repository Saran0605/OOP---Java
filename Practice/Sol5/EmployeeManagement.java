package Practice.Sol5;

import java.security.spec.ECPoint;
import java.util.ArrayList;

public class EmployeeManagement {
     ArrayList<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e){
        list.add(e);
        System.out.println("Employee added succesfully");
    }
    public Employee fetchById(int id){
        for(Employee e : list){
            if(e.id == id) {
                return e;
            }
        }
        return null;
    }
    public void displayAll(){
        for(Employee e:list){
            System.out.println(e);
        }
    }
    public boolean updateEmployeeSalary(int id,double salary){
        for(Employee e:list){
            if(e.id == id){
                e.salary = salary;
                return true;
            }
        }
        return false;
    }
    public boolean deleteEmployee(int id){
        for(Employee e : list){
            if(e.id == id){
                list.remove(e);
                return true;
            }
        }
        return false;
    }

}
