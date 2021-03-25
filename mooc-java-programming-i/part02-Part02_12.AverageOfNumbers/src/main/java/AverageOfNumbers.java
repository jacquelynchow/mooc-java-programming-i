
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        int num;
        while (true) {
            System.out.println("Give a number:");
            num = Integer.valueOf(scanner.nextLine());
            if (num == 0) {
                break;
            } else {
                sum += num;
                count += 1;
            }
        }
        System.out.println("Average of the numbers: " + ((double)sum/count));
    }
}
