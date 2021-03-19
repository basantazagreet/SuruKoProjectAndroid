package com.example.surukoproject.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class FriendsDBHelper extends SQLiteOpenHelper {

    public FriendsDBHelper(@Nullable Context context) {
        super(context, "suruko_friends_db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String scoreboardTableStatement = "CREATE TABLE tblfriends ("+
                "name TEXT," +
                "address TEXT," +
                "phone TEXT," +
                "email TEXT)";
        db.execSQL(scoreboardTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE tblfriends");
        onCreate(db);
    }
}
