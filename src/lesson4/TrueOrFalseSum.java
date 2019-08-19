package lesson4;

 public class TrueOrFalseSum {
     public static void main(String[] args) {
         System.out.println(compareSums( 500,1235 , 678,78900));

     }

  public static long sum (int from , int to){

         long sum = 0;
          for( int i = from; i <= to; i++)
              sum+= i;
              return sum;

          }

   public static boolean compareSums (int a, int b, int c, int d){

            long sum1 = sum (a, b);
            long sum2 = sum ( c, d);
              if (sum1 > sum2 )
                  return true;
              else
                  return false;}





  }