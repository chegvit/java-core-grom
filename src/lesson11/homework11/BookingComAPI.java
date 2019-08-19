package lesson11.homework11;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
        public Room[] findRooms(int price, int persons, String city, String hotel) {
            int count = 0;
           for (Room room : rooms) {

                   if ((price >= room.getPrice() - 100) && (price <= room.getPrice() + 100)
                       && (persons == room.getPersons()) && (city == room.getCityName())
                               && (hotel == room.getHotelName())) {

                           count++;
                       }

                   }

            Room[] result = new Room[count];
               int j = 0; int i = 0;
            for (Room room : rooms) {
                   if ((price >= room.getPrice() - 100) && (price <= room.getPrice() + 100))
                        if ((persons == room.getPersons() && (city == room.getCityName())
                                && (hotel == room.getHotelName()))) {
                            result[j] = rooms[i];
                            j++;
                        }
                          i++;
                }
             return result;
            }











    @Override
    public Room[] getAll() {
        return  rooms ;
    }
}
