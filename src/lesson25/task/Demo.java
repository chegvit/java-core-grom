package lesson25.task;

public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDAO generalDAO = new GeneralDAO();
        Order order = new Order(1);
        generalDAO.validate(order);
        TestClass<String,Order,Long> testClass = new TestClass<>();
        System.out.println(testClass.dosomething1("rrwwr"));

        // long  - Long;
        // int -   Integer;
        //short - Short;
        int test = 1000;
        long variable = 1111;
        Long variable2 = 222L;
        generalDAO.validate(variable2);
        generalDAO.validate(test);
    }

}
