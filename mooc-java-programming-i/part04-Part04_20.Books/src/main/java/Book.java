/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jacquelynchow
 */
public class Book {
    private String title;
    private int pages;
    private int year;
    
    public Book(String bookTitle, int num_pages, int published) {
        this.title = bookTitle;
        this.pages = num_pages;
        this.year = published;
    }
    public void printAll() {
        System.out.println(this.title + ", " + this.pages + " pages, " + this.year); 
    }
    public void printTitle() {
        System.out.println(this.title);
    }
}
