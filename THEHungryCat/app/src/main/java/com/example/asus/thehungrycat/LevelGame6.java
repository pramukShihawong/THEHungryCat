package com.example.asus.thehungrycat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LevelGame6 extends AppCompatActivity {

    private Button playGame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_game6);

        playGame = (Button) findViewById(R.id.play_again_btn);
        playGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(LevelGame6.this, Splash2Activity.class);
                startActivity(mainIntent);
            }
        });
    }
}
