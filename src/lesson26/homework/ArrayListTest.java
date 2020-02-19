package lesson26.homework;

import java.util.ArrayList;

public class ArrayListTest {
 private Order[] orders;

    public ArrayListTest(Order[] orders) {
        this.orders = orders;
    }

    public ArrayList<Order> useList(){
        ArrayList<Order> list = new ArrayList<>();
         for(int i = 0; i < 3; i++){
            list.add(orders[i]);
        }
      ArrayList<Order> list1 = new ArrayList<>();
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
     //  list.toArray();
       return list;
        }
    }

