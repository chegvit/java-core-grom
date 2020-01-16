package lesson19;

public class RuntimeExeptionExample {
    public static void main(String[] args) {
        //arithmetic exeption
      //  arithmeticExeption(2);
        try {
            arithmeticExeption(0);
        }
        catch (ArithmeticException e){
            System.out.println("something wrong");
        }
      npe(new Object());
      npe(null);

    }
    private static void arithmeticExeption(int a){
        System.out.println(10 / a);
    }
    private static void npe(Object object){
       // try{
         //   System.out.println(object.hashCode());
        //}
       // catch (NullPointerException e){
         //   System.out.println();
       // }
        if(object != null){
            System.out.println(object.hashCode());
        }
    }
}
