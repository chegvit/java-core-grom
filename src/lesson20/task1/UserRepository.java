package lesson20.task1;

import lesson20.task1.exception.BadRequestException;
import lesson20.task1.exception.InternalServelException;
import lesson20.task1.exception.UserNotFoundException;

public class UserRepository {
    private User[] users = new User[10];

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                count++;
        }
        String[] names = new String[count];

        for (int j = 0; j < count; j++) {
            if (users[j] != null) {
                names[j] = users[j].getName();
            }
        }


        return names;

    }

    public long[] getUserIds() {
        //

        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null)
                count++;
        }
        long[] ids = new long[count];

        for (int j = 0; j < count; j++) {
            if (users[j] != null) {
                ids[j] = users[j].getId();
            }
        }


        return ids;


    }

    public String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i].getName();
            }

        }
        return null;
    }

    public User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (name == users[i].getName())) {
                return users[i];
            }
        }
        return null;
    }

    public User getUserById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i];
            }
        }
        return null;

    }

    public User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (sessionId == users[i].getSessionId())) {
                return users[i];
            }
        }
        return null;


    }

    public User findById(long id) throws UserNotFoundException {

        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId()))
                return users[i];
            }
           throw new UserNotFoundException("User with id:" + id + " not found ");
        }



    public User save (User user ) throws Exception {
        if(user == null)
        throw new BadRequestException("Can't save null user");
       try {
           findById(user.getId());
           throw new BadRequestException("User with id:" + user.getId() + " already exist");
       }
       catch (UserNotFoundException e){
           System.out.println("User with id:"+ user.getId() + " not found. Will be saved") ;
      }


     //   int count = 0;
       // for (User el : users){
         //   if((el != null) )
           //     count++;
        //}
       // if(count > 9)
         //   return null;
        int i = 0;
        for(User el : users){
            if(el == null){
                users[i] = user;

                 return users[i];
            }
            i++;
        }
      throw new InternalServelException("Not enough space to save user with id:" + user.getId());

    }

    public User update(User user) throws Exception{
        if(user == null)
            throw new BadRequestException("Can't update null user");
         findById(user.getId());

        int i = 0;
        for (User el : users){
            if((el != null) && (el.getId() == user.getId())){
                users[i] = user;
               return users[i];

            }
            i++;
        }
      throw new  InternalServelException("Unexpected error");
    }

    public void delete(long id) throws Exception{
        findById(id);

        int i = 0;
        for(User el : users){
            if(el.getId() == id){
                users[i] = null;
                break;
            }
            i++;
        }

        }
    }






