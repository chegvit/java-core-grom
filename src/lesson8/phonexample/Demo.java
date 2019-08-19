package lesson8.phonexample;

public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone(110, 10.0 ,"China",true);
        iPhone.deleteIPhoneFromdb();
        iPhone.orderPhone();

    }
}
