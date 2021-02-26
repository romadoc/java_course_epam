package com.epam.modulefour.tasknine;

public class Agregator {
    Book book = new Book(1, "My diary", "M. Scott",
                "Minsk" ,2000,200,"hard", 2000 );
    Book book1 = new Book(2, "Medicine", "Lidds M.",
                 "Britan Univ" ,1998,150,"soft", 3599 );
    Book book2 = new Book(3, "Head First Java", "Bates B.",
                 "Chicago book" ,2010,700,"hard", 2585 );
    Book book3 = new Book(4, "Friend of mine", "Ivanka I.",
                 "NY" ,2011,200,"hard", 1599);
    Book book4 = new Book(5, "Urgent Therapy", "Lidds M.",
                 "Britan Univ" ,2013,200,"soft", 2400);
    Book book5 = new Book(6, "English reading book", "Ashikaga K.",
                 "Franklin book house" ,1997,100,"soft", 3589 );
    Book book6 = new Book(7, "Her secret pocket book", "Tsarikoff W.",
                 "Minsk" ,2007,145,"hard", 2499);

    Book[]books = {book, book1, book2, book3, book4, book5, book6};

    public void lookerFor(Book[]books, String author) {
        System.out.println("auther(s) (" + author +")");
        for (int i = 0; i < books.length; i++) {
            if (author.equals(books[i].getAuthor())) {
                bookPrint(books[i]);
            }
        }
    }

    public void lookerFor(String publisher, Book[]books) {
        System.out.println("publisher ("+publisher+")");
        for (int i = 0; i < books.length; i++) {
            if(publisher.equals(books[i].getPublisher())) {
                bookPrint(books[i]);
            }
        }
    }
    public void lookerFor(Book[]books, int year) {
        System.out.println("from the year of publication (" + year + ")");
        for (int i = 0; i < books.length; i++) {
            if(books[i].getYearOfPubl() >= year) {
                bookPrint(books[i]);
            }
        }
    }
    public void printList(Book b) {
        System.out.println(b);

    }

    private void bookPrint(Book bookObj) {
        double price = bookObj.getPriceCent();
        price = price/100;                                       //перевод в формат дробного представления цены
        System.out.println("id: "+ bookObj.getId() + "; \"" + bookObj.getTitle() +
                          "\", by "+ bookObj.getAuthor() +
                          ", publishing house: " + bookObj.getPublisher() +
                          "; year of publishing: " + bookObj.getYearOfPubl() +
                          ", pages: " + bookObj.getPages() + ", type of cover: "+bookObj.getCover() +
                          ", price: " + price + " $" );

    }
}
