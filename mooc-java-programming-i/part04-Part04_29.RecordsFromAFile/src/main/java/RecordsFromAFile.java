
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            // we read all the lines of the file
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] splitLine = line.split(",");
                int age = Integer.valueOf(splitLine[1]);
                if (age == 1) {
                    System.out.println(splitLine[0] + ", age: " + age + " year");
                } else {
                    System.out.println(splitLine[0] + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + "failed.");
        }
    }
}
