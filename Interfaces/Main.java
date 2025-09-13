package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.acc();
//        car.start();
//        car.stop();
//
//        Media carMed = new Car();
//        carMed.start();
        ElectricEngine engine = new ElectricEngine();
        CD player = new CD();

        NiceCar mycar = new NiceCar(engine,player);
        mycar.startEngine();
        mycar.startMedia();

    }
}
