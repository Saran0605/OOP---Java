package Practice.Sol8;

public class Borrower {
    public int borrowerId;
    public String name;

    public Borrower(int borrowerId, String name) {
        this.borrowerId = borrowerId;
        this.name = name;
    }

    public void borrowBook(Library lib,int id){
            for(Book b : lib.books){
                if(b.bookId==id && b.isAvailable==true){
                    b.isAvailable = false;
                    System.out.println("Borrowed succesfully");

                    return;
                }
            }
        System.out.println("Book not available");
    }

    public void returnBook(Library lib,int id){
        for(Book b : lib.books){
            if(b.bookId == id){
                b.isAvailable = true;
                System.out.println("Returned succesfully");
            }
        }
    }
}
