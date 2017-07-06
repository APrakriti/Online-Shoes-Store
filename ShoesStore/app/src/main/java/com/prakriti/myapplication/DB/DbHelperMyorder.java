//package com.prakriti.myapplication.DB;
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.database.sqlite.SQLiteOpenHelper;
//
//import com.prakriti.myapplication.Pojo.OrderPojo;
//
//import java.util.ArrayList;
//
//
//public class DbHelperMyorder extends SQLiteOpenHelper {
//
//    public static final int DATABASE_VERSION = 1;
//    public static final String DATABASE_NAME = "myorder";
//    String myorderinfo = "CREATE TABLE if not exists `myorder`  (\n" +
//            "                       `id` INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
//            "                       `shoesid` TEXT,\n" +
//            "                       `color` TEXT,\n" +
//            "                       `size` TEXT,\n" +
//            "                       `quantity`TEXT,\n" +
//            "                       `delivery_date`TEXT,\n" +
//            "                       `description`TEXT,\n" +
//            "                       `price`TEXT,\n" +
//            "                        `delivery_address`TEXT\n"+
//            "                      );";
//
//    public DbHelperMyorder(Context context) {
//        super(context, DATABASE_NAME, null, DATABASE_VERSION);
//        getWritableDatabase().execSQL(myorderinfo);
//    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//
//
//
//    }
//
//    public void insertmyorder(ContentValues cv) {
//        getWritableDatabase().insert("myorder", "", cv);
//
//    }
//
//    public ArrayList<OrderPojo> myorders() {
//        String sql = "SELECT * FROM myorder";
//        ArrayList<OrderPojo> list = new ArrayList<OrderPojo>();
//        Cursor cursor = getWritableDatabase().rawQuery(sql, null);
//        while (cursor.moveToNext()) {
//            OrderPojo myOrderPojo = new OrderPojo();
//            myOrderPojo.id = cursor.getString(cursor.getColumnIndex("Id"));
//            myOrderPojo.shoesid = cursor.getString(cursor.getColumnIndex("sId"));
//            myOrderPojo.color = cursor.getString(cursor.getColumnIndex("mycolor"));
//            myOrderPojo.size = cursor.getString(cursor.getColumnIndex("mysize"));
//            myOrderPojo.quantity = cursor.getString(cursor.getColumnIndex("myquantity"));
//            myOrderPojo.deliverydate = cursor.getString(cursor.getColumnIndex("mydeliverydate"));
//            myOrderPojo.deliveryaddress = cursor.getString(cursor.getColumnIndex("mydeliveryaddress"));
//            list.add(myOrderPojo);
//        }
//        cursor.close();
//        return list;
//    }
//}
