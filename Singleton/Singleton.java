package Singleton;

public class Singleton {
Singleton(){
    System.out.println("Object created");
}
    private static Singleton obj;

    public static Singleton getInstance(){
        if(obj == null){
            obj = new Singleton();
        }
        return obj;
    }

}