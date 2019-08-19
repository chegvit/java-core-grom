package lesson5;

public class UniqueArrayNunbers {
    public static void main(String[] args) {
        int[] array = {25, 2, 8, 2, 7, 2, 6, 8, };
        System.out.println(uniqueCount(array));

    }

    public static int uniqueCount(int[] array) {
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < array.length; i++) {
            count++;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count1++;
                    break;
                }


            }


        }

        return count - count1;


    }


}







