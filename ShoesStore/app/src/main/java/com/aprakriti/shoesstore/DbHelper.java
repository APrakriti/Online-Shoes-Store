package com.aprakriti.shoesstore;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.aprakriti.shoesstore.Pojo.UserInfo;

import java.util.ArrayList;


public class DbHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "user";
    String info = "CREATE TABLE if not exists `user`  (\n" +
            "                       `id` INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "                       `name` TEXT,\n" +
            "                       `username` TEXT,\n" +
            "                       `password` TEXT,\n" +
            "                       `email`TEXT,\n" +
            "                       `contact`TEXT\n" +
            "                      );";

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        getWritableDatabase().execSQL(info);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void insertuserinfo(ContentValues cv) {
        getWritableDatabase().insert("user", "", cv);

    }

    public ArrayList<UserInfo> userInfos() {
        String sql = "SELECT * FROM user";
        ArrayList<UserInfo> list = new ArrayList<UserInfo>();
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        while (cursor.moveToNext()) {
            UserInfo info = new UserInfo();
            info.id = cursor.getString(cursor.getColumnIndex("id"));
            info.name = cursor.getString(cursor.getColumnIndex("name"));
            info.username = cursor.getString(cursor.getColumnIndex("username"));
            info.password = cursor.getString(cursor.getColumnIndex("password"));
            info.email = cursor.getString(cursor.getColumnIndex("email"));
            info.contact = cursor.getString(cursor.getColumnIndex("contact"));


            list.add(info);
        }
        cursor.close();
        return list;
    }
}
