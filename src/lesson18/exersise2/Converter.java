package lesson18.exersise2;

public class Converter {
    public static void main(String[] args) {
        System.out.println(intToString(242442));
        System.out.println(stringToInt("-23"));
        System.out.println(stringToInt("world"));
    }
    public static String intToString(int input ){
        return String.valueOf(input);
    }
    public static int stringToInt(String input){
        try {
            return Integer.parseInt(input);
        }catch (Exception e){
            System.err.println(input + " can not be converted to int");
            return 0;
        }

    }
}
