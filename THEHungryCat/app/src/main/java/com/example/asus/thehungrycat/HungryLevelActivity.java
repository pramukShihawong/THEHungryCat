package com.example.asus.thehungrycat;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class HungryLevelActivity extends AppCompatActivity {

    private Button answer1,answer2,answer3,answer4;
    private TextView score,question;

    private Question mQuestion = new Question();
    private String mAnswer;
    private int mScore =0;
    private int mQuestionLenght = mQuestion.mQuestion.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hungry_level);

        r = new Random();

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("score : "+mScore);
        updateQuestion(r.nextInt(mQuestionLenght));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText()==mAnswer){
                    mScore++;
                    score.setText("score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                    if (mScore >= 10 ) {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }else {
                    if(mScore==0)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame10.class);
                        startActivity(mainIntent);
                    }else if(mScore==1)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame9.class);
                        startActivity(mainIntent);
                    }else if(mScore==2)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame8.class);
                        startActivity(mainIntent);
                    }else if(mScore==3)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame7.class);
                        startActivity(mainIntent);
                    }else if(mScore==4)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame6.class);
                        startActivity(mainIntent);
                    }else if(mScore==5)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame5.class);
                        startActivity(mainIntent);
                    }else if(mScore==6)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame4.class);
                        startActivity(mainIntent);
                    }else if(mScore==7)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame3.class);
                        startActivity(mainIntent);
                    }else if(mScore==8)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame2.class);
                        startActivity(mainIntent);
                    }
                    else
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }

                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText()==mAnswer){
                    mScore++;
                    score.setText("score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                    if (mScore >= 9){
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }else {
                    if(mScore==0)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame10.class);
                        startActivity(mainIntent);
                    }else if(mScore==1)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame9.class);
                        startActivity(mainIntent);
                    }else if(mScore==2)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame8.class);
                        startActivity(mainIntent);
                    }else if(mScore==3)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame7.class);
                        startActivity(mainIntent);
                    }else if(mScore==4)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame6.class);
                        startActivity(mainIntent);
                    }else if(mScore==5)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame5.class);
                        startActivity(mainIntent);
                    }else if(mScore==6)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame4.class);
                        startActivity(mainIntent);
                    }else if(mScore==7)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame3.class);
                        startActivity(mainIntent);
                    }else if(mScore==8)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame2.class);
                        startActivity(mainIntent);
                    }
                    else
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText()==mAnswer){
                    mScore++;
                    score.setText("score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                    if (mScore >= 10){
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }else {
                    if(mScore==0)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame10.class);
                        startActivity(mainIntent);
                    }else if(mScore==1)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame9.class);
                        startActivity(mainIntent);
                    }else if(mScore==2)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame8.class);
                        startActivity(mainIntent);
                    }else if(mScore==3)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame7.class);
                        startActivity(mainIntent);
                    }else if(mScore==4)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame6.class);
                        startActivity(mainIntent);
                    }else if(mScore==5)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame5.class);
                        startActivity(mainIntent);
                    }else if(mScore==6)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame4.class);
                        startActivity(mainIntent);
                    }else if(mScore==7)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame3.class);
                        startActivity(mainIntent);
                    }else if(mScore==8)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame2.class);
                        startActivity(mainIntent);
                    }
                    else
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText()==mAnswer){
                    mScore++;
                    score.setText("score : "+mScore);
                    updateQuestion(r.nextInt(mQuestionLenght));
                    if (mScore >= 10){
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }else {
                    if(mScore==0)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame10.class);
                        startActivity(mainIntent);
                    }else if(mScore==1)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame9.class);
                        startActivity(mainIntent);
                    }else if(mScore==2)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame8.class);
                        startActivity(mainIntent);
                    }else if(mScore==3)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame7.class);
                        startActivity(mainIntent);
                    }else if(mScore==4)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame6.class);
                        startActivity(mainIntent);
                    }else if(mScore==5)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame5.class);
                        startActivity(mainIntent);
                    }else if(mScore==6)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame4.class);
                        startActivity(mainIntent);
                    }else if(mScore==7)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame3.class);
                        startActivity(mainIntent);
                    }else if(mScore==8)
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame2.class);
                        startActivity(mainIntent);
                    }
                    else
                    {
                        Intent mainIntent = new Intent(HungryLevelActivity.this, LevelGame.class);
                        startActivity(mainIntent);
                    }
                }
            }
        });
    }

    private void  updateQuestion(int num)
    {
        question.setText(mQuestion.getQuestion(num));
        answer1.setText(mQuestion.getChoice1(num));
        answer2.setText(mQuestion.getChoice2(num));
        answer3.setText(mQuestion.getChoice3(num));
        answer4.setText(mQuestion.getChoice4(num));

        mAnswer = mQuestion.getCorrectAnswer(num);
    }

}
