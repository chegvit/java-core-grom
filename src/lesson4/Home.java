package lesson4;

public class Home {
    public static void main(String[] args) {
        short a = 5;
        short b = 20;
        int n = 3; int count = 0;
        for( int i = a; i <= b; i++){
            if(i % n == 0)

                count ++;

        }
        System.out.println(count);
    }

}
