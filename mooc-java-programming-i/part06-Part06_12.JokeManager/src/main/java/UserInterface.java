/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacquelynchow
 */
import java.util.Scanner;
public class UserInterface {
    private JokeManager jokesMgr;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokesMgr, Scanner scanner) {
        this.jokesMgr = jokesMgr;
        this.scanner = scanner;
    }
    
    public void start() {
        while(true) {
            String cmd = this.scanner.nextLine();
            if (cmd.equals("X")) {
                break;
            } else if (cmd.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = this.scanner.nextLine();
                jokesMgr.addJoke(joke);
            } else if (cmd.equals("2")) {
                String joke = jokesMgr.drawJoke();
                System.out.println(joke);
            } else if (cmd.equals("3")) {
                System.out.println("Printing the jokes.");
                jokesMgr.printJokes();
            }
        }
    }
}
