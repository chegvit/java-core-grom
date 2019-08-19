package lesson7;

import lesson6.Order;

import java.util.Date;

public  class DemoHomeWork {

//my comment

    Order demo = new Order ( 100,new Date(),false, null,"Dnepr","Ukraine","Buy");


  public   Order createOrder() {

      return demo;
  }
    public  Order createOrderAndCallMethods(){

       Order demo1 = new Order(100, new Date(),true, new Date(),"Kiev", "Ukraine","SomeValue");
         demo1.checkPrice();
         demo.checkPrice();
         demo.confirmOrder();
         demo.isValidType();
         demo1.confirmOrder();
         demo1.isValidType();
         return demo1;
   }
}

