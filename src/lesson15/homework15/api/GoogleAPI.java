package lesson15.homework15.api;

public class GoogleAPI implements API {
    private  Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;

        for (Room room : rooms) {

            if ((price == room.getPrice()) && (persons == room.getPersons())
                    && (city.equals(room.getCityName())) && (hotel.equals(room.getHotelName()))) {
                count++;
            }


        }

        Room[] result = new Room[count];
        int j = 0;int i =0;
        for(Room room : rooms){
            if((price == room.getPrice()) && (persons == room.getPersons())
                    && (city.equals(room.getCityName())) && (hotel.equals(room.getHotelName()))){
                result[j] = rooms[i];
                j++;

            }
              i++;

        }

       return result;
    }




    @Override
    public Room[] getAll() {
        return rooms;
    }
}
