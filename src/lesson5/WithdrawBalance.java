package lesson5;

public class WithdrawBalance {
    public static void main(String[] args) {

        String[] names = {"Vasya", "'Petya", "Irina", "Aleksey", "Andrey"};
        int[] balances = {-85, 450, 78, 200, 67};
        System.out.println(withdraw(names, balances, "Vasya", 5));
    }

    static int withdraw(String[] clients, int[] balances, String client, int amount) {

        int clientIndex = 0;
        for (String cl : clients) {
            if (cl == client) {
                break;
            }
            clientIndex++;
        }
        int balance = balances[clientIndex];
        int amountMoney = balance >= amount ? balance - amount : balance;

       // balances[clientIndex] = amountMoney;
        return balance >= amount ? amountMoney : -1;

        //  int accountBalance = balances[clientIndex] - amount;
       // return accountBalance >= 0 ? accountBalance : -1;
    }

}