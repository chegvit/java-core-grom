package lesson16;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String test = "someStringExample";

        System.out.println(test.isEmpty());  // проверка пустой String или нет ;
        System.out.println(test.length());// возвращает длину String
        System.out.println(test.charAt(0));// находит конкретный char на конкретной позиции
        System.out.println(test.replace("me","T"));//

        System.out.println(test.replaceAll("me","T"));//замена String
        System.out.println(test.contains("mes"));// проверяет содержит ли String какую-то последовательность char;

        String phrase = "Hello there guys";//
        System.out.println(Arrays.toString(test.split(" ")));//делит массив String на массив подStringов
        System.out.println(Arrays.toString(phrase.split(" ")));//
        System.out.println(" test a".trim());// удаляет пробелы в начале и в конце String
        System.out.println(phrase.substring(5));// возвращает подString c какой-то позиции
        System.out.println(phrase.substring(5,10).trim());//
        System.out.println(test.toUpperCase());//приведение к верхнему регистру
        System.out.println(test.toLowerCase());//приведение к нижнему регистру

        test.getBytes();//
        test.equals("eeee");//
        test.intern();//
    }

}
