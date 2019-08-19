package lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять
        // проверить лимит
        // проверить достаточно ли денег
        //снять деньги
      /*  int limitOfWithdrawal = user.getBank().getLimitOfWithdrawal();
        if (amount + user.getBank().getCommission(amount) > limitOfWithdrawal) {
            System.err.println("Can't withdraw money " + amount + "from user" + user.toString());
            return;
        }
        if (amount + user.getBank().getCommission(amount) > limitOfWithdrawal) {
            printwithdrawalErrorMsg(amount,user);
            return;
        }
        if(amount + user.getBank().getCommission(amount) > user.getBalance()){
            printwithdrawalErrorMsg(amount,user);
            return;
        }*/
         if(!checkWithdraw(user,amount))
          return;

       // double balanceAfterWithdraw = user.getBalance() - amount - user.getBank().getCommission(amount);
        user.setBalance(user.getBalance() - amount -amount * user.getBank().getCommission(amount));
    }



    @Override
    public void fund(User user, int amount) {
      //  if (amount - user.getBank().getCommission(amount)  > user.getBank().getLimitOfFunding() ) {
        //    printfundinglErrorMsg(amount, user);
          //  return;
        //}
        if(!checkFunding(user,amount))
            return;

            user.setBalance(user.getBalance() + amount);
        }



    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        if(fromUser.getBank().getCurrency() != toUser.getBank().getCurrency())
            return;
        if(!checkWithdraw(fromUser, amount))
            return;
        if(!checkFunding(toUser,amount))
            return;
        fromUser.setBalance(fromUser.getBalance() - amount - amount * fromUser.getBank().getCommission(amount)) ;
        toUser.setBalance(toUser.getBalance() + amount );
    }

    @Override
    public void paySalary(User user) {
        if(!checkSalary(user))
        return;
        user.setBalance(user.getSalary() + user.getBalance());


    }
 private void printwithdrawalErrorMsg(int amount, User user){
        System.err.println("Can't withdraw money " + amount + "from user" + user.toString());


 }

    private boolean checkWithdraw(User user, int amount){
        return checkWithdrawLimits(user,amount,user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user,amount,user.getBalance());
    }

    private boolean checkWithdrawLimits(User user, int amount, double limit){
        if( amount + user.getBank().getCommission(amount) > limit){
            printwithdrawalErrorMsg(amount,user);
            return false;
        }
        return true;
    }
    private void printfundinglErrorMsg(int amount, User user){
        System.err.println("Can't funding money " + amount +  " from user "  + user.toString());

    }

    private boolean checkFundingLimits(User user, int amount,double limit){
        if (amount  > limit) {
            printfundinglErrorMsg(amount,user);
            return false;

        }
       return true;
    }
   private boolean checkFunding(User user, int amount){
        return checkFundingLimits(user,amount,user.getBank().getLimitOfFunding());
   }
   private void printSalaryErrorMsg(User user){
       System.err.println("Amount " + user.getSalary() + " exceeds the limit for user " + user.toString());;
   }
   private boolean checkSalarylimits(User user, double limit){
        if(user.getSalary() > limit) {
            printSalaryErrorMsg(user);
            return false;
        }
        return true;
   }
   private boolean checkSalary(User user){
        return checkSalarylimits(user,user.getBank().getLimitOfFunding());
   }

}
