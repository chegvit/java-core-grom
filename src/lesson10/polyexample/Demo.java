package lesson10.polyexample;

import lesson10.polyexample.Human;
import lesson10.polyexample.User;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human("Test");
        run(human);
        System.out.println();
        User user = new User("Jack");
        run(user);

    }
    private static void run(Human human){
        human.run();
    }
}
