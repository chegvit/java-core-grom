package lesson15.homework15.api;

public interface API {
    Room[] findRooms(int price, int persons, String city, String hotel);
    Room[] getAll();
}
