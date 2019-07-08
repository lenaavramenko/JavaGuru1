package com.JavaGuru1.lv.lesson5.book;

import java.util.Objects;

public class Book {

    private String author;
    private String title;
    private int pages;

    public Book () {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return getPages() == book.getPages() &&
                Objects.equals(getAuthor(), book.getAuthor()) &&
                Objects.equals(getTitle(), book.getTitle());
    }

    @Override
    public String toString() {
        return "Book: \"" + this.title +
                "\", author: " + this.author +
                ", pages: " + this.pages;
    }

}
