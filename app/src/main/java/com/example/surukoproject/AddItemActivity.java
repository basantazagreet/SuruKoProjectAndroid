package com.example.surukoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.surukoproject.Helper.FriendsDBHelper;

public class AddItemActivity extends AppCompatActivity {

    Button btadd;
    Button btshow;
    Button btcancel;

    EditText etname;
    EditText etaddress;
    EditText etemail;
    EditText etphone;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        btadd = findViewById(R.id.btadd);
        btshow = findViewById(R.id.btshow);
        btcancel = findViewById(R.id.btCancel);



        etname = findViewById(R.id.etname);
        etaddress = findViewById(R.id.etAddress);
        etemail = findViewById(R.id.etemail);
        etphone = findViewById(R.id.etphone);

//        String name = java.lang.String.valueOf(etname.getText());
//        String address = java.lang.String.valueOf(etaddress.getText());
//        String email = java.lang.String.valueOf(etemail.getText());
//        String phone = java.lang.String.valueOf(etphone.getText());

        btadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = java.lang.String.valueOf(etname.getText());
                String address = java.lang.String.valueOf(etaddress.getText());
                String email = java.lang.String.valueOf(etemail.getText());
                String phone = java.lang.String.valueOf(etphone.getText());


                writeToDB(name,address,email,phone);
            }
        });

        btshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                readFromDb();
            }
        });

        btcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reset();
            }
        });

    }

    private void writeToDB(String name, String address, String phone, String email){

        FriendsDBHelper friendsDBHelper = new FriendsDBHelper(this);
        SQLiteDatabase db = friendsDBHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("name",name);
        values.put("address",address);
        values.put("phone",phone);
        values.put("email",email);

        db.insert("tblfriends",null,values);
        Toast toast = Toast.makeText(getApplicationContext(),
                "Added successfully", Toast.LENGTH_SHORT);

        toast.show();

    }


    private void readFromDb(){
        FriendsDBHelper friendsDBHelper = new FriendsDBHelper(this);
        SQLiteDatabase db = friendsDBHelper.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from tblfriends",null);
        if (cursor.moveToFirst()) {
            do {
                String name = cursor.getString(cursor.getColumnIndex("name"));
                String address =  cursor.getString(cursor.getColumnIndex("address"));
                String phone = cursor.getString(cursor.getColumnIndex("phone"));
                String email = cursor.getString(cursor.getColumnIndex("email"));
                Log.v("CONTENT","Name "+name+"  Address: "+address+" Phone: "+phone+"    Email "+email);

            } while(cursor.moveToNext());
        }

        cursor.close();
    }

    public void reset(){
        etname.setText("");
        etaddress.setText("");
        etphone.setText("");
        etemail.setText("");
    }



}