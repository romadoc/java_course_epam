package com.epam.modulefour.taskeight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomersStart {
    public static void main(String[] args) throws FileNotFoundException {
        List<Customer> customers = new ArrayList<>();
        ArrayList<String> listOfCustomersAsStrings = loadCustomersInfoFromFileToList();
        int customersQuantaty = listOfCustomersAsStrings.size();

        for (int i = 0; i < customersQuantaty; i++) {
            Customer customer = new Customer(Integer.parseInt(makeArrayFromString(listOfCustomersAsStrings.get(i))[0]),
                                             makeArrayFromString(listOfCustomersAsStrings.get(i))[1],
                                             makeArrayFromString(listOfCustomersAsStrings.get(i))[2],
                                             makeArrayFromString(listOfCustomersAsStrings.get(i))[3],
                                             makeArrayFromString(listOfCustomersAsStrings.get(i))[4],
                                             Long.parseLong(makeArrayFromString(listOfCustomersAsStrings.get(i))[5]),
                                             Integer.parseInt(makeArrayFromString(listOfCustomersAsStrings.get(i))[6]));
            customers.add(customer);
        }

        CustomersSorter customersSorter = new CustomersSorter(customers);
        customersSorter.sortCustomersBySurnames();
        System.out.println(customers + "\n");
        customersSorter.sortCustomersFromNumToNum();
    }

    static ArrayList<String> loadCustomersInfoFromFileToList() throws FileNotFoundException {
        String filePath = new File("src\\main\\java\\" +
                "com\\epam\\modulefour\\taskeight\\customersList.txt").getAbsolutePath();
        File trainFile = new File(filePath);
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(trainFile);
        while (scanner.hasNextLine()) {
            list.add(scanner.nextLine());
        }
        return list;
    }

    static String[] makeArrayFromString(String stringIn) {
        stringIn = stringIn.replaceAll("\\s+", "");
        return stringIn.split(",");
    }

}
