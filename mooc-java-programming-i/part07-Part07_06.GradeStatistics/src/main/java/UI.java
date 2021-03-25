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
import java.util.ArrayList;

public class UI {
    private GradeRegister register;
    private Scanner scanner;
    
    public UI(GradeRegister register, Scanner scanner) {
        this.register = register;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        
        while (true) {
            int grade = Integer.valueOf(this.scanner.nextLine());
            if (grade == -1) {
                break;
            }
            this.register.add(grade);
        }
        
        System.out.println("Point average (all): " + this.register.average());
        double passingAvg = this.register.passing();
        if (passingAvg == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAvg);
        }
        System.out.println("Pass percentage: " + this.register.percentAboveGrade(50));
        System.out.println("Grade Distribution:");
        this.register.gradeDistribution();
    }
}
