package Practice.Sol7;

import java.util.ArrayList;

public class OrderManagement {
    ArrayList<Order> list = new ArrayList<>();
    public void addOrder(Order o){
        list.add(o);
        System.out.println("Order placed succesfully");
    }
    public Order fetchOrderById(int id){
        for(Order o:list){
            if(o.orderId==id){
                return o;
            }
        }
        return null;
    }
    public boolean deleteOrder(int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).orderId==id){
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayAll(){
        for(Order o : list){
            System.out.println(o);
        }
    }


}
