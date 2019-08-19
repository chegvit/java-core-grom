package lesson12;

public class Main {
    public static void main(String[] args) {
        Bank usBank = new USBank(1222,"Sweden",Currency.EUR,100,1400,4,44443434);
        Bank euBank = new EUBank(1213,"Denmark",Currency.EUR,200,1450,5,23400000);
        Bank chinaBank = new ChinaBank(6465,"China",Currency.USD,230,1800,6,20000000);
        User user = new User(1001,"Denis",12200,40,"GMD",20000,usBank);
        User user1 = new User(23425,"Petr",2344, 50,"Apple", 2300,usBank);
        User user2 = new User(675,"Jhon", 20000,34,"UMC",2000,euBank);
        User user3 = new User(353,"Michael",10000,45,"Adidas",2500,euBank);
        User user4 = new User(869,"Jack",23000,89,"Nike",3000,chinaBank);
        User user5 = new User(8756,"Daniel",15500,43,"Oracle",3400,chinaBank);
         BankSystem bankSystem = new UkrainianBankSystem();
         bankSystem.withdraw(user,150);
        System.out.println(user.getBalance());
         bankSystem.fund(user,20000);
        System.out.println(user.getBalance());
         bankSystem.transferMoney(user,user1,300);
        System.out.println(user.getBalance());
        System.out.println(user1.getBalance());
         bankSystem.paySalary(user);
        System.out.println(user.getBalance());
         bankSystem.transferMoney(user1,user,1100);
        System.out.println(user1.getBalance());
        bankSystem.withdraw(user1,400);
        System.out.println(user1.getBalance());
        bankSystem.fund(user1,234);
        System.out.println(user1.getBalance());
        bankSystem.paySalary(user);
        System.out.println(user.getBalance());
    }
}
