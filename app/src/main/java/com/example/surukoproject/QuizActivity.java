package com.example.surukoproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizActivity extends AppCompatActivity {

    TextView tvOption1;
    TextView tvOption2;
    TextView tvOption3;
    TextView tvOption4;
    TextView selectedTextView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        tvOption1 = findViewById(R.id.tvOption1);
        tvOption2 = findViewById(R.id.tvOption2);
        tvOption3 = findViewById(R.id.tvOption3);
        tvOption4 = findViewById(R.id.tvOption4);

        tvOption1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            changeBGToSelected((TextView) v);
        }
        });

    tvOption2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            changeBGToSelected((TextView) v);
        }
    });

        tvOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBGToSelected((TextView) v);
            }
        });

        tvOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeBGToSelected((TextView) v);
            }
        });


    }

    private void changeBGToSelected(TextView v){

        //Pahilai select vacha vane
        if (selectedTextView != null) {
            selectedTextView.setTextColor(Color.parseColor("#99000000"));

            //textview ko drawable file ma refer gareko tyo bana background vanera.
            selectedTextView.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.option_background));
        }
        //set selectedView to be current selected view
        selectedTextView =  v;
        //change selected view to be green
        selectedTextView.setTextColor(Color.parseColor("#ffffff"));
        selectedTextView.setBackgroundColor(Color.parseColor("#00c853"));
    }



}