package Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("power start");
    }

    @Override
    public void stop() {
        System.out.println("Power stops");

    }

    @Override
    public void acc() {
        System.out.println("Power accc");

    }
}
