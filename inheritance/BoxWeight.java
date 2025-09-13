package inheritance;

public class BoxWeight extends Box{
    double weight;

//    BoxWeight(){
//        this.weight = 10;
//        // in this case the parent constructor default will be automatically called so -1.0 for l,w,h
//    }
//    BoxWeight(Box other){
//        super(other);
//    }
//
//    public BoxWeight(double l, double h, double w, double weight) {
//        super(l, h, w);//calls parent constructor to initalize parent variables too
//        this.weight = weight;
//        //same variable name in parent class and child class, super use case 2
//        System.out.println(this.weight);
//        System.out.println(super.weight);
//    }

    BoxWeight(double weight,double l,double w,double h){
        super(l,w,h);
        this.weight = weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        this.weight = other.weight;
    }
}
