package lesson18;

public class Definition {

    private void notifyUsers(String[] userEmails){
         for(String email : userEmails){
             try {
                 //send email user - error
                 System.out.println("Email" + email + "sent");
             } catch (Exception e){
                 //how should I handle exeption
                 System.err.println("Email" + email + "not sent ");
             }
             finally {

             }

             }


         }
         //1
         //2
         //3
    }


