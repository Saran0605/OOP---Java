package Practice.Sol3;

public class Car extends Vehicle implements Serviceable {
    static int tyres = 4;

    public Car(String brand, int year, String model) {
        super(brand, year, model);
    }

    public void start(){
        System.out.println("Car starts");
    }
    public void stop(){
        System.out.println("Car stops");
    }

    @Override
    public void service() {
        if(tyres==4){
            System.out.println("Oil Change"+" "+"engine check");
        }
    }

}
