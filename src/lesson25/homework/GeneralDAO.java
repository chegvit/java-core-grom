package lesson25.homework;

public class GeneralDAO<T> {
    @SuppressWarnings("unchecked")
    private T[] array = (T[]) new Object[10];

   public T save(T t) throws Exception {
       validate(t);
          int i = 0;
          for (T el : array) {
               if (el == null){
                  array[i] = t;
                  return array[i];

              }
              i++;
          }
          return null;
      }


   public T[] getAll(){
       int count = 0;
       for(T el : array){
          if(el != null){
              count++;
          }
       }
       @SuppressWarnings("unchecked")
      T[] result = (T[]) new Object[count];
       int i = 0;
       for(T el : array){
           if(el != null){
               result[i] = el;
           }
           i++;
       }
       return result;
   }
   private void validate(T t) throws Exception {

          checkPlace();
          checkObject(t);



   }
   private void checkPlace() throws Exception {
       int count = 0;
       for(T el : array){
           if(el != null)
               count++;
       }
       if(count == array.length) {
           throw new Exception(" This object can't save. No place");
       }
   }
   private void checkObject(T t) throws  Exception {
       boolean findObject = false;
       for(T el : array){
           if(el != null && el.equals(t) ){
               findObject = true;
               break;
           }
       }
       if(findObject){
           throw new Exception("Object is already exist");
       }

    }

}


