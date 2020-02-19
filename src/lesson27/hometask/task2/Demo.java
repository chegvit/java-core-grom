package lesson27.hometask.task2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<User> users = new ArrayList<>();
        UserRepository userRepository = new UserRepository(users);
        User user1 = new User(234,"Kate","ert");
        User user2 = new User(76,"Denis","ddfd");
        User user3 = new User(89,"Andreiy", "jhkj");
        User user4 = new User(123,"Mary","vbn");
        System.out.println(userRepository.getUsers());
         userRepository.save(user1);
        System.out.println(userRepository.getUsers());
        userRepository.save(user2);
        userRepository.save(user4) ;
        System.out.println(userRepository.getUsers());
        System.out.println(userRepository.update(user1));
        userRepository.delete(89);
        System.out.println(userRepository.getUsers());
    }
}
