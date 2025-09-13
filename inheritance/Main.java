package inheritance;

public class Main {
    public static void main(String[] args) {
        /*Box box = new Box(4);
        Box box2 = new Box(box);
        System.out.println(box.l + " "+box.w);
        System.out.println(box2.l + " "+box2.w);


        BoxWeight one = new BoxWeight();
        System.out.println(one.weight);
        System.out.println(one.l);

        BoxWeight two = new BoxWeight(1,2,3,20);
        System.out.println(two.l +" "+two.h+" "+two.weight);*/

//        //can be done as refernce variable type will have all variables to access
//        Box box3 = new BoxWeight(1,2,3,45);
//        //but here we cant initalise child class variable so this is not possible
//        //BoxWeight box4 - new Box(1,2,3);

        BoxPrice one = new BoxPrice(500,45,1,2,3);
        BoxPrice two = new BoxPrice(one);
        one.show();
        two.show();





    }
}
