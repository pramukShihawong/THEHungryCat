package com.example.asus.thehungrycat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash3);

        Thread thread3 = new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    sleep(2000);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    Intent mainIntent = new Intent(Splash3Activity.this,Main3Activity.class);
                    startActivity(mainIntent);
                }
            }
        };

        thread3.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
