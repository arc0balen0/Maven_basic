package org.example;

import java.util.UUID;

public class MyService {

    private DbSetting dbSetting;
    private MyEntity myEntity;

    public void Db(DbSetting dbSetting) {
        this.dbSetting = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public boolean setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
        return false;
    }
}
