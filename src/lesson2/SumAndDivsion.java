package lesson2;

public class SumAndDivsion {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;
        int div ;
        int mod;

          while (number <= 1000){
             sum = number + sum;
             number++;
        }

        div = sum / 1234;
        mod = sum % 1234;
        boolean res = div < mod;
        System.out.println(res);
    }

}
