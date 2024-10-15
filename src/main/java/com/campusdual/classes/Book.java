package com.campusdual.classes;

import com.campusdual.Utils;
import com.google.gson.internal.bind.util.ISO8601Utils;

public class Book {

    public static String title;
    public static String author;
    public int pageNumber;

    public Book(){
        this.title = Utils.string("Write the book title: ");
        this.author = Utils.string("Write the book author: ");
        this.pageNumber = Utils.integer("Write the number pages: ");

    }
    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.pageNumber = numberOfPages;

    }
    public void showBookDetails (){
        System.out.println(this.title + "- " + this.author + "(" + this.pageNumber + "pages)");

    }

    public static void main(String[] args) {
        Book b1 = new Book("Rythm of War", "Brandon Sanderson", 1902);
        Book b2 = new Book("The Magician´s Aprettice", "Trudi Canavan", 781);
        Book b3 = new Book("El paciente", "Juan Gómez-Jurado", 471);
        Book b4 = new Book();

        b1.showBookDetails();
        b2.showBookDetails();
        b3.showBookDetails();
        b4.showBookDetails();
    }

}