
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String val = scanner.nextLine();
            if (val.equals("end")) {
                break;
            }
            int num = Integer.valueOf(val);
            System.out.println(num*num*num);
            
        }
    }
}
