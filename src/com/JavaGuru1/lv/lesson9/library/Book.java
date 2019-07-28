package com.JavaGuru1.lv.lesson9.library;

import java.util.Objects;

public class Book {
    private String author;
    private String title;

    public Book(String title, String author) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Book: title - " + title
                + ", author - " + author;
    }
}
