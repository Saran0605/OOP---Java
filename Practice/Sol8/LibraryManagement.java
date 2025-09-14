package Practice.Sol8;

import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        // preload some books
        lib.addBook(new Book(1, "The Alchemist", "Paulo Coelho", true));
        lib.addBook(new Book(2, "1984", "George Orwell", true));
        lib.addBook(new Book(3, "Clean Code", "Robert C. Martin", true));
        lib.addBook(new Book(4, "To Kill a Mockingbird", "Harper Lee", true));
        lib.addBook(new Book(5, "Java: The Complete Reference", "Herbert Schildt", true));

        Borrower borrower = new Borrower(1,"Default User");

        while(true){
            System.out.println("\n===== 📖 Library Menu =====");
            System.out.println("1. Display all books");
            System.out.println("2. Add a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Borrow a book");
            System.out.println("5. Return a book");
            System.out.println("6. Search book by ID");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    lib.displayAll();
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    lib.addBook(new Book(id,title,author,true));
                    break;
                case 3:
                    System.out.print("Enter Book ID to remove: ");
                    lib.removeBook(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Book ID to borrow: ");
                    borrower.borrowBook(lib, sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter Book ID to return: ");
                    borrower.returnBook(lib, sc.nextInt());
                    break;
                case 6:
                    System.out.print("Enter Book ID to search: ");
                    Book found = lib.searchById(sc.nextInt());
                    if(found != null) System.out.println("✅ Found: " + found);
                    else System.out.println("⚠️ Book not found");
                    break;
                case 0:
                    System.out.println("👋 Exiting... Thank you!");
                    return;
                default:
                    System.out.println("⚠️ Invalid choice, try again.");
            }
        }
    }
}