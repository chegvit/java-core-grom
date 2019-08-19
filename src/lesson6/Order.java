package lesson6;

import lesson7.DemoHomeWork;


import java.util.Date;

public  class Order {
    public static void main(String[] args) {
        DemoHomeWork or = new DemoHomeWork();
        DemoHomeWork or1 = new DemoHomeWork();
         or.createOrder();
         or1.createOrderAndCallMethods();


    }

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public  Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;


    }

    public Order() {

    }

   public void confirmOrder() {
        if (!isConfirmed)
            isConfirmed = true;
        dateConfirmed = new Date();
        System.out.println(dateConfirmed);


    }

 public   boolean checkPrice() {

        return price > 1000;
    }

 public   boolean isValidType() {

        String Buy = null;
        String Sale = null;

        if (type == Buy || type == Sale)
            return true;
        else
            return false;
    }
}






