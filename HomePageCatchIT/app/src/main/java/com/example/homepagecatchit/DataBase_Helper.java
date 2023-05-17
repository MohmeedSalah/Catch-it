package com.example.homepagecatchit;



import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;


import androidx.annotation.Nullable;

public class DataBase_Helper extends SQLiteOpenHelper {
    private static final String DB_NAME= "CATCHIT_DB";
    private static final int DB_VERSION = 1;
    SQLiteDatabase cartdb ;
    public DataBase_Helper(@Nullable Context context) {
        super( context, DB_NAME, null, DB_VERSION);
    }




    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table USERS (_id integer primary key AUTOINCREMENT ," +
                "NAME TEXT,EMAIL TEXT , PASSWORD TEXT )");

        db.execSQL("create table PRODUCTS (_id integer primary key AUTOINCREMENT ," +
                "NAME TEXT , PRICE NUMBER , TYPE   TEXT, IMAGE_RESOURCE_ID INTEGER )");

        db.execSQL("create table CART (_id integer primary key AUTOINCREMENT,"+
                "USER_id integer,PRODUCT_id integer,QUANTITY integer ,FOREIGN KEY(USER_id)REFERENCES USERS(_id)" +
                ",FOREIGN KEY(PRODUCT_id)REFERENCES PRODUCTS(_id))");



    }


    public  void insertUser(String name, String email, String password){
        ContentValues usersValues = new ContentValues();
        usersValues.put("NAME", name);
        usersValues.put("EMAIL", email);
        usersValues.put("PASSWORD", password);
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert("USERS",null,usersValues);

    }

    public void insertProduct( String name, int price, String type, int imageResourceId){
        ContentValues productsValues = new ContentValues();
        productsValues.put("NAME", name);
        productsValues.put("PRICE", price);
        productsValues.put("TYPE", price);
        productsValues.put("IMAGE_RESOURCE_ID", imageResourceId);

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert("PRODUCTS", null, productsValues);

    }

    public  void insertCartItem(int user_id, int product_id, int quantity){
        ContentValues cartItemsValues = new ContentValues();

        cartItemsValues.put("USER_id", user_id);
        cartItemsValues.put("PRODUCT_id", product_id);
        cartItemsValues.put("QUANTITY", quantity);

        SQLiteDatabase db = this.getWritableDatabase();
        db.insert("CART", null, cartItemsValues);
        System.out.println(quantity+product_id);
    }


    public void deleteData(String tableName, int id ){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(tableName, "_id = ?", new String[] {String.valueOf(id)});

    }

    public Cursor User_found()
    {
        SQLiteDatabase dp;
        dp=getReadableDatabase();
        String[] Row_user ={"NAME","EMAIL" , "PASSWORD"};
        Cursor user = dp.query("USERS",Row_user,null,null,null,null,null);
        if(user != null)
            user.moveToFirst();
        dp.close();
        return  user;
    }



    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS USERS");
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS PRODUCTS");
        onCreate(db);

        db.execSQL("DROP TABLE IF EXISTS CART");
        onCreate(db);

    }

  /*public void update_cart(int n )
  {
      cartdb=getWritableDatabase();
      ContentValues row=new ContentValues();

  }*/







}
