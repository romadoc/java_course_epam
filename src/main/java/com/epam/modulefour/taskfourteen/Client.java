package com.epam.modulefour.taskfourteen;

/**
 *  Учитывать возможность блокировки/разблокировки счета.
   Реализовать поиск и сортировку счетов.
   Вычисление общей суммы по счетам.
   Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/
import java.util.List;

public class Client {
    private int idClient;
    private BankAccount bankAccount;
    private List<BankAccount>clientsAccounts;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public List<BankAccount> getClientsAccounts() {
        return clientsAccounts;
    }

    public void setClientsAccounts(List<BankAccount> clientsAccounts) {
        this.clientsAccounts = clientsAccounts;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
