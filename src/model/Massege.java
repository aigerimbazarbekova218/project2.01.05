package model;

public class Massege {
    private int id;
    private User user;
    private String createDate;
    private String message;
    private boolean isRead;

    public Massege() {
    }

    public Massege(int id, String createDate, String message, boolean isRead,  User user) {
        this.id = id;
        this.createDate = createDate;
        this.message = message;
        this.isRead = isRead;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", createDate='" + createDate + '\'' +
                ", message='" + message + '\'' +
                ", isRead=" + isRead +
                '}';
    }
}
