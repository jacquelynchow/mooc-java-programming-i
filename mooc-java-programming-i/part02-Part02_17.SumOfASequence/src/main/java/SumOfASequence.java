
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int value = Integer.valueOf(scanner.nextLine());
        int sum = 0;
        while (value > 0) {
            sum += value;
            value -= 1;
        }
        System.out.println("The sum is " + sum);
    }
}
