package lesson10.polyexample;

import lesson10.polyexample.Human;

public class Child extends Human {
    public Child(String name) {
        super(name);
    }

    @Override
    void run() {
        System.out.println("Child class is called...");
        super.run();
    }


}
