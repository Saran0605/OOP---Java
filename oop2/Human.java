package oop2;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    //static variable will be common to all object
    static long population;

    public Human(int age, String name,int salary,boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
}
