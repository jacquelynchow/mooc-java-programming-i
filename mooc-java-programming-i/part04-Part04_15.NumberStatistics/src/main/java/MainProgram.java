
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics stat = new Statistics();
        Statistics evenStat = new Statistics();
        Statistics oddStat = new Statistics();
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        System.out.println("Enter numbers:");
        while (true) {
            int val = Integer.valueOf(scanner.nextLine());
            if (val == -1) {
                break;
            }
            if (val % 2 == 0) {
                evenStat.addNumber(val);
            } else {
                oddStat.addNumber(val);
            }
            stat.addNumber(val);
        }
        System.out.println("Sum: " + stat.sum());
        System.out.println("Sum of even numbers: " + evenStat.sum());
        System.out.println("Sum of odd numbers: " + oddStat.sum());
 
    }
}
