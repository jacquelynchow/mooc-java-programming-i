import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()){
                break;
            }
            
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.print("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            Book b = new Book(title, pages, year);
            books.add(b);
        }
        // implement here the program that allows the user to enter 
        // book information and to examine them
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        if (input.equals("everything")) {
            for (Book b: books) {
                b.printAll();
            }
        } else if (input.equals("name")) {
            for (Book b: books) {
                b.printTitle();
            }
        }
    }
}
