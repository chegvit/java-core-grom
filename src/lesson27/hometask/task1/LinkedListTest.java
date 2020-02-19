package lesson27.hometask.task1;


import java.util.LinkedList;

public class LinkedListTest {
    private Order[] orders;

    public LinkedListTest(Order[] orders) {
        this.orders = orders;
    }

    public LinkedList<Order> useList(){
        LinkedList<Order> list = new LinkedList<>();
        for(int i = 0; i < 3; i++){
            list.add(orders[i]);
        }
        LinkedList<Order> list1 = new LinkedList<>();
        for(int i = 3; i < 9; i++){
            list1.add(orders[i]);
        }
        list.clear();
        //  for(int i = 0; i < 3; i++) {
        //   list.add(orders[i]);
        // }
        list.addAll(list1);
        list.remove(0);
        list.remove(orders[6]);
        list.add(0,orders[9]);
        list.set(2,orders[5]);
        if(list.contains(orders[4])){
            list.set(3,orders[4]);
        }
        list.subList(0,4);
          list.toArray();
        return list;
    }

}
