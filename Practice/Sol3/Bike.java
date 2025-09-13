package Practice.Sol3;

public class Bike extends Vehicle implements Serviceable{
    static int tyres = 2;

    public Bike(String brand, int year, String model) {
        super(brand, year, model);
    }

    public void start(){
        System.out.println("Bike starts");
    }
    public void stop(){
        System.out.println("Bike stops");
    }

    @Override
    public void service() {
        if(tyres==2){
            System.out.println("chain librication alone");
        }
    }
}
