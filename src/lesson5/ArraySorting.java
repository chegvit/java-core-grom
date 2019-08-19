package lesson5;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] array = {25, 2, 12, 8, 23,2};

        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));

    }
  public static   int[] sortAscending (int[] array){

            boolean sort = false;
            int buf;
            while(!sort ){
                sort = true;
                for( int i = 0; i < array.length -1 ; i++){
                     if(array[i] > array[i + 1]){

                         sort = false;

                         buf = array[i];
                         array[i] = array[i+1];
                          array[i +1] = buf ;
                     }

                }

            }

                return  array;

  }

        public static int[] sortDescending(int[] array){

        boolean sort = false;
        int buf;
        while(!sort ){
            sort = true;
            for( int i = 0; i < array.length - 1; i++){
                if(array[i] < array[i + 1]){

                    sort = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }

            }

        }
            return array;
    }


}
