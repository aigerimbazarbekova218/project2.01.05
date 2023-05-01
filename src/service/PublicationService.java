package service;

import database.DataBase;
import model.Publication;

public class PublicationService {
    private DataBase dataBase = new DataBase();

    // TODO: 14.04.2023 Сохранить публикацию в мини базе данных (dataBase)!!!
    public void create(Publication publication){
        for (int i = 0; i < dataBase.getPublications().length; i++) {
            dataBase.getPublications()[i] = publication;
        }
        System.out.println(publication.getDescription());
    }


    // TODO: 14.04.2023 Добавить возможность изменить описание публикации!!!
    public void updateDescription(int id, String description) {
        for (int i = 0; i < dataBase.getPublications().length; i++) {
            if(dataBase.getPublications()[i].getId()==id){
                dataBase.getPublications()[i].setDescription(description);
            }

        }
        System.out.println(id);
        System.out.println(description);
    }



    // TODO: 14.04.2023 Добавить возможность поставить лайк к публикации!!!
    public void addLikeToPublication(int publicationId, int like){
        for (int i = 0; i < dataBase.getPublications().length ; i++) {
            if(dataBase.getPublications()[i].getId()==publicationId){
                dataBase.getPublications()[i].setLike(like);
            }
        }
        System.out.println(publicationId);
        System.out.println(like);
    }

    public DataBase getDataBase() {
        return dataBase;
    }

    public void setDataBase(DataBase dataBase) {
        this.dataBase = dataBase;
    }
}
