package lesson27.hometask.task2;


import java.util.ArrayList;

public class UserRepository {


    private ArrayList<User> users;

    public UserRepository(ArrayList<User> users) {
        this.users = users;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User findById(long id) throws Exception {

            int i = 0;

            for (User el : users) {
                if ((el != null) && (id == el.getId())) {
                    return users.get(i);
                }
                i++;
            }

            throw new Exception("User with id:" + id + " not found ");
    }

    public User save(User user) throws Exception {
        if (user == null)
            throw new Exception("Can't save null user");
        try {
            findById(user.getId());
            throw new Exception("User with id:" + user.getId() + " already exist");
        } catch (Exception e) {
            System.out.println("User with id:" + user.getId() + " not found. Will be saved");
        }


        //   int count = 0;
        // for (User el : users){
        //   if((el != null) )
        //     count++;
        //}
        // if(count > 9)
        //   return null;

//        for(User el : users){
//            if(el == null){
        users.add(user);
        return user;
//            }
//        }
//        throw new Exception("Not enough space to save user with id:" + user.getId());

    }

    public User update(User user) throws Exception {
        if (user == null)
            throw new Exception("Can't update null user");
        //  findById(user.getId());

        int i = 0;
        for (User el : users) {
            if ((el != null) && (el == findById(user.getId()))) {
                users.set(i, user);
                return users.get(i);

            }
            i++;
        }
        throw new Exception("Unexpected error");
    }

    public void delete(long id) throws Exception {
       try {
         for(User el : users){
             if(el != null && el == findById(id)){
                 users.remove(el);
             }
         }
        } catch (Exception e) {
            throw new Exception("User with id " + id + " not found. Can't to delete");
        }

    }
}