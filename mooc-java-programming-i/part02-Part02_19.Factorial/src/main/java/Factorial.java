
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int first = Integer.valueOf(scanner.nextLine());
        int factorial = 1;
        if (first == 0) {
            System.out.println("Factorial: 1");
        } else {
            for (int i = 1; i <= first; i++) {
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        }
    }
}
