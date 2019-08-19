package lesson9;

public class UserRepository  {
    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
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

    public User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i];
            }

        }
        return null;


    }
    public User save (User user ) {
      for (User el : users){
          if((el != null) && (el.getId() == user.getId()))
         return null;
      }
        int i = 0;
      for(User el : users){
          if(el == null){
              users[i] = user;
              return users[i];
          }
          i++;
      }

     return null;



           }

  public   User update(User user){
        int i = 0;
      for (User el : users){
          if((el != null) && (el.getId() == user.getId())){
              users[i] = user;

              return users[i] ;
          }
         i++;
      }
      return null;
  }

  public void delete(long id){

        for(int i = 0; i < users.length; i++){
            if((findById(id) != null) )
                users[i] = null;
            }


      }

        }











