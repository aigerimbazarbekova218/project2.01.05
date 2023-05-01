package service;

import database.DataBase;
import model.User;

public class UserService {
    private DataBase dataBase = new DataBase();

    // TODO: 14.04.2023 Сохранить пользователя(User) в мини базе данных!!!
    public void createUser(User user) {
        for (int i = 0; i < dataBase.getUsers().length; i++) {
            dataBase.getUsers()[i] = user;
        }
        System.out.println("User successfully saved!!!");

    }

    // TODO: 14.04.2023 Добавить возможность изменить свойтсва пользователя!!!
    public void updateUser(int id, User user) {
        for (int i = 0; i < getDataBase().getUsers().length; i++) {
            if (getDataBase().getUsers()[i].getId() == id) {
                getDataBase().getUsers()[i].setId(user.getId());
                getDataBase().getUsers()[i].setName(user.getName());
                getDataBase().getUsers()[i].setEmail(user.getEmail());
                getDataBase().getUsers()[i].setPublications(user.getPublications());
                getDataBase().getUsers()[i].setFriends(user.getFriends());
            }
        }
        System.out.println(id);
        System.out.println(user);

    }

    public void addToFriends(int userId, User newUser) {
        User[] users = new User[]{newUser};
        for (int i = 0; i < dataBase.getUsers().length; i++) {
            if(dataBase.getUsers()[i].getId()==userId) {
                dataBase.getUsers()[i].setFriends(users);
            }
        }
        System.out.println(userId);
        System.out.println(newUser);
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
