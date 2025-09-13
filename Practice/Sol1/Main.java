package Practice.Sol1;

import cloning.A;

import java.util.ArrayList;

public class Main {
    static ArrayList<Book> list = new ArrayList<>();
    public static void main(String[] args) {
        Book b1 = new Book(1,"Goblet of fire","J K rownlins",45.00);
        Book b2 = new Book(2,"Chamber of secrets","Edwards",100);
        list.add(b1);
        list.add(b2);
        for(Book b : list){
            System.out.println(b);
        }
    }
}
