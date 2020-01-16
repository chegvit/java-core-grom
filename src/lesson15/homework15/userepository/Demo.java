package lesson15.homework15.userepository;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        User[] users = new User[3];
        User user1 = new User(111,"Kolya","sessionId1");
        User user2 = new User(234,"Petr","sessionId2");


        UserRepository userRepository = new UserRepository(users);
        userRepository.save(user1);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        user2 = new User(244,"Petr","hjhjl");
        userRepository.update(user2);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
    }
}
