package inheritance;

public class BoxPrice extends BoxWeight {
    double cost;

    BoxPrice(double cost,double weight,double l,double h,double w){
        super(weight,l,h,w);
        this.cost = cost;


    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;

    }
    public void show(){
        System.out.println(this.h);
        System.out.println(this.w);
        System.out.println(this.l);
        System.out.println(this.weight);
        System.out.println(this.cost);
    }
//    BoxPrice(){
//        super();
//        this.cost = -1;
//    }
//
//    BoxPrice(BoxPrice other){
//        super(other);
//        this.cost = other.cost;
//    }
}
