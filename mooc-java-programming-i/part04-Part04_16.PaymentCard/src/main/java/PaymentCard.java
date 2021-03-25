/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacquelynchow
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        // write code here
        this.balance = openingBalance;
    }

    public String toString() {
        // write code here
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        // write code here  
        double temp = this.balance - 2.60;
        if (temp >= 0) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        // write code here
        double temp = this.balance - 4.60;
        if (temp >= 0) {
            this.balance -= 4.60;
        }
    }
    
    public void addMoney(double amount) {
        // write code here
        if (amount >= 0) {
            double temp = this.balance + amount;
            if (temp < 150) {
                this.balance += amount;
            } else {
                this.balance = 150;
            }
        }
        
    }
}
