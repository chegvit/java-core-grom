package lesson3;

public class FindOdd {
    public static void main(String[] args) {
        int number = 0;
       // int sumodd = 0;

        while (number <= 1000) {
            if (number % 2 != 0)
                System.out.println("Found");
               // sumodd = sumodd + number;
            number++;}
            System.out.println(number);
        }
      //  System.out.println(sumodd);
      /*  if (sumodd * 5 > 5000) {
            System.out.println("Bigger");
        } else {
            System.out.println("Smaller or equal");
        }*/
    }






