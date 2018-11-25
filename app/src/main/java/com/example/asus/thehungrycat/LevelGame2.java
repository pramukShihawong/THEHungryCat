package com.example.asus.thehungrycat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelGame2 extends AppCompatActivity {

    private Button playGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_game2);

        playGame = (Button) findViewById(R.id.play_again_btn);
        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(LevelGame2.this, SplashActivity.class);
                startActivity(mainIntent);
            }
        });
    }
}
