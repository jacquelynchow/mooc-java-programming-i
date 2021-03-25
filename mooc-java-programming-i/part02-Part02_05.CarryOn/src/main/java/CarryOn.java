
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean carryOn = true;
        String input;        
        while (carryOn) {
            System.out.println("Shall we carry on?");
            input = scanner.nextLine();
            if (input.equals("no")) {
                carryOn = false;
            }
        }
    }
}
