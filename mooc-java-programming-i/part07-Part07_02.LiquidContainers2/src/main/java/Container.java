/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacquelynchow
 */
public class Container {
    private int currentAmount;
    
    public int contains() {
        return this.currentAmount;
    }
    public void add(int amount) {
        if (amount < 0) {
            return;
        }
        this.currentAmount += amount;
        if (this.currentAmount > 100) {
            this.currentAmount = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        this.currentAmount -= amount;
        if (this.currentAmount < 0) {
            this.currentAmount = 0;
        }
    }
    public String toString() {
        return this.currentAmount + "/100";
    }
}
