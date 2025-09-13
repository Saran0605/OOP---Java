package Interfaces;

public class Car implements Engine, Brake, Media {
    @Override
    public void brake() {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start() {
        System.out.println("i start like engine");

    }

    @Override
    public void stop() {
        System.out.println("I stop like engine");

    }

    @Override
    public void acc() {
        System.out.println("I Accelerate");

    }
}
