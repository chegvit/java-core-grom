package lesson24.exercise;

import java.util.Arrays;

public class Demo<s> {
    public static void main(String[] args) {
        GeneralDAO<Sys>systemDAO = new GeneralDAO<>();
        Sys system1 = new Sys(12,"....");
        systemDAO.save(system1);
        System.out.println(Arrays.deepToString(systemDAO.getAll()));
        GeneralDAO<Tool>toolDAO = new GeneralDAO<>();
        Tool tool1 = new Tool("erre","some");
         toolDAO.save(tool1);
        System.out.println(Arrays.toString(toolDAO.getAll()));
        GeneralDAO<Order>oderDAO = new GeneralDAO<>();
    }

}
