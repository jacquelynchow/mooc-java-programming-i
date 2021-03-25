
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File to read: ");
        String fname = scanner.nextLine();
        System.out.println("");
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes\n" + 
                "stop - stops the program\n" +
                "find name - searches recipes by name\n");
        
        System.out.print("Enter command: ");
        String cmd = scanner.nextLine();
        while (!cmd.equals("stop")) {
            if (cmd.equals("list")) {
                
            } else if (cmd.equals("find name")) {
                System.out.print("Searched word: ");
                String word = scanner.nextLine();
            }
            cmd = scanner.nextLine();
        }
    }
    
    public void readFile(String fname) {
        try (Scanner scanner = new Scanner(Paths.get(fname))) {
            ArrayList<String>[] recipes;
            ArrayList<String> recipeInfo = new ArrayList<>();
            ArrayList<String> ingredients = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                try {
                    // found cooking time
                    Integer.parseInt(row);
                    // add cooking time as second entry
                    recipeInfo.add(row); 
                    while (scanner.hasNextLine()) {
                        String ingredient = scanner.nextLine();
                        if (!ingredient.isEmpty()) {
                             // new ingred found
                             // add ingred to ingreds list
                            ingredients.add(ingredient);
                        } else {
                            // new line found, start new entry for new recipe
                            // add ingreds list as third entry
                            recipeInfo.add(ingredients);
                            ingredients.clear(); // clear ingreds list
                            // add complete recipe to the recipes list
                            recipes.add(recipeInfo);
                            break; // break loop to go to next recipe
                        }
                    }
                } catch (NumberFormatException e) {
                    // found new recipe name
                    recipeInfo.add(row);
                }
                
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
