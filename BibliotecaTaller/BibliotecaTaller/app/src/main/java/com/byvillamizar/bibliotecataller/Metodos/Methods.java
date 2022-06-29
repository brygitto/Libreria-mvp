package com.byvillamizar.bibliotecataller.Metodos;

import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_ADMIN_MAIL;
import static com.byvillamizar.bibliotecataller.Tools.Constant.COLUMN_ADMIN_PASSWORD;
import static com.byvillamizar.bibliotecataller.Tools.Constant.TABLE_ADMIN;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Patterns;

import com.byvillamizar.bibliotecataller.Db.Database;
import com.byvillamizar.bibliotecataller.Modelos.Admin;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

public class Methods {
    SQLiteDatabase myDB;
    Context context;
    SQLiteOpenHelper sqLiteOpenHelper;

    public Methods(Context context) {
        this.context = context;
        sqLiteOpenHelper = new Database(context);
        myDB = sqLiteOpenHelper.getWritableDatabase();
    }

    public boolean addAdmin(Admin admin) {
        SQLiteDatabase db = this.sqLiteOpenHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ADMIN_MAIL, admin.getCorreodmin());
        cv.put(COLUMN_ADMIN_PASSWORD, admin.getClaveadmin());

        long result = db.insert(TABLE_ADMIN, null, cv);

        if (result != -1) {
            return true;
        } else {
            return false;
        }

    }

    public boolean validateAdmin(Admin admin) {
        SQLiteDatabase db = this.sqLiteOpenHelper.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ADMIN_MAIL, admin.getCorreodmin());
        cv.put(COLUMN_ADMIN_PASSWORD, admin.getClaveadmin());

        String query = "SELECT * FROM " + TABLE_ADMIN + " WHERE " + COLUMN_ADMIN_MAIL + " = '" + admin.getCorreodmin() +
                "' and " + COLUMN_ADMIN_PASSWORD + " = '" + admin.getClaveadmin() + "' ";
        Cursor cursor = db.rawQuery(query, null);
        if (cursor.getCount() != 0) {
            return true;
        }
        return false;
    }



}