package com.epam.modulefour.taskfourteen;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClassGetInfo {


    public static String commonBalanceInfoReport(List<BankAccount> clientAccounts) {
        int summa = 0;
        for (BankAccount ba: clientAccounts ) {
            summa += ba.getFinancialBalance();
        }
        return "total " + summa+ " cent's";
    }

    public static String[] separatedNegativePositiveSumReport(List<BankAccount> clientAccounts) {
        String[] separatedReport = new String[4];
        int positiveSumma = 0;
        int negativeSumma = 0;
        for (BankAccount ba: clientAccounts) {
            if(ba.getFinancialBalance() > 0) {
                positiveSumma += ba.getFinancialBalance();
            } else {
                negativeSumma += ba.getFinancialBalance();
            }
        }
        separatedReport[0] = "summa of all positives balances: ";
        separatedReport[1] = Integer.toString(positiveSumma) + " cent's; ";
        separatedReport[2] = "summa of all negative balances: ";
        separatedReport[3] = Integer.toString(negativeSumma);
      return separatedReport;
    }

    public static BankAccount findBankAccount(List<BankAccount> clientAccounts, int accountNumber) {
        BankAccount bankAccount = null;
        for (BankAccount ba: clientAccounts) {
            if(ba.getIdAccount() == accountNumber) {
                bankAccount = ba;
            }
        }
        return bankAccount;
    }

    public static void sortClientAccountsBySumFromUpToDown(List<BankAccount> clientAccount) {
        Collections.sort(clientAccount, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount account1, BankAccount account2) {
                String s1 = Integer.toString(account1.getIdAccount());
                String s2 = Integer.toString(account2.getIdAccount());
                int i1 = account1.getFinancialBalance();
                int i2 = account2.getFinancialBalance();
                if (i1 > i2) {
                    return -1;
                }
                if (i2 > i1) {
                    return 1;
                }

                return s1.compareTo(s2);
            }
        });
    }

    public static void sortClientAccountsBySumFromDownToUp(List<BankAccount> clientAccount) {
        Collections.sort(clientAccount, new Comparator<BankAccount>() {
            @Override
            public int compare(BankAccount account1, BankAccount account2) {
                String s1 = Integer.toString(account1.getIdAccount());
                String s2 = Integer.toString(account2.getIdAccount());
                int i1 = account1.getFinancialBalance();
                int i2 = account2.getFinancialBalance();
                if (i1 > i2) {
                    return 1;
                }
                if (i2 > i1) {
                    return -1;
                }

                return s1.compareTo(s2);
            }
        });
    }

}
