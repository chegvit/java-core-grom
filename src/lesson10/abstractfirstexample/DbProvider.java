package lesson10.abstractfirstexample;

public abstract class DbProvider {
    private String DbHost;
 abstract  void connectToDb();

  abstract void diconnectFromdb();

  void printDbHost(){
      System.out.println("DbHost is" + DbHost);
  }

}
