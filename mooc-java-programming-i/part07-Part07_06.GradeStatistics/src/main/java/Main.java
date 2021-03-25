
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister register = new GradeRegister();
        UI ui = new UI(register, scanner);
        
        ui.start();
        
    }
}
