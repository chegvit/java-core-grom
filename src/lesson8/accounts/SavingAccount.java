package lesson8.accounts;

public class SavingAccount extends Account {

    int savingPerMonth;


    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }

}

