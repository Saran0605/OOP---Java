package Practice.Sol7;

import Practice.Sol6.Product;
import cloning.A;

import java.util.ArrayList;

public class Order {
    public int orderId;
    public String customerName;
    ArrayList<Product> list = new ArrayList<>();

    public void addproduct(Product p){
        list.add(p);
    }
    public double calculateTotal(){
        double total = 0;
        for(Product p:list){
            total += p.price * p.quantity;

        }
        return total;
    }


    public String displayOrder() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", list=" + list +
                '}';
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", list=" + list +
                '}';
    }
}
