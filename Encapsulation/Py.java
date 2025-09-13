package Encapsulation;

public class Py {
    public static void main(String[] args) {
        Lang python = new Lang();
        python.name = "Python";//variable without private can be accesigble
        //but variable with private (encapsulated) can be accesed only getters and setters
        python.setApi(450);
        System.out.println(python.getApi());
    }
}
