package lesson8.phonexample;

import lesson8.phonexample.Phone;

public class IPhone extends Phone {

    boolean fingerPrint;


    public IPhone(int price, double weight, String countryProduced, boolean fingerPrint){
        super(price,weight,countryProduced);
        System.out.println("IPhone constructor was invoked");
        this.fingerPrint = fingerPrint;
    }

   // void orderPhone(){

  //  }
  public  void deleteIPhoneFromdb(){
        System.out.println("deleteIPhoneFromDb invoked...");

    }
}
