package lesson25.homework;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        GeneralDAO <String>stringDAO = new GeneralDAO<>();
        GeneralDAO<Integer>integerDAO = new GeneralDAO<>();
        String array1 = "weet";
        String array2 = "tyuyuu";
        Integer array3 = 1133;
        Integer array4 = 34242;
        stringDAO.save(array1);
        stringDAO.save(array2);
        System.out.println(Arrays.deepToString(stringDAO.getAll()));
        integerDAO.save(array3);
        integerDAO.save(array4);
        integerDAO.save(array3);
     //   stringDAO.save(array1);

        System.out.println(Arrays.deepToString(integerDAO.getAll()));


    }
}
