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

public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        int total = totalWeight();
        total += item.getWeight();
        if (total <= this.maxWeight) {
            this.items.add(item);
        }
    }
    public void printItems() {
        for (Item i: this.items) {
            System.out.println(i);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item i: this.items) {
            totalWeight += i.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item i: this.items) {
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
    public String toString() {
        int numItems = this.items.size();
        
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (numItems == 1) {
            return "1 item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
}
