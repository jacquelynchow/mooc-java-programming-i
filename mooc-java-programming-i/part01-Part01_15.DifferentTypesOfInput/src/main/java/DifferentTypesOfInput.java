
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scanner.nextLine();
        System.out.println("Give an integer:");
        int intVal = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double:");
        double dblVal = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean boolVal = Boolean.valueOf(scanner.nextLine());
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + intVal);
        System.out.println("You gave the double " + dblVal);
        System.out.println("You gave the boolean " + boolVal);
    }
}
