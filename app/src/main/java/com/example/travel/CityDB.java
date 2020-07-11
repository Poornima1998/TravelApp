package com.example.travel;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class CityDB extends SQLiteOpenHelper{


        private static int DB_VERSION = 1;
        private static String DATABASE_NAME = "CityDB";
        private static String TABLE_NAME = "cityTable";
        public static String KEY_ID = "id";
        public static String ITEM_TITLE1 = "itemTitle1";
        public static String ITEM_IMAGE1 = "itemImage1";
        public static String POPULATION_TITLE = "populationTitle";
        public static String AIRPORT_TITLE = "airportTitle";
        public static String COUNTRY_NAME = "countryName";
        // spaces
        private static String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + "("
                + KEY_ID + " TEXT," + ITEM_TITLE1+ " TEXT," +COUNTRY_NAME+ " TEXT,"
                + ITEM_IMAGE1 + " TEXT," + POPULATION_TITLE +" TEXT," + AIRPORT_TITLE +" TEXT)";

        public CityDB(Context context) { super(context,DATABASE_NAME,null,DB_VERSION);}

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
            onCreate(sqLiteDatabase);
        }

        // create empty table
        public void insertEmpty() {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            // enter your value
            for (int x = 1; x < 60; x++) {
                cv.put(KEY_ID, x);
               // cv.put(POPULATION_TITLE, x);
             //   cv.put(AIRPOET_TITLE, x);

                db.insert(TABLE_NAME,null, cv);
            }
        }

        // insert data into database
        public void insertIntoTheDatabase(String item_title1,String country_title, int item_image1, String id, String population_title, String airport_title) {
            SQLiteDatabase db;
            db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(ITEM_TITLE1, item_title1);
            cv.put(COUNTRY_NAME,country_title);
            cv.put(ITEM_IMAGE1, item_image1);
            cv.put(KEY_ID, id);
            cv.put(POPULATION_TITLE, population_title);
            cv.put(AIRPORT_TITLE,airport_title);
            db.insert(TABLE_NAME,null, cv);
            Log.d("CityDB Status", item_title1 + ", city - "+population_title+" - . " + cv);
        }

        // read all data
        public Cursor read_all_data(String id) {
            SQLiteDatabase db = this.getReadableDatabase();
            String sql = "select * from " + TABLE_NAME + " where " + KEY_ID+"="+id+"";
            return db.rawQuery(sql,null,null);
        }





    }

