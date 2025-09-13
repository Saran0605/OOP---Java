package Practice.Sol1;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getDetails(){
        System.out.println("BookId: "+ bookId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }

    public void setDetails(int id,String title,String author,double price){
        this.bookId = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return "BookId: " + bookId +
                ", Title: " + title +
                ", Author: " + author +
                ", Price: " + price;
    }



}
