package com.epam.modulefour.taskfourteen;

/**
 * Счета. Клиент может иметь несколько счетов в банке.
 * Учитывать возможность блокировки/разблокировки счета.
 * Реализовать поиск и сортировку счетов.
 * Вычисление общей суммы по счетам.
 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class BankAccount {
   private int idAccount;
   private int idClient;
   private boolean isBlocked;
   private int financialBalance;


    public BankAccount(int idAccount, int idClient, boolean isBlocked, int financialBalance) {
        this.idAccount = idAccount;
        this.idClient = idClient;
        this.isBlocked = isBlocked;
        this.financialBalance = financialBalance;

    }

    public int getIdAccount() {
        return idAccount;
    }

    public int getIdClient() {
        return idClient;
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public int getFinancialBalance() {
        return financialBalance;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public void setFinancialBalance(int financialBalance) {
        if(isBlocked){
            System.out.println("account is blocked!");
        } else {
            this.financialBalance = financialBalance;
        }
    }

    @Override
    public String toString() {
        return "\n"+ "Account info: " +
                "idAccount=" + idAccount +
                ", idClient=" + idClient +
                ", isBlocked=" + isBlocked +
                ", financialBalance=" + financialBalance;
    }
}
