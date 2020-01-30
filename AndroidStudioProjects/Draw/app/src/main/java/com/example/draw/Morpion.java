package com.example.draw;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.content.Intent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;


public class Morpion extends AppCompatActivity{

    Grid grid;

    private float[][] historique;

    private int cpt;



    private int taille;
    public final static String EXTRA_SIZE = "com.example.draw.taille";

    private SurfaceHolder surfaceHolder;

    Pion pion;

    private int pionX;
    private int pionY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_morpion);



        cpt = 0;
        historique = new float[10][2];

        Intent intent = getIntent();
        taille = intent.getIntExtra(EXTRA_SIZE, 4);
        grid = new Grid(this, taille, historique);
        setContentView(grid);




    }
    /*
    public boolean onTouch(View view, MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_UP) {
            historique[cpt][0] = event.getX();
            historique[cpt][1] = event.getY();
            cpt += 1;
        }


        Canvas drawingCanvas = surfaceHolder.lockCanvas();
        grid.draw(drawingCanvas);
        surfaceHolder.unlockCanvasAndPost(drawingCanvas);



        grid.postInvalidate();
        return true;
    }
    */


}


