package lesson8.ArithmeticAdd;

public class Demo {

    public static void main(String[] args) {
        int[] array = { 12, 0, -2};

        Adder adder = new Adder();
        System.out.println(adder.check(array));
        System.out.println(adder.add(24,35));
    }
}
