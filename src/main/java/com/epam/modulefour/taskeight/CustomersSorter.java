package com.epam.modulefour.taskeight;

import com.epam.utils.ScannerUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomersSorter {
    List<Customer>customers;
    CustomersSorter(List<Customer>customers) {
        this.customers = customers;
    }

   public void sortCustomersBySurnames() {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer customer1, Customer customer2) {
                return customer1.getSurname().compareTo(customer2.getSurname());
            }
        });
   }

    public void sortCustomersFromNumToNum() {
        long numberFrom = ScannerUtil.longIn("from card number");
        long numberTo = ScannerUtil.longIn("to card number");

        for (int i = 0; i < customers.size(); i++){
           if(customers.get(i).getCardNumber() <= numberTo&&customers.get(i).getCardNumber()>=numberFrom) {
               System.out.println(customers.get(i));
           }
        }
    }
}
