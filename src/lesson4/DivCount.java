 package lesson4;

public class DivCount {
    public static void main(String[] args) {
        short c = 2; short d = 19; int k =5;
        System.out.println(findDivCount(c, d, k )) ;


    }

    public static int findDivCount(short a, short b, int n)

           {
             int count = 0;

                   for (int i = a; i <= b; i++) {
                       if (i % n == 0)
                           count++;
                   }

                 return  count ;
           }

    }

