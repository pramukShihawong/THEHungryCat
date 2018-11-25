package com.example.asus.thehungrycat;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class HungryCatView3 extends View
{
    private Bitmap cat[] = new Bitmap[2];
    private  int catX = 10;
    private  int catY;
    private  int catSpeed;

    private int canvasWidth;
    private int canvasHeight    ;

    private  int yellowX, yellowY , yellowSpeed = 20;
    private Paint yellowPaint = new Paint();

    private  int yellowXz, yellowYz , yellowzSpeed = 20;
    private  int yellowXzz, yellowYzz , yellowzzSpeed = 20;

    private  int greenX, greenY , greenSpeed = 25;
    private Paint greenPaint = new Paint();

    private  int greenXz, greenYz , greenzSpeed = 25;
    private  int greenXzz, greenYzz , greenzzSpeed = 25;

    private  int redX, redY , redSpeed = 40;
    private Paint redPaint = new Paint();

    private  int redXz, redYz , redzSpeed = 40;
    private  int redXzz, redYzz , redzzSpeed = 40;


    private int score;
    private int lifeCat;

    private  boolean touch = false;

    private Bitmap backgroundImage;

    private Paint scorePoint = new Paint();

    private Bitmap life[] = new Bitmap[2];

    public HungryCatView3(Context contect)
    {
        super(contect);
        cat[0] = BitmapFactory.decodeResource(getResources(),R.drawable.cat0);
        cat[1] = BitmapFactory.decodeResource(getResources(),R.drawable.cat2);
        backgroundImage = BitmapFactory.decodeResource(getResources(), R.drawable.back);

        yellowPaint.setColor(Color.GREEN);
        yellowPaint.setAntiAlias(false);

        greenPaint.setColor(Color.YELLOW);
        greenPaint.setAntiAlias(false);

        redPaint.setColor(Color.RED);
        redPaint.setAntiAlias(false);

        scorePoint.setColor(Color.WHITE);
        scorePoint.setTextSize(70);
        scorePoint.setTypeface(Typeface.DEFAULT);
        scorePoint.setAntiAlias(true);

        life[0] = BitmapFactory.decodeResource(getResources(),R.drawable.heart);
        life[1] = BitmapFactory.decodeResource(getResources(),R.drawable.dis_heart);

        catY = 550;
        score = 0;
        lifeCat = 3;
    }
    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        canvasWidth = canvas.getWidth();
        canvasHeight = canvas.getHeight();

        canvas.drawBitmap(backgroundImage,0,0,null);

        int minCatY = cat[0].getHeight();
        int maxCatY = canvasHeight - cat[0].getHeight() * 2;
        catY = catY + catSpeed;

        if (catY < minCatY)
        {
            catY = minCatY;
        }
        if (catY > maxCatY)
        {
            catY = maxCatY;
        }
        catSpeed = catSpeed+2;
        if (touch)
        {
            canvas.drawBitmap(cat[1],catX,catY,null);
            touch = false;
        }
        else
        {
            canvas.drawBitmap(cat[0],catX,catY,null);
        }

        //ball--------------------------------------------------------------------------------
        yellowX = yellowX - yellowSpeed;
        if (hisBallChecker(yellowX,yellowY))
        {
            score = score + 10;
            yellowX = - 100;
        }

        if (yellowX < 0)
        {
            yellowX = canvasWidth+21;
            yellowY = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(yellowX,yellowY,30,yellowPaint);

        yellowXz = yellowXz - yellowzSpeed;
        if (hisBallChecker(yellowXz,yellowYz))
        {
            score = score + 10;
            yellowXz = - 100;
        }

        if (yellowXz < 0)
        {
            yellowXz = canvasWidth+21;
            yellowYz = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(yellowXz,yellowYz,30,yellowPaint);

        yellowXzz = yellowXzz - yellowzzSpeed;
        if (hisBallChecker(yellowXzz,yellowYzz))
        {
            score = score + 10;
            yellowXzz = - 100;
        }

        if (yellowXzz < 0)
        {
            yellowXzz = canvasWidth+21;
            yellowYzz = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(yellowXzz,yellowYzz,30,yellowPaint);

        //ball--------------------------------------------------------------------------------
        greenX = greenX - greenSpeed;
        if (hisBallChecker(greenX,greenY))
        {
            score = score + 20;
            greenX = - 100;
        }

        if (greenX < 0)
        {
            greenX = canvasWidth+21;
            greenY = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(greenX,greenY,30,greenPaint);

        greenXz = greenXz - greenzSpeed;
        if (hisBallChecker(greenXz,greenYz))
        {
            score = score + 20;
            greenXz = - 100;
        }

        if (greenXz < 0)
        {
            greenXz = canvasWidth+21;
            greenYz = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        //create yellow ball
        canvas.drawCircle(greenXz,greenYz,30,greenPaint);

        greenXzz = greenXzz - greenzzSpeed;
        if (hisBallChecker(greenXzz,greenYzz))
        {
            score = score + 20;
            greenXzz = - 100;
        }

        if (greenXzz < 0)
        {
            greenXzz = canvasWidth+21;
            greenYzz = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        //create yellow ball
        canvas.drawCircle(greenXzz,greenYzz,30,greenPaint);

        //ball--------------------------------------------------------------------------------
        redXz = redXz - redzSpeed;
        if (hisBallChecker(redXz,redYz))
        {
            redXz = -100;
            lifeCat--;
            if (lifeCat == 0)
            {
                Toast.makeText(getContext(), "Game Over", Toast.LENGTH_SHORT).show();
                Intent gameOverIntent = new Intent(getContext(),GameOver3Activity.class);
                gameOverIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                gameOverIntent.putExtra("score",score);
                getContext().startActivity(gameOverIntent);

            }
        }
        if (redXz < 0)
        {
            redXz = canvasWidth+21;
            redYz = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(redXz,redYz,30,redPaint);


        redX = redX - redSpeed;
        if (hisBallChecker(redX,redY))
        {
            redX = -100;
            lifeCat--;
            if (lifeCat == 0)
            {
                Toast.makeText(getContext(), "Game Over", Toast.LENGTH_SHORT).show();
                Intent gameOverIntent = new Intent(getContext(),GameOver3Activity.class);
                gameOverIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                gameOverIntent.putExtra("score",score);
                getContext().startActivity(gameOverIntent);
            }
        }
        if (redX < 0)
        {
            redX = canvasWidth+21;
            redY = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(redX,redY,30,redPaint);

        redXzz = redXzz - redzzSpeed;
        if (hisBallChecker(redXzz,redYzz))
        {
            redXzz = -100;
            lifeCat--;
            if (lifeCat == 0)
            {
                Toast.makeText(getContext(), "Game Over", Toast.LENGTH_SHORT).show();
                Intent gameOverIntent = new Intent(getContext(),GameOver3Activity.class);
                gameOverIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                gameOverIntent.putExtra("score",score);
                getContext().startActivity(gameOverIntent);
            }
        }
        if (redXzz < 0)
        {
            redXzz = canvasWidth+21;
            redYzz = (int) Math.floor(Math.random() * (maxCatY - minCatY)) + minCatY;
        }
        canvas.drawCircle(redXzz,redYzz,30,redPaint);
        //ball--------------------------------------------------------------------------------



        for (int i=0; i<3;i++)
        {
            int x = (int) (750+life[0].getWidth() * 1.1 * i);
            int y = 20;

            if (i<lifeCat)
            {
                canvas.drawBitmap(life[0],x,y,null);
            }
            else
            {
                canvas.drawBitmap(life[1],x,y,null);
            }

        }

        canvas.drawText("score : "+score,20,80,scorePoint);
        scorePoint.setTextSize(60);
        scorePoint.setColor(Color.RED);
        scorePoint.setAntiAlias(true);




//        canvas.drawBitmap(life[0],1480,10,null);
//        canvas.drawBitmap(life[0],1580,10,null);
//        canvas.drawBitmap(life[0],1680,10,null);
    }

    //เชคบอล
    public  boolean hisBallChecker(int x , int y)
    {
        if (catX < x && x < (catX + cat[0].getWidth()) && catY < y && y < (catY + cat[0].getHeight()))
        {
            return true;
        }
        return false;
    }

    //แมวหมุน
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        {
            if (event.getAction() == MotionEvent.ACTION_DOWN)
            {
                touch = true;
                catSpeed = -22;
            }
            return  true;
        }
    }
}