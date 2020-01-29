package lesson20.task2;

import lesson20.task2.exeption.BadRequestException;
import lesson20.task2.exeption.InternalServerException;
import lesson20.task2.exeption.LimitExceeded;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws Exception{

        Transaction transaction = new Transaction(123,"Kiev",20,"aaaaa",TransactionType.INCOME,new Date());
        Transaction transaction1 = new Transaction(234,"Odessa",20,"wwrr",TransactionType.OUTCOME,new Date());
        Transaction transaction2 = new Transaction(54,"Kiev",35,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction3 = new Transaction(55,"Kiev",30,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction4 = new Transaction(56,"Kiev",5,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction5 = new Transaction(57,"Kiev",5,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction6 = new Transaction(58,"Kiev",5,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction7 = new Transaction(59,"Kiev",5,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction8 = new Transaction(51,"Kiev",5,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction9 = new Transaction(52,"Kiev",30,"dgfh",TransactionType.OUTCOME,new Date());
        Transaction transaction10 = new Transaction(53,"Kiev",15,"dgfh",TransactionType.OUTCOME,new Date());
        Controller controller = new Controller();
       controller.save(transaction);



        //System.out.println(Arrays.toString(controller.getTransactionDAO().getTransactions()));
        controller.save(transaction1);
      //  System.out.println(Arrays.toString(controller.getTransactionDAO().getTransactions()));
        controller.save(transaction2);
        controller.save(transaction3);
       // controller.save(transaction4);
        //controller.save(transaction5);
        //controller.save(transaction6);
        //controller.save(transaction7);
        //controller.save(transaction8);
        //controller.save(transaction9);
        //controller.save(transaction10);
        System.out.println(Arrays.toString(controller.getTransactionDAO().getTransactions()));
        System.out.println(Arrays.toString(controller.transactionList()));
        System.out.println(Arrays.toString(controller.transactionList(20)));
        System.out.println(Arrays.toString(controller.transactionList("Odessa")));
      //  controller.save(transaction);
        System.out.println(Arrays.toString(controller.getTransactionDAO().getTransactions()));




    }
}
