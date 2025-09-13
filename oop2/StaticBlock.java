package oop2;

public class StaticBlock {
    //it will be first as static
    static int a = 4;
    static int b;
    //static block will only runce when first object is created when the class is loaded first time
    static{
        System.out.println("Iam in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.b);

        StaticBlock.b +=7;
        System.out.println(StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.b);



    }
}
