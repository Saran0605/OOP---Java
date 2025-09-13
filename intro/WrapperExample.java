package intro;

public class WrapperExample {
    public static void main(String[] args) {

        //primitive variable
        int a = 10;
        int b = 20;
        // Wrapper class
        Integer num = 45;
        swap(a,b);// reverence value is passed
        // here the Integer variable will also not swap becoz its final one even it is a refernece variable
        Integer one = 10;//public final class Integer extends Number
        Integer two = 20;
        swap(one,two);
        System.out.println(a);


        //final variable
        final int bonus = 2;
        //bonus = 3;//cant done

        final A saran = new A();
        saran.name = "saran";// but values can be changed for non primitive
        //saran = new A();//cant done becoz of final

    }
    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }

}

class A{
    final int num = 10;
    String name;

}
