package lesson2;

public class SumOfNumbers {
    public static void main(String[] args) {
        int number = 1;
        long sum = 0;

        while (number <= 1000) {
            sum = number + sum;
            number++;
        }
        System.out.println(sum);
    }
}
