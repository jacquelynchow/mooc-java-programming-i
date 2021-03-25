
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text;
        int oldest = 0;
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            text = input.split(",");
            if (Integer.valueOf(text[1]) > oldest) {
                oldest = Integer.valueOf(text[1]);
            }
        }
        System.out.println("Age of the oldest: " + oldest);
        
    }
}
