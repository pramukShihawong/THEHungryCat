package com.example.asus.thehungrycat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RankingActivity extends AppCompatActivity {

        TextView  displayScore;
        int lastScore;
        int best1, best2,best3;

        private Button startGameAgain,goHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        displayScore = (TextView) findViewById(R.id.displayScore);

        SharedPreferences preferences = getSharedPreferences("PREFS",0);
        lastScore = preferences.getInt("lastScore",0);
        best1 = preferences.getInt("best1", 0);
        best2 = preferences.getInt("best2", 0);
        best3 = preferences.getInt("best3", 0);

        //replace high score
        if(lastScore > best3){
            best3 = lastScore;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("lastScore",best3);
            editor.apply();
        }

        if(lastScore > best2){
            int temp = best2;
            best2 = lastScore;
            best3 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best3",best3);
            editor.putInt("best2",best2);
            editor.apply();
        }

        if(lastScore > best1){
            int temp = best1;
            best1 = lastScore;
            best2 = temp;
            SharedPreferences.Editor editor = preferences.edit();
            editor.putInt("best2",best2);
            editor.putInt("best1",best1);
            editor.apply();
        }

        //display
        displayScore.setText("LAST SCORE : " + lastScore + "\n\n"+
        "Rank 1 :"+ best1 + "\n\n"+
        "Rank 2 :"+ best2 + "\n\n"+
        "Rank 3 :"+ best3);


        startGameAgain = (Button) findViewById(R.id.play_again_btn);
        startGameAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(RankingActivity.this, HungryLevelActivity.class);
                startActivity(mainIntent);
            }
        });


        goHome = (Button) findViewById(R.id.go_to_home);
        goHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent mainIntent = new Intent(RankingActivity.this, HomeActivity.class);
                startActivity(mainIntent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), RankingActivity.class);
        startActivity(intent);
        finish();
    }
}
