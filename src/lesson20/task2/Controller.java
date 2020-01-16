package lesson20.task2;

public class Controller {
    private TransactionDAO transactionDAO = new TransactionDAO();


    public TransactionDAO getTransactionDAO() {
        return transactionDAO;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "transactionDAO=" + transactionDAO +
                '}';
    }

    Transaction save(Transaction transaction) throws Exception {

     return transactionDAO.save(transaction);
    }
  Transaction[] transactionList(){

     return transactionDAO.transactionList();

    }
  Transaction[] transactionList(String city){

       return transactionDAO.transactionList(city);
    }
    Transaction[] transactionList(int amount){

      return transactionDAO.transactionList(amount);

    }
}
