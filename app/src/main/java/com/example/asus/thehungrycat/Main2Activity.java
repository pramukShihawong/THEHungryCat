package com.example.asus.thehungrycat;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Main2Activity extends AppCompatActivity {

    private HungryCatView2 gameView2;
    private Handler handler2 = new Handler();
    private  final  static long Interval = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        gameView2 = new HungryCatView2(this);
        setContentView(gameView2);

        Timer timer2 = new Timer();
        timer2.schedule(new TimerTask() {
            @Override
            public void run()
            {
                handler2.post(new Runnable() {
                    @Override
                    public void run() {
                        gameView2.invalidate();
                    }
                });
            }
        },0,Interval);
    }
}