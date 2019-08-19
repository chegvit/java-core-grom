package lesson8.ClassHierarchy;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
    Demo.createHighestParent();
    Demo.createLowestChild();

    }
  static   Student createHighestParent (){

          Course[] coursesTaken = new Course[0];
          Student student = new Student("Ivan","Petrenko",23,coursesTaken);
          return student;
   }
 static  SpecialStudent  createLowestChild(){
       Course[] coursesTaken = new Course[0];
        SpecialStudent specialStudent = new SpecialStudent("Ivan","Petrenko",23,coursesTaken,123,"ivan@gmail.com");
        return specialStudent;
    }
}
