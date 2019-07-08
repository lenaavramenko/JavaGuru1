package com.JavaGuru1.lv.lesson5.book;

public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book ();

        book1.setTitle("Haskell for good!");
        book1.setAuthor("Sam Smith");
        book1.setPages(456);

        Book book2 = new Book ();
        book2.setTitle("Haskell for good!");
        book2.setAuthor("RUbinstein");
        book2.setPages(300);

        if (book1.getTitle() == book2.getTitle()) {
            System.out.println("Titles are the same!");
        }

        System.out.println(book1.toString() + "\n" + book2.toString());
    }

}
