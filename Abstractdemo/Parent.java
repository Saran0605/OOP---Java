package Abstractdemo;
//abstract classes are not for solving to have multiple inheritance so we need interface
 abstract public class Parent {

    //abstract constructors are not allowed
    //abstract methods are not allowed as static methods cant be override
    //but can create static methods called using class name
    abstract void career(String name);
    abstract void partner(String name,int age);
}
