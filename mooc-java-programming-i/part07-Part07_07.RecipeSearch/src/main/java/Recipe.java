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
import java.util.Scanner;
import java.nio.file.Paths;

public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients;
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.ingredients = ingredients;
    }
    
    public String getName() {
        return this.name;
    }
    public int getTime() {
        return this.cookingTime;
    }
    public ArrayList<String> getIngr() {
        return this.ingredients;
    }
    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.cookingTime;
    }
}
