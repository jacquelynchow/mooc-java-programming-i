/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacquelynchow
 */
import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> numbers;
    
    public GradeRegister() {
        this.numbers = new ArrayList<>();
    }
    
    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.numbers.add(grade);
        }
    }
    
    public double sumWithLimit(int minGrade) {
        double sum = 0.0;
        for (Integer n: this.numbers) {
            if (n >= minGrade) {
                sum += n;
            }
        }
        return sum;
    }
    
    public double sizeWithLimit(int minGrade) {
        int size = 0;
        for (Integer n: this.numbers) {
            if (n >= minGrade) {
                size++;
            }
        }
        return size;
    }
    
    public int getSize() {
        return this.numbers.size();
    }
    
    public double average() {
        return sumWithLimit(0)/getSize();
    }
    
    public double passing() {
        return sumWithLimit(50)/sizeWithLimit(50);
    }
    
    public double percentAboveGrade(int grade) {
        return 100.0 * sizeWithLimit(grade) / getSize();
    }
    
    public void gradeDistribution() {
        int[] gradeDistributions = {0, 0, 0, 0, 0, 0};
        
        for (Integer n : this.numbers) {
            if (n < 50) {
                gradeDistributions[0]++;
            } else if (n < 60) {
                gradeDistributions[1]++;
            } else if (n < 70) {
                gradeDistributions[2]++;
            } else if (n < 80) {
                gradeDistributions[3]++;
            } else if (n < 90) {
                gradeDistributions[4]++;
            } else if (n >= 90) {
                gradeDistributions[5]++;
            }
        }
        String[] stars = countStars(gradeDistributions);
        for (int i = stars.length - 1; i >= 0; i--) {
            System.out.println(i + ": " + stars[i]);
        }
        
    }
    
    public String[] countStars(int[] gradeDistributions) {
        String[] stars = new String[6];
        
        for (int x = 0; x < gradeDistributions.length; x++) {
            String s = "";
            while (gradeDistributions[x] != 0) {
                s += "*";
                gradeDistributions[x]--;
            }
            stars[x] = s;
        }
        return stars;
    }
}
