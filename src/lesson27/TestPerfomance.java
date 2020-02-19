package lesson27;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TestPerfomance {
    public static void main(String[] args) {
        testAddMethod();;
        testRemoveMethod();
         testGetMethod();


    }
    private static void testAddMethod(){
        ArrayList<String> arrayList = new ArrayList<>();
        Date start = new Date();
        for(int i = 0; i < 1_000_00; i++){
            arrayList.add(i,String.valueOf(i));
        }
        Date finish = new Date();
        long diff = finish.getTime() - start.getTime();
        System.out.println(" add - array list: " + diff);

        LinkedList<String> linkedList = new LinkedList<>();
        Date start1 = new Date();
        for(int i = 0; i < 1_000_00; i++){
            linkedList.add(i,String.valueOf(i));
        }
        Date finish1 = new Date();
         diff = finish1.getTime() - start1.getTime();
        System.out.println(" add - linked list: " + diff);
    }
    private static void testRemoveMethod(){
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < 1_000_00; i++){
            arrayList.add(i,String.valueOf(i));
        }
        Date start = new Date();

        for(int i = 0; i < 1_000_00; i++){
            arrayList.remove(0);
        }

        Date finish = new Date();

        long diff = finish.getTime() - start.getTime();
        System.out.println(" remove - array list: " + diff);

        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 0; i < 1_000_00; i++){
            linkedList.add(i,String.valueOf(i));
        }
        Date start1 = new Date();

        for(int i = 0; i < 1_000_00; i++){
            linkedList.remove(0);
        }

        Date finish1 = new Date();
         diff = finish1.getTime() - start1.getTime();
        System.out.println(" remove - linked list: " + diff);

    }
    private static void testGetMethod(){
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i < 1_000_00; i++){
            arrayList.add(i,String.valueOf(i));
        }
        Date start = new Date();

        for(int i = 0; i < 1_000_00; i++){
            arrayList.get(50000);
        }

        Date finish = new Date();

        long diff = finish.getTime() - start.getTime();
        System.out.println(" get - array list: " + diff);

        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 0; i < 1_000_00; i++){
            linkedList.add(i,String.valueOf(i));
        }
        Date start1 = new Date();

        for(int i = 0; i < 1_000_00; i++){
            linkedList.get(50000);
        }

        Date finish1 = new Date();
        diff = finish1.getTime() - start1.getTime();
        System.out.println("get  - linked list: " + diff);

    }
}
