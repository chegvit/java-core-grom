package lesson15.homework15.userepository;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
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


    public User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i];
            }

        }
        return null;


    }
  public User  findUser(User user){
        for (User el : users){
            if(el != null && el.equals(user) && el.hashCode() == user.hashCode()){
                return user;
            }
        }
        return null;
  }
}
