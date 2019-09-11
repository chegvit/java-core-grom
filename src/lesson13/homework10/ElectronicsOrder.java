package lesson13.homework10;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonths;

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonths) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonths = guaranteeMonths;
    }

    @Override
    public void validateOrder() {



        //   if(getCustomerOwned().getCity() != null && getCustomerOwned().getGender() != null ){

         if (getCustomerOwned().getCity() == "Киев" || getCustomerOwned().getCity() == "Одесса" ||
              getCustomerOwned().getCity() == "Днепр" || getCustomerOwned().getCity() == "Харьков") {

        if (getShipFromCity() == "Киев" || getShipFromCity() == "Одесса" || getShipFromCity() == "Днепр"
                || getShipFromCity() == "Харьков") {
          //  if (getCustomerOwned().getCity() != null && getCustomerOwned().getName() != null && getCustomerOwned().getGender() != null){

                if (getBasePrice() >= 100) {
                if (getShipToCity() == "Киев" || getShipToCity() == "Одесса" || getShipToCity() == "Днепр"
                        || getShipToCity() == "Харьков") {
                    if (getCustomerOwned().getGender() == "Женский") {

                        setDateConfirmed(new Date());

                    }
                }

            }

        }

    }

      }

    @Override
    public void calculatePrice() {

        double shippingCost;


            if (getShipToCity() == "Киев" || getShipToCity() == "Одесса") {
                shippingCost = getBasePrice() * 0.1;
            } else {
                shippingCost = getBasePrice() * 0.15;
            }
            if (getBasePrice() > 1000) {
                setTotalPrice(0.95 * (getBasePrice() + shippingCost));
            } else {
                setTotalPrice(getBasePrice() + shippingCost);
            }


        }

    }
