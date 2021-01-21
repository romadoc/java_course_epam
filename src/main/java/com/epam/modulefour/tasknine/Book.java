package com.epam.modulefour.tasknine;

/**
 * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
 * методами. Задать критерии выбора данных и вывести эти данные на консоль.
 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
 * Найти и вывести:
 * a) список книг заданного автора;
 * b) список книг, выпущенных заданным издательством;
 * c) список книг, выпущенных после заданного года.
 */
public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPubl;
    private int pages;
    private String cover;
    private int priceCent;

    public Book(int id, String title, String author, String publisher, int yearOfPubl,
                int pages, String cover, int priceCent) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPubl = yearOfPubl;
        this.pages = pages;
        this.cover = cover;
        this.priceCent = priceCent;                /* цена поставлена в центах. т.к. в программе используется мало денежных объектов (вместо BigDecimal)*/
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYearOfPubl(int yearOfPubl) {
        this.yearOfPubl = yearOfPubl;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public void setPriceCent(int priceCent) {
        this.priceCent = priceCent;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPubl() {
        return yearOfPubl;
    }

    public int getPages() {
        return pages;
    }

    public String getCover() {
        return cover;
    }

    public int getPriceCent() {
        return priceCent;
    }
    public String toString(){
        return "Book: "
                + " \"" + getTitle()
                + "\", author "
                + getAuthor();

    }
}
