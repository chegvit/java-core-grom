package lesson22.homework22;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception{

        Transaction transaction = new Transaction(123,"Kiev",20,"aaaaa", TransactionType.INCOME,new Date());
        Transaction transaction1 = new Transaction(234,"Odessa",20,"wwrr", TransactionType.OUTCOME,new Date());
        Transaction transaction2 = new Transaction(54,"Kiev",35,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction3 = new Transaction(55,"Kiev",30,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction4 = new Transaction(56,"Kiev",5,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction5 = new Transaction(57,"Kiev",5,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction6 = new Transaction(58,"Kiev",5,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction7 = new Transaction(59,"Kiev",5,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction8 = new Transaction(51,"Kiev",5,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction9 = new Transaction(52,"Kiev",30,"dgfh", TransactionType.OUTCOME,new Date());
        Transaction transaction10 = new Transaction(53,"Kiev",15,"dgfh", TransactionType.OUTCOME,new Date());
       Controller.save(transaction);
        //System.out.println(Arrays.toString(controller.getTransactionDAO().getTransactions()));
        Controller.save(transaction1);
      //  System.out.println(Arrays.toString(controller.getTransactionDAO().getTransactions()));
        Controller.save(transaction2);
        Controller.save(transaction3);
       // controller.save(transaction4);
        //controller.save(transaction5);
        //controller.save(transaction6);
        //controller.save(transaction7);
        //controller.save(transaction8);
        //controller.save(transaction9);
        //controller.save(transaction10);
        System.out.println(Arrays.toString(TransactionDAO.getTransactions()));
        System.out.println(Arrays.toString(Controller.transactionList()));
        System.out.println(Arrays.toString(Controller.transactionList(20)));
        System.out.println(Arrays.toString(Controller.transactionList("Odessa")));
      //  controller.save(transaction);
        System.out.println(Arrays.toString(TransactionDAO.getTransactions()));




    }
}
