package lesson22.repository;

public class UserRepository {
    private static User[] users = new User[10];

    public static User[] getUsers() {
        return users;
    }

    public static String[] getUserNames() {
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

    public static long[] getUserIds() {
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

    public static String getUserNameById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i].getName();
            }

        }
        return null;
    }

    public static User getUserByName(String name) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (name == users[i].getName())) {
                return users[i];
            }
        }
        return null;
    }

    public static User getUserById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i];
            }
        }
        return null;

    }

    public static User getUserBySessionId(String sessionId) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (sessionId == users[i].getSessionId())) {
                return users[i];
            }
        }
        return null;


    }

    public  static User findById(long id) {
        for (int i = 0; i < users.length; i++) {
            if ((users[i] != null) && (id == users[i].getId())) {
                return users[i];
            }

        }
        return null;


    }
    public static User save (User user ) {
        if(user == null)
        return null;
        int count = 0;
        for (User el : users){
            if((el != null) && (el.getId() == user.getId()))
                count++;
        }
        if(count > users.length)
            return null;
        int i = 0;
        for(User el : users){
            if(el == null){
                users[i] = user;
                break;
            }
            i++;
        }

        return user;



    }

    public static User update(User user){
        if(user == null)
            return null;
        User us = findById(user.getId());
        if(us == null)
            return null;
        long usId = us.getId();

        int i = 0;
        for (User el : users){
            if((el != null) && (el.getId() == us.getId())){
                users[i] = user;
               break;

            }
            i++;
        }
        return user;
    }

    public static void delete(long id){

        for(int i = 0; i < users.length; i++){
            if((findById(id) != null) )
                users[i] = null;
        }


    }

    }






