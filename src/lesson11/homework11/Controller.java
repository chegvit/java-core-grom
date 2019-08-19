package lesson11.homework11;

import java.util.Date;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public API[] getApis() {
        return apis;
    }



    Room[] requestRooms(int price, int persons, String city, String hotel){

      /*       for (int j = 0; j < apis.length; j++) {
                if( apis[j].findRooms(price, persons, city, hotel) != null){
                   return apis[j].findRooms(price,persons,city,hotel);
                }

                 }
        return null;*/
        Room[] rooms = new Room[findRoomsByParams(price,persons,city,hotel)];
        int index = 0 ;
        for(API api : apis){
            for(Room room : api.findRooms(price,persons,city,hotel)){
               rooms[index] = room;
                index++;
            }
        }
        return rooms;
             }

      private int findRoomsByParams(int price, int persons,String city,String hotel){

        int count = 0;
        for(API api : apis){
            count += api.findRooms(price,persons,city,hotel).length;
       }
        return count;
       }

    Room[] check(API api1, API api2){

   return findCommonRooms(api1.getAll(),api2.getAll());

    }
    private Room[] findCommonRooms(Room[] roomsAPI1, Room[] roomsAPI2){
        int count = 0;
        for(Room roomAPI1 : roomsAPI1){
            for( Room roomAPI2 : roomsAPI2){
                if(roomAPI1.getPrice() == roomAPI2.getPrice() && roomAPI1.getPersons() == roomAPI2.getPersons()
                && roomAPI1.getCityName() == roomAPI2.getCityName() && roomAPI1.getHotelName() == roomAPI2.getHotelName()) {
                    count++;
                }

                }
            }
        Room[] res = new Room[count];
        int index = 0;
        for(Room roomAPI1 : roomsAPI1){
            for( Room roomAPI2 : roomsAPI2){
                if(roomAPI1.getPrice() == roomAPI2.getPrice() && roomAPI1.getPersons() == roomAPI2.getPersons()
                        && roomAPI1.getCityName() == roomAPI2.getCityName() && roomAPI1.getHotelName() == roomAPI2.getHotelName()) {
                    res[index] = roomAPI1;
                    index++;
                }

            }
        }
       return res;
        }


    Room cheapestRoom(){


    return null;

    }
}
