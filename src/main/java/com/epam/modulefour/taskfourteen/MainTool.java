package com.epam.modulefour.taskfourteen;


import com.epam.utils.ScannerUtil;

import java.util.ArrayList;
import java.util.List;

public class MainTool {
    public static void main(String[] args) {
        ClassGetInfo classGetInfo = new ClassGetInfo();

        Client vasja = new Client();
        vasja.setIdClient(1);

        List<BankAccount> vasjaAccounts = new ArrayList<>();
        BankAccount vasjaBankAccount = new BankAccount(1, 1, false, 10000);
        BankAccount vasjaBankAccount1 = new BankAccount(2, 1, true, -100);
        BankAccount vasjaBankAccount2 = new BankAccount(3, 1, true, 20);

        vasjaAccounts.add(vasjaBankAccount);
        vasjaAccounts.add(vasjaBankAccount1);
        vasjaAccounts.add(vasjaBankAccount2);


        getClentCommonBalanceInfo(vasjaAccounts);
        getClientSeparatedBalanceInfo(vasjaAccounts);
        findAccountByAccountID(vasjaAccounts, ScannerUtil.integerIn("type bank account number to search it"));
        showClientAccountSortedFromUpToDown(vasjaAccounts);
        showClientAccountSortedFromDownToUp(vasjaAccounts);

    }

    private static void getClentCommonBalanceInfo(List<BankAccount> clientAccountsList) {
        System.out.println(ClassGetInfo.commonBalanceInfoReport(clientAccountsList));
    }

    private static void getClientSeparatedBalanceInfo(List<BankAccount> clientAccountsList) {
        for (String s : ClassGetInfo.separatedNegativePositiveSumReport(clientAccountsList)) {
            System.out.print(s);
        }
    }

    private static void findAccountByAccountID(List<BankAccount> clientAccountsList, int accountID) {
        BankAccount bankAccount = ClassGetInfo.findBankAccount(clientAccountsList, accountID);
        System.out.println(bankAccount);
    }

    private static void showClientAccountSortedFromUpToDown(List<BankAccount> clientAccountsList) {
        ClassGetInfo.sortClientAccountsBySumFromUpToDown(clientAccountsList);
        for (BankAccount ba: clientAccountsList) {
            System.out.println(ba);
        }
    }

    private static void showClientAccountSortedFromDownToUp(List<BankAccount> clientAccountsList) {
        ClassGetInfo.sortClientAccountsBySumFromDownToUp(clientAccountsList);
        for (BankAccount ba: clientAccountsList) {
            System.out.println(ba);
        }
    }
}
