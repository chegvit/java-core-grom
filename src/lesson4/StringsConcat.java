package lesson4;

public class StringsConcat {
    public static void main(String[] args) {
        System.out.println(concat("I like ", "learnig ", "Java"));
    }


    public static String concat(String firststr, String secondstr, String thirdstr) {

        return firststr + secondstr + thirdstr;
    }

}