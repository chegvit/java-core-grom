package lesson20.task1;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        UserRepository userRepository = new UserRepository();
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        User user = new User(1001, "Ann", "qwe11233");
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //сохранение юзера*
        //сохранение того же юзера*
        //когла нет места в массиве*
        //когда сохраняем null*
        int n = 15;
        while (n > 0) {
            User user1 = new User(n, "Ann", "qwe11233");
            System.out.println(userRepository.save(user1));
            n--;
        }
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        userRepository.save(null);

        // test update
        user = new User(1001, "Ann", "fhdjd");
        userRepository.update(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));

        //нет юзера
        user = new User(6564, "Ann", "fhdjd");
        userRepository.update(user);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
        System.out.println(userRepository.update(null));
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
       userRepository.delete(1001);
        System.out.println(Arrays.deepToString(userRepository.getUsers()));
    }


}
