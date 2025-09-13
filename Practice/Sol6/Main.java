package Practice.Sol6;

import Practice.Sol7.Order;
import Practice.Sol7.OrderManagement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        InventoryManagement mt = new InventoryManagement();
//        while(true){
//            System.out.println("1.Add product\n2.Display All products\n3.Display by Id\n4.Update product price\n5.Update product quantity\n6.delete by id\n7.exit\n");
//            int n = sc.nextInt();
//            switch(n){
//                case 1:
//                    System.out.println("Enter id:");
//                    int id = sc.nextInt();
//                    System.out.println("Enter product name:");
//                    String name = sc.next();
//                    System.out.println("Enter Price");
//                    double price = sc.nextDouble();
//                    System.out.println("Enter Quantity");
//                    int qty = sc.nextInt();
//                    Product p = new Product(id,name,price,qty);
//                    mt.addproduct(p);
//                    break;
//                case 2:
//                    System.out.println("Displaying all products");
//                    mt.displayAllProducts();
//                    break;
//
//                case 7:
//                    System.out.println("Exiting......");
//                    return;
//                default:
//                    System.out.println("Enter number from 1 - 6");
//            }
//        }




        InventoryManagement im = new InventoryManagement();
        OrderManagement om = new OrderManagement();

// Add some products to inventory
        im.addproduct(new Product(101, "Laptop", 50000, 2));
        im.addproduct(new Product(102, "Mouse", 500, 10));

// Create a new order
        Order order1 = new Order();
        order1.orderId = 1;
        order1.customerName = "Saran";

// Pick products from inventory
        Product p1 = im.fetchProductById(101); // Laptop
        Product p2 = im.fetchProductById(102); // Mouse

// Add products to order
        if(p1 != null) order1.addproduct(p1);
        if(p2 != null) order1.addproduct(p2);

// Place order in OrderManagement
        om.addOrder(order1);

// Display orders
        om.displayAll();

// Calculate total for order
        System.out.println("Total: " + order1.calculateTotal());



    }
}
