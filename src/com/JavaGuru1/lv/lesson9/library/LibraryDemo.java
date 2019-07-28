package com.JavaGuru1.lv.lesson9.library;

public class LibraryDemo {
    public static void main(String[] args) {

        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");
        Book bookThree = new Book("Belaja Gvardija", "M. Bulgakov");

        Library library = new Library();

        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);

        library.printAll();

        System.out.println();
        library.findByName("War and Peace"); //Should return bookOne

        System.out.println();
        library.findByAuthor("Leo Tolstoy"); //Should return bookOne, bookTwo

        library.deleteBook(bookTwo);
        System.out.println();
        library.printAll();
    }
}
