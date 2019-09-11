package lesson13.homework10;

import lesson10.homework10.Customer;
import lesson10.homework10.ElectronicsOrder;
import lesson10.homework10.FurnitureOrder;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customerOwned = new Customer( "Jhon","London","Женский");
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Дрель", new Date(),"Киев","Днепр",1300,customerOwned,12);
        FurnitureOrder furnitureOrder = new FurnitureOrder("Стол", new Date(),null,"Днепр",2234,customerOwned,"SomeCode");

       electronicsOrder.validateOrder();
       electronicsOrder.calculatePrice();
       electronicsOrder.confirmShipping();

       furnitureOrder.validateOrder();
       furnitureOrder.calculatePrice();
       furnitureOrder.confirmShipping();

        System.out.println(furnitureOrder.getTotalPrice());
        System.out.println(electronicsOrder.getDateConfirmed());
        System.out.println(electronicsOrder.getTotalPrice());
        System.out.println(furnitureOrder.getDateConfirmed());



    }

}
