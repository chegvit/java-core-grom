package lesson8.accounts;

public class ChekingAccount extends Account {
    int limitOfExpenses;

    public ChekingAccount(String bankName, String ownerName, int moneyAmount, int limitOfExpenses) {
        super(bankName, ownerName, moneyAmount);
        this.limitOfExpenses = limitOfExpenses;
    }

    void withdraw(int amount){
        if(amount > limitOfExpenses)
            return;
        moneyAmount -= amount;
    }
    @Override
    void changeOwnername(String newOwnerName){
        if(newOwnerName == "Jack" || newOwnerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, you can't change owner name of this saving account");
    }

}
