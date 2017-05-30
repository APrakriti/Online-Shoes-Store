package com.aprakriti.shoesstore;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.aprakriti.shoesstore.Pojo.OrderPojo;
import com.aprakriti.shoesstore.Pojo.UserInfo;

import java.util.ArrayList;


public class DbHelperAdmin extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "userorder";
    String orderinfo = "CREATE TABLE if not exists `userorder`  (\n" +
            "                       `id` INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "                       `name` TEXT,\n" +
            "                       `email`TEXT,\n"+
            "                       `color` TEXT,\n" +
            "                       `size` TEXT,\n" +
            "                       `quantity`TEXT,\n" +
            "                       `delivery_date`TEXT,\n" +
            "                        `delivery_address`TEXT\n"+
            "                      );";

    public DbHelperAdmin(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        getWritableDatabase().execSQL(orderinfo);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {



    }

    public void insertuserorder(ContentValues cv) {
        getWritableDatabase().insert("userorder", "", cv);

    }

    public ArrayList<OrderPojo> orders() {
        String sql = "SELECT * FROM userorder";
        ArrayList<OrderPojo> list = new ArrayList<OrderPojo>();
        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
        while (cursor.moveToNext()) {
            OrderPojo orderinfo = new OrderPojo();
            orderinfo.id = cursor.getString(cursor.getColumnIndex("id"));
            orderinfo.name = cursor.getString(cursor.getColumnIndex("name"));
            orderinfo.email = cursor.getString(cursor.getColumnIndex("email"));
            orderinfo.color = cursor.getString(cursor.getColumnIndex("color"));
            orderinfo.size = cursor.getString(cursor.getColumnIndex("size"));
            orderinfo.quantity = cursor.getString(cursor.getColumnIndex("quantity"));
            orderinfo.deliverydate = cursor.getString(cursor.getColumnIndex("delivery_date"));
            orderinfo.deliveryaddress = cursor.getString(cursor.getColumnIndex("delivery_address"));


            list.add(orderinfo);
        }
        cursor.close();
        return list;
    }
}
