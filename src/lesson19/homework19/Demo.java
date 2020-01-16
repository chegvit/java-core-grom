package lesson19.homework19;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws Exception {
        File file1 = new File(12314,"name","txt",34536);
        File file2 = new File(24,"name4","jpg", 23424);
        File file3 = new File(355,"name3","exe", 657);
        File file4 = new File(24,"name4","sys",46);
        File file5 = new File(345,"cbcb","bat",58949);

        File[] files1 = new File[5];
         File[] files2 = new File[7];
         Storage storage2 = new Storage(35,files2,new String[] {"txt","exe","jpg","bat","rar","sys"},"Ukraine",123123242);
        Storage storage1 = new Storage(245,files1,new String[] {"txt","exe","jpg","rar"},"USA",557876677);
        Controller controller = new Controller();
        System.out.println(storage1);
      //  System.out.println(storage2);
       controller.put(storage1,file3);
     //   System.out.println(controller.occupiedSpaceOfStorage(storage));

       // System.out.println(Arrays.toString(storage.getFiles()));
        System.out.println(storage1);
        controller.put(storage1,file2);
        //System.out.println(storage);
      //  controller.delete(storage1,file4);
        //System.out.println(storage1);
      //  controller.transferAll(storage1,storage2);
        //System.out.println(storage2);
       // controller.put(storage1,file5);
       // System.out.println(storage1);
        //controller.delete(storage1,file1);
        //System.out.println(storage1);
        //controller.delete(storage1,file2);
      //  System.out.println(storage1);
        //controller.delete(storage1,file3);

       System.out.println(storage1);
     //  controller.delete(storage1,file2);
       // System.out.println(storage1);
      controller.transferAll(storage1,storage2);
      //  controller.transferFile(storage1,storage2,355);
        System.out.println(storage2);
    }
}
