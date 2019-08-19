package lesson9;

import lesson9.utils.Checker;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        User[] users = new User[]{
                new User(125, "Nikolay", "Session1"),
                new User(23, "Vadim", "Session2"),
                new User(89, "Vadim", "Session3"),

        };

       /* Company company = new Company();
        System.out.println(company.getCountryFounded());
        System.out.println(company.getName());

       // company.setName("IBM"); = "IBM";
        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.getName()));
      //  System.out.println(checker.companyNamesValidatedCount);*/
        UserRepository userRepository = new UserRepository( users);
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.toString(userRepository.getUserIds()));
        System.out.println(userRepository.getUserNameById(15));
        System.out.println(Arrays.toString(users));
        System.out.println(Arrays.toString(userRepository.getUserNames()));
        System.out.println(Arrays.deepToString(users));
        System.out.println(userRepository.getUserByName("Vadim"));
    }
}
