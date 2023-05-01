package model;

public class Publication {
    private int id;
    private String name;
    private int like;
    private String description;
    private User user;

    public Publication() {
    }

    public Publication(int id, String name, int like, String description, User user) {
        this.id = id;
        this.name = name;
        this.like = like;
        this.description = description;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", like=" + like +
                ", description='" + description + '\'' +
                '}';
    }
}
