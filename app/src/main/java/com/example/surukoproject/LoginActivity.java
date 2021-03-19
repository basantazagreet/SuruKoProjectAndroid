package com.example.surukoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
//explicit intent
    public void loginClicked(View v){
        Intent i = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(i);

    }
//implicit intent
    public void contactClicked(View v){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:9869047383"));
        startActivity(callIntent);

    }
}