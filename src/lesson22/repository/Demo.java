package lesson22.repository;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {

        User user1 = new User(1324, "Petro","5252355ljkkjkjk");
        UserRepository.save(user1);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        User user2 = new User(2425,"Olga","67489674fsfsfg");
        UserRepository.save(user2);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        User user3 = new User(1324,"Test","5252355ljkkjkjk");
        UserRepository.save(user3);
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));
        System.out.println(Arrays.deepToString(UserRepository.getUsers()));



    }
}
