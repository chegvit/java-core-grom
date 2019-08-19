package lesson8.accounts;

import java.util.concurrent.Callable;
public class Demo {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SomeBank","Denis",1000,50);
        savingAccount.depositMoney(100);
        System.out.println(savingAccount.moneyAmount);
        savingAccount.changeOwnername("Oleg");
        System.out.println(savingAccount.ownerName);

        ChekingAccount chekingAccount = new ChekingAccount("SomeBank","Denis",1000,500);
        chekingAccount.changeOwnername("Oleg");
        System.out.println(chekingAccount.ownerName);
    }
}


