package lesson11.homework11;

public class TripAdvisorAPI implements API {
    private  Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int count = 0;
        for (Room room : rooms) {
            if ((persons >= room.getPersons() - 1) && (persons <= room.getPersons() + 1)
                    && (price == room.getPrice()) && (city == room.getCityName())
                    && (hotel == room.getHotelName())) {
                count++;
            }

        }
        Room[] result = new Room[count];
        int i = 0;
        int j = 0;
        for (Room room : rooms) {
            if ((persons >= room.getPersons() - 1) && (persons <= room.getPersons() + 1)
                    && (price == room.getPrice()) && (city == room.getCityName())
                    && (hotel == room.getHotelName())) {
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
