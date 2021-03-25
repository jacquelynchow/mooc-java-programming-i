
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text;
        int years = 0;
        int years_count = 0;
        String longest = "";
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            text = input.split(",");
            years += Integer.valueOf(text[1]);
            years_count++;
            
            if (text[0].length() > longest.length()) {
                longest = text[0];
            }
        }
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + 
                ((double)years/years_count));

    }
}
