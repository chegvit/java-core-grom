package lesson22.homework22;

import lesson22.homework22.exeption.BadRequestException;
import lesson22.homework22.exeption.InternalServerException;
import lesson22.homework22.exeption.LimitExceeded;

import java.util.Calendar;
import java.util.Date;

public class TransactionDAO {
    private static Transaction[] transactions = new Transaction[10];
    private static Utils utils = new Utils();

// public TransactionDao(Transaction[] transactions, Utils utils) {
// this.transactions = transactions;
// this.utils = utils;
//}

    public static Transaction[] getTransactions() {
        return transactions;
    }

    public Utils getUtils() {
        return utils;
    }

    public static Transaction save(Transaction transaction) {
// - сумма транзакции больше указанного лимита
// - сумма транзакций за день больше дневного лимита
// - количество транзакций за день больше указанного лимита
// - если город оплаты (совершения транзакции) не разрешен
// - не хватило места
        if (validate(transaction)) {
            for (int i = 0; i < getTransactions().length; i++) {
                if (transactions[i] == null) {
                    transactions[i] = transaction;
                    break;
                }

            }
            return transaction;
        }
        return null;
    }

  public static   Transaction[] transactionList () {
        int count = 0;
        for(Transaction tr : getTransactions()){
            if(tr != null)
                count++;
        }
        Transaction[] result = new Transaction[count];
        int i = 0;
        for(Transaction tr : getTransactions()){
            if(tr != null){
                result[i] = tr;

            }
            i++;
        }
        return result;
    }

   public static Transaction[] transactionList (String city){
        int count = 0;
        for(Transaction tr : getTransactions()){
            if(tr != null && city.equals(tr.getCity()))
                count++;
        }
        int i = 0; int j = 0;
        Transaction[] result = new Transaction[count] ;
        for (Transaction tr : transactions){
            if(tr != null && city.equals(tr.getCity())){
                result[j] = transactions[i];
                j++;
            }
            i++;

        }
        return result;
    }
  public static   Transaction[] transactionList (int amount){
        int count = 0;
        for(Transaction tr : getTransactions()){
            if(tr != null && tr.getAmount() == amount)
                count++;
        }
        int i = 0;
        Transaction[] result = new Transaction[count] ;
        for (Transaction tr : getTransactions()){
            if(tr != null && tr.getAmount() == amount){
                result[i] = tr;
                i++;
            }


        }

        return result;
    }
    private static boolean validate(Transaction transaction){

        try{
            checkLimits(transaction);
            checkCity(transaction);
            checkNumberOfTransactions(transaction);
            return true;
        } catch (BadRequestException | InternalServerException e){
            System.out.println(e.getMessage());
          return false;
        }
    }
    /* private void validate(Transaction transaction) throws LimitExceeded,BadRequestException, InternalServerException {
    if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
    throw new LimitExceeded("Transaction limit exceed" + transaction.getId() + ". Can't be saved");
    int sum = 0;
    int count = 0;
    int notNullTr = 0;
    for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
    sum += tr.getAmount();
    count++;
    }
    if (sum > utils.getLimitTransactionsPerDayAmount()) {
    throw new LimitExceeded("Transaction limit per day amount exceed" + transaction.getId() + ". Can't be saved");
    }
    if (count > utils.getLimitTransactionsPerDayCount()) {
    throw new LimitExceeded("Transaction limit per day count exceed" + transaction.getId() + ". Can't be saved");
    }
    for(Transaction tr : transactions){
    if(tr != null){
    notNullTr++;
    }
    }
    if(notNullTr > transactions.length)
    throw new InternalServerException("Transaction" + transaction.getId() + " can't be saved. Number of transactions exceeded");

    for(int i = 0; i < utils.getCities().length; i++ ){
    if(!(transaction.getCity().equals(utils.getCities()[i])))
    throw new BadRequestException("Transaction" + transaction.getId() + " can't be saved. This city is not allowed");

    }

    }*/
    private static void checkLimits(Transaction transaction) throws LimitExceeded {
        if (transaction.getAmount() > utils.getLimitSimpleTransactionAmount())
            throw new LimitExceeded("Transaction limit exceed " + transaction.getId() + ". Can't be saved");

        int sum = transaction.getAmount();
        int count = 1;
        for (Transaction tr : getTransactionsPerDay(transaction.getDateCreated())) {
            count++;
            sum += tr.getAmount();

        }
        if (sum > utils.getLimitTransactionsPerDayAmount()) {
            throw new LimitExceeded("Transaction limit per day amount exceed" + transaction.getId() + ". Can't be saved");
        }
        if (count > utils.getLimitTransactionsPerDayCount()) {
            throw new LimitExceeded("Transaction limit per day count exceed" + transaction.getId() + ". Can't be saved");
        }

    }
    private static void checkCity(Transaction transaction) throws BadRequestException {
        boolean allowedCity = false;
        for (int i = 0; i < utils.getCities().length; i++) {
            if ((transaction.getCity().equals(utils.getCities()[i]))) {
                allowedCity = true;
                break;
            }
        }
        if(!allowedCity)
            throw new BadRequestException("Transaction" + transaction.getId() + " can't be saved. This city is not allowed");

    }
    private static void checkNumberOfTransactions(Transaction transaction) throws InternalServerException {
        int count = 0;
        for(Transaction tr : transactions){
            if(tr != null)
                count++;
        }
        if (count == transactions.length)
            throw new InternalServerException("Transaction" + transaction.getId() + " can't be saved. Number of transactions exceeded");

    }
    private static Transaction[] getTransactionsPerDay(Date dateOfCurTransaction){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateOfCurTransaction);

        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int count = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day)
                    count++;
            }
        }
        Transaction[] result = new Transaction[count];
        int index = 0;
        for (Transaction transaction : transactions) {
            if (transaction != null) {
                calendar.setTime(transaction.getDateCreated());
                int trMonth = calendar.get(Calendar.MONTH);
                int trDay = calendar.get(Calendar.DAY_OF_MONTH);
                if (trMonth == month && trDay == day) {
                    result[index] = transaction;
                    index++;
                }

            }
        }
        return result;
    }
}


