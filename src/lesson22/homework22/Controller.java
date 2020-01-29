package lesson22.homework22;

public class Controller {
    private static TransactionDAO transactionDAO = new TransactionDAO();


    public static TransactionDAO getTransactionDAO() {
        return transactionDAO;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "transactionDAO=" + transactionDAO +
                '}';
    }

     public static Transaction  save(Transaction transaction) throws Exception {

     return TransactionDAO.save(transaction);
    }
     public static   Transaction[] transactionList(){

     return TransactionDAO.transactionList();

    }
 public static Transaction[] transactionList(String city){

       return TransactionDAO.transactionList(city);
    }
   public static Transaction[] transactionList(int amount){

      return TransactionDAO.transactionList(amount);

    }
}
