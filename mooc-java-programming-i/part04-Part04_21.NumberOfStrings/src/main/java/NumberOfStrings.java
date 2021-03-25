
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true) {
            String val = scanner.nextLine();
            if (val.equals("end")) {
                break;
            }
            count++;
            
        }
        System.out.println(count);
    }
}
