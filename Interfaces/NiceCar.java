package Interfaces;

public class NiceCar {
    private Engine engine;
    private Media player;

    public NiceCar(){
        engine = new PowerEngine();
    }
    public NiceCar(Engine engine,Media player){
        this.engine = engine;
        this.player = player;
    }
    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }

    public void startMedia(){
        player.start();
    }
    public void stopMedia(){
        player.stop();
    }



}
