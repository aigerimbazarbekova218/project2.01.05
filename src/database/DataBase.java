package database;

import model.Massege;
import model.Publication;
import model.User;

public class DataBase {
    private User[] users = new User[100];
    private Massege[] messages = new Massege[100];
    private Publication[] publications = new Publication[100];

    public User[] getUsers() {
        return users;
    }
    public Massege[] getMessages() {
        return messages;
    }

    public Publication[] getPublications() {
        return publications;
    }
}
