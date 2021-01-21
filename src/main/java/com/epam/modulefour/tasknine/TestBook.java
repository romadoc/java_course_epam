package com.epam.modulefour.tasknine;

import com.epam.utils.ScannerUtil;

public class TestBook {
    public static void main(String[] args) {
        Agregator agregator = new Agregator();
        System.out.println("List of books & authors:");
        for (int i = 0; i < agregator.books.length; i++){
            agregator.printList(agregator.books[i]);
        }

        String author = ScannerUtil.stringIn("type author");
            agregator.lookerFor(agregator.books, author);
        int yearOfPubl = ScannerUtil.integerIn("type year of publication(from)");
            agregator.lookerFor(agregator.books, yearOfPubl);
        String publHouse = ScannerUtil.stringIn("type publication house");
            agregator.lookerFor(publHouse,agregator.books);
    }

}
