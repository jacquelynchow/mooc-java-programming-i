
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int val = Integer.valueOf(scanner.nextLine());
        double tax;
        if (val < 5000) {
            System.out.println("No tax!");
        } else {
            if (val <= 25000) {
                tax = (100 + ((val-5000)*0.08) );
            } else if (val <= 55000) {
                tax = (1700 + ((val-25000)*0.1) );
            } else if (val <= 200000) {
                tax = (4700 + ((val-55000)*0.12) );
            } else if (val <= 1000000) {
                tax = (22100 + ((val-200000)*0.15) );
            } else {
                tax = (142100 + ((val-1000000)*0.17) );
            }
            System.out.println("Tax: " + tax);
        }
    }
}
