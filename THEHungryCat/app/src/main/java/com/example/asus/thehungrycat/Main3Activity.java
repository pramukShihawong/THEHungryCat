package com.example.asus.thehungrycat;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Main3Activity extends AppCompatActivity {

    private HungryCatView3 gameView3;
    private Handler handler3 = new Handler();
    private  final  static long Interval = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        gameView3 = new HungryCatView3(this);
        setContentView(gameView3);

        Timer timer3 = new Timer();
        timer3.schedule(new TimerTask() {
            @Override
            public void run()
            {
                handler3.post(new Runnable() {
                    @Override
                    public void run() {
                        gameView3.invalidate();
                    }
                });
            }
        },0,Interval);
    }
}