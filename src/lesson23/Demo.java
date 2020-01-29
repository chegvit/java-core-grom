package lesson23;

public class Demo {
    public static void main(String[] args) {
        Validator validtor1 = new Validator("test");
        Validator validtor2 = new Validator("company");
        System.out.println(validtor1.getCheckCount());
        System.out.println(validtor2.getCheckCount());
    }
}
