package com.example.asus.thehungrycat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash2);

        Thread thread2 = new Thread()
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
                    Intent mainIntent = new Intent(Splash2Activity.this,Main2Activity.class);
                    startActivity(mainIntent);
                }
            }
        };

        thread2.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
