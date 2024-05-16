package edu.rit.Unit2;

import edu.rit.Unit2.models.Book;
import edu.rit.Unit2.models.enums.BoilingPointEnum;
import edu.rit.Unit2.models.enums.BookStatus;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book(1, "Alice in Wonderland", "Ivan Kolanovic");
        System.out.println(book.getTitle());
//        book.setTitle("Lord of the Rings");
//        book.setAuthor("J.R.R.Tolkien");
        book.changeBookInformation("Lord of the Rings", "J.R.R.Tolkien");

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        Book book2 = new Book();

        System.out.println(BoilingPointEnum.CELSIUS.getSymbol());
        System.out.println(BoilingPointEnum.CELSIUS.getBoilingPoint());

        System.out.println(book.equals(book2));

        BookStatus[] statuses = BookStatus.values();
        for (BookStatus status : statuses) {
            System.out.println(status);
        }

        Util.print(Book.LIBRARY_NAME);

        String helloWorld = "                      Hello world                 ";
        System.out.println(helloWorld.trim());
        System.out.println(helloWorld.toUpperCase().trim());
        System.out.println(helloWorld.trim().contains("Hello"));
        System.out.println(helloWorld.trim().startsWith("hel"));


        int a = 2;
        int b = 3;
        String c = "hello";
        String d = "hello";
        System.out.println(c == d);


    }
}
