
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val;
        while (true) {
            System.out.println("Give a number:");
            val = Integer.valueOf(scanner.nextLine());
            if (val > 0) {
                System.out.println(val*val);
            } else if (val < 0) {
                System.out.println("Unsuitable number");
            } else {
                break;
            }
        }
    }
}
