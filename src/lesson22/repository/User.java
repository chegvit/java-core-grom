package lesson22.repository;

public class User {
    private    long id;
    private   String name;
    private   String sessionId;

    public   User(long id, String name, String sessionId) {
        this.id = id;
        this.name = name;
        this.sessionId = sessionId;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSessionId() {
        return  sessionId;
    }

    public void setId(long id) {
        this.id = id;
    }
    public void setId() {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sessionId='" + sessionId + '\'' +
                '}';
    }
}
