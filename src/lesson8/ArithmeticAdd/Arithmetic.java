package lesson8.ArithmeticAdd;

public class Arithmetic {
  //  int[] array ;

    //public Arithmetic(int[] array) {
      //  this.array = array;
   // }

    public boolean check(int[] array) {
        long max = array[0];
        long min = array[0];
        for (int el : array) {
            if (el > max){
                max = el;}
            if (el < min){
                min = el;}
        }
          return  max + min >100;
    }
}