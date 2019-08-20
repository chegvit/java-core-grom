package lesson6;

public class Car {
    //test git
    
    //1 fields
    int price;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;


    //2 constructors
    public Car(int price, int yearOfManufactoring, String ownerName) {
        this.price = price;
        this.yearOfManufacturing = yearOfManufactoring;
        this.ownerName = ownerName;
    }


    //3 methods
    void startRun(){
        System.out.println("I am running....");
    }

    void stopRun (){
        System.out.println("I am stopping....");
    }

    void changeOwner(String newOwnerName){
        ownerName = newOwnerName ;

    }

}
