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
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String cmd = this.scanner.nextLine();
            
            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("add")) {
                System.out.print("To add: ");
                String task = this.scanner.nextLine();
                this.list.add(task);
            } else if (cmd.equals("list")) {
                this.list.print();
            } else if (cmd.equals("remove")) {
                int toRemove = Integer.valueOf(this.scanner.nextLine());
                this.list.remove(toRemove);
            }
        }
    }
}
