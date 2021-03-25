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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> holds;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.holds = new ArrayList<>();
    }
    public void addSuitcase(Suitcase suitcase) {
        int total = 0;
        for (Suitcase s: this.holds) {
            total += s.totalWeight();
        }
        total += suitcase.totalWeight();
        if (total <= this.maxWeight) {
            this.holds.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase: this.holds) {
            suitcase.printItems();
        }
    }
    
    public String toString() {
        int total = 0;
        for (Suitcase suitcase: this.holds) {
            total += suitcase.totalWeight();
        }
        return this.holds.size() + "suitcases (" + total + " kg)";
    }
}
