package com.byvillamizar.bibliotecataller.Db;

import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_ADMIN_ID;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_ADMIN_MAIL;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_ADMIN_PASSWORD;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_AUTORLIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_CANTLIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_CLAVEUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_CORREOUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_DESCRIPLIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_DIRECCIONUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_IDLIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_IDLIBUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_IDUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_IMAGENLIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_NOMBRELIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_NOMBREUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_URLLIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUM_TELEFONOUSU;
import static com.byvillamizar.bibliotecataller.Tools.Constant.DATABASE_NAME;
import static com.byvillamizar.bibliotecataller.Tools.Constant.DATABASE_VERSION;
import static com.byvillamizar.bibliotecataller.Tools.Constant.TABLE_ADMIN;
import static com.byvillamizar.bibliotecataller.Tools.Constant.TABLE_LIB;
import static com.byvillamizar.bibliotecataller.Tools.Constant.TABLE_USU;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.byvillamizar.bibliotecataller.Modelos.Usuario;

public class Database extends SQLiteOpenHelper {

    public Database(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String querryAdmin = "CREATE TABLE " + TABLE_ADMIN +
                        " (" + COLUMN_ADMIN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        COLUMN_ADMIN_MAIL + " TEXT, " +
                        COLUMN_ADMIN_PASSWORD + " TEXT); ";
        db.execSQL(querryAdmin);

        String queryUsu = "CREATE TABLE "+ TABLE_USU + "(" +
                COLUMN_IDUSU+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_NOMBREUSU +" TEXT, " +
                COLUMN_CORREOUSU +" TEXT, " +
                COLUM_TELEFONOUSU +" TEXT, " +
                COLUMN_DIRECCIONUSU +" TEXT, " +
                COLUMN_CLAVEUSU +" TEXT);";
        db.execSQL(queryUsu);
        String queryLib = "CREATE TABLE "+ TABLE_LIB + "(" +
                COLUMN_IDLIB+" INTEGER PRIMARY KEY AUTOINCREMENT," +
                COLUMN_IDLIBUSU +" INTEGER, " +
                COLUMN_NOMBRELIB +" TEXT, " +
                COLUMN_AUTORLIB +" TEXT, " +
                COLUMN_CANTLIB +" TEXT, " +
                COLUMN_URLLIB +" TEXT, " +
                COLUMN_IMAGENLIB +" TEXT, " +
                COLUMN_DESCRIPLIB +" TEXT);";
        db.execSQL(queryLib);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ADMIN);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_USU);
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_LIB);
        onCreate(db);
    }
}
