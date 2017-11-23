package com.example.hellofragment;

import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private int mTime= 60;
    private TextView mTimeTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ExampleFragment fragment = new ExampleFragment();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.fragment_container,fragment);
        ft.commit();
        mTimeTV = findViewById(R.id.button);
        Handler handler = new Handler();
        Timer timer = new Timer();

        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (mTime > 0) {
                    mTime--;
                }
                else {
                    mTime = 60; //reset
                }
                //Only the main thread can touch its views
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mTimeTV.setText(String.valueOf(mTime));

                    }
                });

            }
        };
        timer.schedule(timerTask,1000,1000);
    }
}
