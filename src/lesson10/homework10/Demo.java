package lesson10.homework10;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Customer customerOwned = new Customer("Петр", "Киев","Женский");
        ElectronicsOrder electronicsOrder = new ElectronicsOrder("Дрель", new Date(),"Днепр","Киев",1300,customerOwned,12);
        ElectronicsOrder electronicsOrder1 = new ElectronicsOrder("Принтер", new Date(),"Харьков","Киев",600,customerOwned,12);
        FurnitureOrder furnitureOrder = new FurnitureOrder("Стол", new Date(),"Львов","Киев",2234,customerOwned,"SomeCode");
        FurnitureOrder furnitureOrder1 = new FurnitureOrder("Стул", new Date(),"Киев","Киев",3234,customerOwned,"SomeCode");

       electronicsOrder.validateOrder();
       electronicsOrder.calculatePrice();
       electronicsOrder.confirmShipping();

       electronicsOrder1.validateOrder();
       electronicsOrder1.calculatePrice();
       electronicsOrder1.confirmShipping();

       furnitureOrder.validateOrder();
       furnitureOrder.calculatePrice();
       furnitureOrder.confirmShipping();

       furnitureOrder1.validateOrder();
       furnitureOrder1.calculatePrice();
       furnitureOrder1.confirmShipping();

        System.out.println(furnitureOrder.getTotalPrice());
        System.out.println(electronicsOrder.getDateConfirmed());
        System.out.println(electronicsOrder.getTotalPrice());
    }

}
