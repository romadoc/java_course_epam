package module4.task9;

import java.util.Scanner;

public class TestBook {

    public static void main(String[] args) {
        Agregator agregator = new Agregator();
        System.out.println("List of books & authors:");
        for (int i = 0; i < agregator.books.length; i++){
            agregator.printList(agregator.books[i]);
        }
        System.out.println("Sorting by");
        String author;
        String publHouse;
        int yearOfPubl;
        author = inputString("type author");
        agregator.lookerFor(agregator.books, author);
        yearOfPubl = Integer.parseInt(inputString("type year of publ"));
        agregator.lookerFor(agregator.books, yearOfPubl);
        publHouse = inputString("type publication house");
        agregator.lookerFor(publHouse,agregator.books);
    }
    public static String inputString(String s){
        s = s + " >>";
        System.out.print(s);
        String string = "";
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()){
            System.out.println(s);
            scanner.next();
        }
        string = scanner.nextLine();
        return string;
    }
}
