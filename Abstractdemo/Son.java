package Abstractdemo;

public class Son extends Parent {
    @Override
    void career(String name) {
        System.out.println("Iam gonna be an " + name);
    }

    @Override
    void partner(String name, int age) {
        System.out.println("I Love"+name+" and her age is "+age);

    }
}
