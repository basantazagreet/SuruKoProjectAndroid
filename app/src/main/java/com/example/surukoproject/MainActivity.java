package com.example.surukoproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyMessage" ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Oncreate");
    }

    public void button1Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(i);
    }

    public void button2Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, ConstraintsActivity.class);
        startActivity(i);
    }

    public void button3Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(i);
    }

    public void button4Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, AddItemActivity.class);
        startActivity(i);
    }

    public void buttonQuizClicked(View v)
    {
        Intent i = new Intent(MainActivity.this, QuizActivity.class);
        startActivity(i);
    }

    public void button5Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, RelativeActivity.class);
        startActivity(i);
    }

    public void button6Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, Relative2.class);
        startActivity(i);
    }

    public void button7Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, TableActivity.class);
        startActivity(i);
    }

    public void button8Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, NotifyActivity.class);
        startActivity(i);
    }

    public void button9Clicked(View v)
    {
        Intent i = new Intent(MainActivity.this, LinearActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Onpause");
            }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"OnDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"OnResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"OnRestart");
    }
}
