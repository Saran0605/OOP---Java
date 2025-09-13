package Singleton;

public class Main {
    public static void main(String[] args) {
        //first time obj will created
        Singleton obj = Singleton.getInstance();
        //after anytime the object will be same and will onyl one

        Singleton obj2 = Singleton.getInstance();

    }
}
