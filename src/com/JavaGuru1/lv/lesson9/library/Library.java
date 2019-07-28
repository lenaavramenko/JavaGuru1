package com.JavaGuru1.lv.lesson9.library;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<String, Book> library = new HashMap<>();

    public Book addBook(Book book){
        library.put(book.getTitle(), book);
        return book;
    }

    public void findByName(String title){
        System.out.println(library.get(title));
    }

    public void findByAuthor(String author){
        for (Book i : library.values()) {
            if(i.getAuthor().equals(author)) {
                System.out.println(i);
            }
        }
    }

    public void deleteBook(Book book){
        library.remove(book.getTitle());
    }

    public void printAll() {
        for (Book i : library.values()) {
            System.out.println(i);
        }
    }
}
