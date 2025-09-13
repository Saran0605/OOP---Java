package Practice.Sol6;

import java.util.ArrayList;

public class InventoryManagement {
    ArrayList<Product> list = new ArrayList<>();
    public void addproduct(Product p){
        list.add(p);
        System.out.println("Product added succesfully");
    }
    public Product fetchProductById(int id){
        for(Product p:list){
            if(p.productId==id){
                return p;
            }
        }
        return null;
    }
    public boolean updateProductPrice(int id,double Price){
        for(int i=0;i<list.size();i++){
            if((list.get(i).productId) == id){
                list.get(i).price = Price;
                return true;
            }
        }
        return false;
    }
    public boolean updateProductQuantity(int id, int qty){
        for(int i=0;i<list.size();i++){
            if(list.get(i).productId == id){
                list.get(i).quantity = qty;
                return true;
            }
        }
        return false;
    }
    public boolean deleteById(int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).productId == id){
                list.remove(i);
                return true;
            }
        }
        return false;
    }
    public void displayAllProducts(){
        for(Product p : list){
            System.out.println(p);
        }
    }


}
