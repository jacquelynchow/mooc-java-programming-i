/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacquelynchow
 */
public class Counter {
    private int start;
    
    public Counter(int startValue) {
        this.start = startValue;
    }
    
    public Counter() {
        this.start = 0;
    }
    
    public int value() {
        return this.start;
    }
    
    public void increase() {
        this.start++;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.start += increaseBy;
        }
    }
    
    public void decrease() {
        this.start--;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.start -= decreaseBy;
        }
    }
}
