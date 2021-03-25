
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        
        System.out.println("Team:");
        String team = scan.nextLine();
//        ArrayList<String, int> records = new ArrayList<>();
        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            // we read all the lines of the file
            int games = 0;
            int win = 0;
            int loss = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] splitLine = line.split(",");
                int point1 = Integer.valueOf(splitLine[2]);
                int point2 = Integer.valueOf(splitLine[3]);
                if (splitLine[0].equals(team)) {
                    games++;
                    if (point1 > point2) {
                        win++;
                    } else {
                        loss++;
                    }
                } else if (splitLine[1].equals(team)) {
                    games++;
                    if (point2 > point1) {
                        win++;
                    } else {
                        loss++;
                    }
                }
            }   
            System.out.println("Games: " + games);
            System.out.println("Wins: " + win);
            System.out.println("Losses: " + loss);
        } catch (Exception e) {
            System.out.println("Reading the file " + file + "failed.");
        }
    }

}
