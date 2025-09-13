package Practice.Sol3;

import java.util.ArrayList;

public class VehicleTest {
    static ArrayList<Vehicle> li = new ArrayList<>();
    public static void main(String[] args) {
        Car car1 = new Car("BMW",2025,"M5");
        Bike bike1 = new Bike("Splendour",2022,"s4");
//        bike1.start();
//        car1.start();
//        System.out.println(bike1.displayDetails());
//        bike1.service();
//        car1.service();
        li.add(car1);
        li.add(bike1);
        for(Vehicle v : li){
            v.start();
            v.stop();
            if(v instanceof Serviceable) {
                ((Serviceable) v).service();
            }

        }



    }

}
