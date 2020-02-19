package lesson26.homework;

public class Demo {
    public static void main(String[] args) {
        Order order0 =  new Order(23,342, "turt","mvn","jghjdg");
        Order order1 =  new Order(24,342, "turt","mvn","jghjdg");
        Order order2 =  new Order(25,342, "turt","mvn","jghjdg");
        Order order3 =  new Order(26,342, "turt","mvn","jghjdg");
        Order order4 =  new Order(27,342, "turt","mvn","jghjdg");
        Order order5 =  new Order(28,342, "turt","mvn","jghjdg");
        Order order6 =  new Order(20,342, "turt","mvn","jghjdg");
        Order order7 =  new Order(30,342, "turt","mvn","jghjdg");
        Order order8 =  new Order(31,342, "turt","mvn","jghjdg");
        Order order9 =  new Order(32,342, "turt","mvn","jghjdg");
        Order[] orders = {order0,order1,order2,order3,order4,order5,order6,order7,order8,order9};
        ArrayListTest arrayListTest = new ArrayListTest(orders);
        System.out.println(arrayListTest.useList());
    }
}
