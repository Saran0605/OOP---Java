package Practice.Sol8;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books = new ArrayList<>();
    public void addBook(Book b){
        books.add(b);
        System.out.println("Book added succesfully");
    }
    public void removeBook(int id){
        for(int i=0;i< books.size();i++){
            if(books.get(i).bookId==id){
                books.remove(i);
                System.out.println("Book with id: "+ books.get(i).bookId + " is removed ");
            }
        }
    }
    public Book searchById(int id){
        for(Book b:books){
            if(b.bookId==id){
                return b;
            }

        }
        return null;
    }
    public void displayAll(){
        for(Book b : books){
            System.out.println(b);
        }
    }




}
