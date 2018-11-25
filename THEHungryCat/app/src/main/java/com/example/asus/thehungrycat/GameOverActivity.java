package com.example.asus.thehungrycat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseExpandableListAdapter;
import android.widget.Button;
import android.widget.ShareActionProvider;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity
{
    private Button goHome;
    private TextView DisplayScore;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        score = getIntent().getExtras().getInt("score");


        DisplayScore = (TextView) findViewById(R.id.displayScore);

        goHome = (Button) findViewById(R.id.go_to_home);
//        goHome.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                Intent mainIntent = new Intent(GameOverActivity.this, RankingActivity.class);
//                startActivity(mainIntent);
//            }
//        });
        DisplayScore.setText("score : "+score);

        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences = getSharedPreferences("PREFS",0);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putInt("lastScore",score);
                editor.apply();

                Intent intent = new Intent(getApplicationContext(), RankingActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
