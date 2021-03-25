
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        try (Scanner scanner2 = new Scanner(Paths.get(input))) {
            // we read the file until all lines have been read
            while (scanner2.hasNextLine()) {
                // we read one line
                // we print the line that we read
                System.out.println(scanner2.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
