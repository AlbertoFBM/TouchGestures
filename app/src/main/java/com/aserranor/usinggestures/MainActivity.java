package com.aserranor.usinggestures;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private String DEBUG_TAG = "Using Gestures";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View view = findViewById(R.id.button);

        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int action = MotionEventCompat.getActionMasked(event);

                switch (action){
                    case (MotionEvent.ACTION_DOWN):
                        Log.d(DEBUG_TAG, "View action was DOWN");
                        return true;
                    case (MotionEvent.ACTION_UP):
                        Log.d(DEBUG_TAG,"View action was UP");
                        return true;
                    case (MotionEvent.ACTION_MOVE):
                        Log.d(DEBUG_TAG, "View action was MOVE");
                        return true;
                    default:
                        return MainActivity.super.onTouchEvent(event);
                }
            }
        });
    }
}