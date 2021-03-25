
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text;
        int oldest = 0;
        String name = "";
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            text = input.split(",");
            if (Integer.valueOf(text[1]) > oldest) {
                oldest = Integer.valueOf(text[1]);
                name = text[0];
            }
        }
        System.out.println("Name of the oldest: " + name);

    }
}
