package com.roomdatabase.RoomDataBaseHelper;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;

public abstract class RoomDBhelper extends RoomDatabase {
    private static final String  TAG=RoomDBhelper.class.getName();
    private static final String DB_NAME="RoomExample.db";
    private static RoomDBhelper roomDBhelperInstance=null;

    public static synchronized RoomDBhelper getroomDBhelperInstance(Context context){
        if(roomDBhelperInstance==null){
            roomDBhelperInstance=buildDataBaseInstance(context);
        }
        return roomDBhelperInstance;
    }
    private static RoomDBhelper buildDataBaseInstance(Context context){
        return Room.databaseBuilder(context, RoomDBhelper.class,DB_NAME).build();
    }
}
