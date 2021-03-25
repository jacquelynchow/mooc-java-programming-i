
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String end = "/100";
        int first = 0;
        int second = 0;
        
        while (true) {
            System.out.println("First: " + first + end);
            System.out.println("Second: " + second + end);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String cmd = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount > 0) {
                if (cmd.equals("add")) {
                    first += amount;
                    if (first > 100) {
                        first = 100;
                    }
                } else if (cmd.equals("move")) {
                    int remaining = first - amount; 
                    if (remaining < 0) {
                        second += first; 
                        if (second > 100) {
                            second = 100;
                        }
                        first = 0;
                    } else {
                        second += amount;
                        if (second > 100) {
                            second = 100;
                        }
                        first = remaining;
                    }
                } else if (cmd.equals("remove")) {
                    second -= amount;
                    if (second < 0) {
                        second = 0;
                    }
                }
            }
        }
    }

}
