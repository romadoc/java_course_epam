package module4.task8;

import java.util.Comparator;

/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.

Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class Customer {
    int id;
    String surname;
    String name;
    String patronymic;
    String address;
    int numCard;
    int numBankAccount;

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumCard(int numCard) {
        this.numCard = numCard;
    }

    public void setNumBankAccount(int numBankAccount) {
        this.numBankAccount = numBankAccount;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getAddress() {
        return address;
    }

    public int getNumCard() {
        return numCard;
    }

    public int getNumBankAccount() {
        return numBankAccount;
    }

    public static Comparator<Customer>customerComparator = new Comparator<Customer>() {
        @Override
        public int compare(Customer customer1, Customer customer2) {
            String surn1 = customer1.surname;
            String surn2 = customer2.surname;

            return surn1.compareTo(surn2);
        }
    };
}
