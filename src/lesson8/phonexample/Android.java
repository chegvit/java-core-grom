package lesson8.phonexample;

public class Android extends Phone {

   // int price;
   // double weight;
    //String countryProduced;
    String androidVersion;
    int screenSize;
    String secretDeviseCode;

    public Android(int price, double weight, String countryProduced, String androidVersion, int screenSize, String secretDeviseCode) {
       // this.price = price;
        //this.weight = weight;
        //this.countryProduced = countryProduced;
        super(price,weight,countryProduced);
        System.out.println("Android constructor was invoked...");
        this.androidVersion = androidVersion;
        this.screenSize = screenSize;
        this.secretDeviseCode = secretDeviseCode;
    }

  //  void orderPhone(){

  //  }
    void installNewAndroidVersion(){
        System.out.println("installNewAndroidVersion invoked...");

    }
}
