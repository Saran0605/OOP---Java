package staticPractice;

import org.w3c.dom.ls.LSOutput;

public class Main {
    int a = 10;
    static Main obj;

    public static void main(String[] args) {
        Main obj = new Main();
        obj.a = 20;
        System.out.print(obj.a);
        obj.greet();
        obj.fun();


    }
    public  void fun(){
        greet();
    }

    void greet(){
        System.out.println("Hiii daa");
    }
}
