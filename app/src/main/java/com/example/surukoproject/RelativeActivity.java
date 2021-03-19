package com.example.surukoproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class RelativeActivity extends AppCompatActivity {

    RelativeLayout mainlayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);

        mainlayout = findViewById(R.id.clMain);
    }

    public void toastClicked(View v) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "This is a message displayed in a Toast", Toast.LENGTH_SHORT);

        toast.show();
    }

    public void snackbarClicked(View v)
    {
        Snackbar snackbar = Snackbar .make(mainlayout, "Hello this is snackbar.",
                Snackbar.LENGTH_LONG);
        snackbar.setAction("RETRY", new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "You clicked retry", Toast.LENGTH_SHORT);

                toast.show();

            }
                });
        snackbar.show();

    }


}