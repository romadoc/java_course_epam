package module4.task8;

import java.util.Arrays;
import java.util.Scanner;

public class TestCustomer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setSurname("Ivanova");
        customer.setNumCard(154789123);

        Customer customer1 = new Customer();
        customer1.setId(2);
        customer1.setSurname("Petrova");
        customer1.setNumCard(125456997);

        Customer customer2 = new Customer();
        customer2.setId(3);
        customer2.setSurname("Sidoroff");
        customer2.setNumCard(159753456);

        Customer customer3 = new Customer();
        customer3.setId(4);
        customer3.setSurname("Dmitriev");
        customer3.setNumCard(753951123);

        Customer customer4 = new Customer();
        customer4.setId(5);
        customer4.setSurname("Alieva");
        customer4.setNumCard(357987654);

        Customer[]customers = {customer, customer1, customer2, customer3, customer4};
        Arrays.sort(customers, Customer.customerComparator);
        System.out.println("list of customer's surname:");
        for (int i = 0; i < customers.length; i++){
            System.out.println(customers[i].getSurname());
        }
        int startRange = cardRange("from (card number:)");
        int endRange = cardRange("to card number (included):");
        for(int i = 0; i < customers.length; i++){
            if(customers[i].getNumCard()>=startRange && customers[i].getNumCard()<=endRange){
                System.out.println(customers[i].getSurname());
            }
        }

    }
    public static int cardRange(String s){
        s = s + " >>";
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            System.out.print(s);
            scanner.next();
        }
        int cardNum = scanner.nextInt();
        return cardNum;
    }

}
