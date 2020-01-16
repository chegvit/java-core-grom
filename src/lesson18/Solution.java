package lesson18;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String text = "123 wokl sdf 565 -1 0 5555555555";
        System.out.println(Arrays.toString(findNumbers(text)));


    }

    public static int[] findNumbers(String text){
     if(text.isEmpty())
         return null;
     String[] words = text.split(" ");
     int count = 0;
     for(int i = 0; i < words.length; i++){
         if(isStringInteger(words[i])){
             count++;
         }
     }
     int[] result = new int[count];
     int i = 0;
     for(String word : words){
         if(isStringInteger(word)){
         result[i] =  Integer.parseInt(word);

             i++;
         }
     }
      return result;
    }

    private static boolean isStringInteger(String word ){
        try{
            Integer.parseInt(word);
        }catch(Exception e ){
            System.out.println(word + " not a number");
            return false;
        }
        return true;
    }


}

