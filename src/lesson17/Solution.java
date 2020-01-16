package lesson17;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String input = "It// so 23the is< to so      so wonderfull wonderfull w world";
        System.out.println(countWords(input));
        maxWord(input);
        minWord(input);
        System.out.println(input.isEmpty());
        System.out.println(mostCountedWord(input));
    }

    public static int countWords(String input) {
        String[] words = input.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (checkWord(words[i]))
                count++;
        }
        return count;

    }

    private static boolean checkWord(String word) {
        if (word != null && word.length() > 0) {
            char[] symbols = word.toCharArray();
            for (char c : symbols) {
                if (!Character.isLetter(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


    public static String maxWord(String input){
      String[] words = input.split(" ");
      if (words.length == 0 )
      return null;
      String maxWord = null;
      for(String word : words){
          if(word.length() > 0 && checkWord(word)){
              maxWord = word;
              break;
          }
      }
        if( maxWord == null)
            return null;
       for(String word : words) {
           if(word.length() > maxWord.length() && checkWord(word)){
               maxWord = word;
           }
       }
       return maxWord;
    }


    public static String   minWord(String input){

        String[] words = input.split(" ");
        if (words.length == 0 )
            return null;
        String minWord = null;
        for(String word : words){
            if(word.length() > 0 && checkWord(word)){
                minWord = word;
                break;
            }
        }
        if( minWord == null)
            return null;
        for(String word : words) {
            if(word.length() < minWord.length() && checkWord(word)){
                minWord = word;
            }
        }
        return minWord;
    }

public static String mostCountedWord(String input){
        if(input.isEmpty())
            return null;
        String[] words = input.split(" ");
        int maxCount = 0;
        String mostFrequent = null;
        for(String word : words){
            int count = 0;
            for(String item : words) {
                if (word.equals(item) && word.length() > 0 && checkWord(item)) {
                    count++;
                }
            }
                if(maxCount < count){
                    maxCount = count;
                    mostFrequent = word;

                }

        }
 return mostFrequent;

}
}
