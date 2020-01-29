package lesson22.arrays;

public class ArrayUtils {

    public static int maxElement(int[] array){
        int max = array[0];
        for(int el : array){
            if(el > max)
                max = el;
        }
        return max;
    }
    public static int nCount(int[] array, int n){
        int count = 0;
        for(int el : array){
            if(el == n)
                count++;
        }
        return count;
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
