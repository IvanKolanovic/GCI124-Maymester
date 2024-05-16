package edu.rit.Unit2.models;

import edu.rit.Unit2.models.enums.BookStatus;

public class Book extends Object {

    public static final String LIBRARY_NAME = "RIT Library";
    private int id;
    private String title;
    private String author;
    private BookStatus bookStatus;

    // Override default constructor
    public Book() {
        this.id = 0;
        this.title = "title";
        this.author = "";
        this.bookStatus = BookStatus.UNDEFINED;
    }

    // Custom constructor
//    public Book(int _id, String _title, String _author) {
//        id = _id;
//        title = _title;
//        author = _author;
//    }

    // Custom constructor - RECOMMENDED
    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookStatus = BookStatus.AVAILABLE;
    }

    public void changeBookInformation(String title, String author) {
        if (this.bookStatus != BookStatus.AVAILABLE)
            return;

        this.title = title;
        this.author = author;

//        if (this.bookStatus == BookStatus.AVAILABLE) {
//            this.title = title;
//            this.author = author;
//        } else {
//            System.out.println("Book cannot be modified at the current moment.");
//        }
    }

    public String getTitle() {
        return this.title;
    }

//    public void setTitle(String title) {
//        this.title = title;
//    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

//    public void setAuthor(String author) {
//        this.author = author;
//    }


    @Override
    public String toString() {
        return String.format("ID: %d, Title: %s, Author: %s, Status: %s", this.id, this.title, this.author, this.bookStatus.name());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            return this.id == book.id && this.title.equals(book.title) && this.author.equals(book.author);
        }
        return false;
    }
}


