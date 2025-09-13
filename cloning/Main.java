package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human saran = new Human(20,"Saran");
//        Human twin = new Human(saran);


        //in lang package an interface called clonable to cloning not like above which take more process time

        Human twin = (Human)saran.clone();
        System.out.println(twin.name);





    }
}
