package lesson15.equals;

public class Demo {
    public static void main(String[] args) {
        File file1 = new File(111,"home/Documents/test","txt");
        File file2 = new File(111,"home/Documents/image","jpg");
        File file3 = new File(111,"home/Documents/test","txt");
         File someFile = file1;

        System.out.println(file1.equals(file2));
        System.out.println(file1.equals(file3));
        System.out.println(file1 == file3);
        System.out.println(someFile == file1);
        System.out.println(file1.hashCode());
        System.out.println(file3.hashCode());
        User user = new User(10909);
        System.out.println(file1.equals(user));

    }
}
