package lesson18;

import java.util.Arrays;

public class Solution1 {
    public static void main(String[] args) {
        String text = "-123   ssfsf 123243546677788 555555555 5 0 234";
        System.out.println(Arrays.toString(findNumbers(text)));

    }

    public static int[] findNumbers(String text){
        if(text.isEmpty())
            return null;
        String[] words = text.split(" ");
        int count = 0;
        for(String word : words){
            if(isStringInteger(word) ){
                count++;
            }
            else
                System.out.println(word + " not a number");
        }
        int[] result = new  int [count];
         int i = 0;
         for(String word : words){
             if(isStringInteger(word)){
                 result[i] = Integer.parseInt(word);
                 i++;
             }

         }
       return result;

    }
    private static boolean isStringInteger(String word){
        if(word.isEmpty())
           return false;
        if(word.length() > 11)
           return false;
         for(int i = 0; i < word.length(); i++){
             if(i == 0 && word.charAt(i) == '-')
                 continue;
             if(!Character.isDigit(word.charAt(i)) ){
                 return false;
             }
         }


         return true;
    }
}



