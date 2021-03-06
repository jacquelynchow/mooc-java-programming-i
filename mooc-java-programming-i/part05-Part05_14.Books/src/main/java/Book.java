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

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (compared instanceof Book) {
            Book bookCompared = (Book) compared;
            if (this.name.equals(bookCompared.name) && this.publicationYear == bookCompared.publicationYear) {
                return true;
            }
        }
        return false;
    }

}
