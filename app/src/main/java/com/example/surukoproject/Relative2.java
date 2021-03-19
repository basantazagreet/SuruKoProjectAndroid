package com.example.surukoproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class Relative2 extends AppCompatActivity {

    RelativeLayout rl ;
    GestureDetectorCompat mDetector ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative2);

        rl = findViewById(R.id.rlcolored);
        mDetector = new GestureDetectorCompat(this, new MyGestureListener());
    }

    public boolean onTouchEvent(MotionEvent event){
        this.mDetector.onTouchEvent(event);
        return super.onTouchEvent(event);


    }



    class MyGestureListener extends GestureDetector.SimpleOnGestureListener{
        private static final String DEBUG_TAG = "Gestures";

       /* @Override
        public boolean onDown(MotionEvent e) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Swipped Down",
                    Toast.LENGTH_SHORT);

            toast.show();
            return true;
        }*/

        public void onLongPress(MotionEvent event) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Long Pressed",
                    Toast.LENGTH_SHORT);

            toast.show();
        }

        public boolean onDoubleTap(MotionEvent event) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Double Tapped",
                    Toast.LENGTH_SHORT);
            toast.show();
            return true;
        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {

            Log.d(DEBUG_TAG,"onFling:"+event1.toString() + event2.toString());

            if (event1.getX() > event2.getX() && (event1.getY()-event2.getY())<=50 ){
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Velocity X :"+Math.abs(velocityX)+"Velocity Y :"+Math.abs(velocityX),
                        Toast.LENGTH_SHORT);

                toast.show();
            }

                else if (event1.getX() < event2.getX() && (event1.getY()-event2.getY())<=50 ) {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Swipped Left",
                        Toast.LENGTH_SHORT);

                toast.show();
            }

            /*else if (event2.getY() < event1.getY() && (event1.getX()-event2.getX())<=50 ){
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Swipped UP",
                        Toast.LENGTH_SHORT);

                toast.show();

            }*/


            return true;
        }
    }



}