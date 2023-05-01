package service;

import database.DataBase;
import model.Massege;

public class MessageService {
        private DataBase dataBase = new DataBase();

        // TODO: 14.04.2023 Сохранить сообщение в мини базе данных (dataBase);!!!
        public void sendMessage(Massege message) {
            for (int i = 0; i < dataBase.getMessages().length; i++) {
                dataBase.getMessages()[i] = message;

            }
            System.out.println(message.getMessage());
        }




        // TODO: 14.04.2023 Прочитать сообщение по ID!!!
        public void readMessage(int messageId) {
            for (int i = 0; i < dataBase.getMessages().length; i++) {
                if (dataBase.getMessages()[i].getId() == messageId) {
                    System.out.println(dataBase.getMessages()[i]);
                }
            }

        }

        public DataBase getDataBase() {
            return dataBase;
        }

        public void setDataBase(DataBase dataBase) {
            this.dataBase = dataBase;
        }
}
