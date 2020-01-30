package com.example.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

import androidx.annotation.Nullable;

public class Grid extends View {

    public static final int tailleTrait = 20;
    public Paint paintBlack;
    private int taille;

    private SurfaceHolder surfaceHolder;
    private Pion pion;

    private float[][] historique;



    protected Grid(Context context,int taille, float[][] historique) {
        super(context);

        paintBlack = new Paint();
        this.taille = taille;

        this.historique = historique;


    }
    private void drawGrid(int dim){

    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paintBlack.setColor(Color.BLACK);
        paintBlack.setStyle(Paint.Style.FILL);

        for( int i = 0; i < taille; i++){

            canvas.drawRect( i * ( canvas.getWidth() / taille) - tailleTrait ,0, i * canvas.getWidth()/ taille,canvas.getHeight(), paintBlack);

            canvas.drawRect( 0 ,i * canvas.getHeight()/ taille, canvas.getWidth(),i * canvas.getHeight() / taille - tailleTrait, paintBlack);


        }
        /*
        for(int j = 0; j < historique.length;j++){
            canvas.drawCircle(historique[j][0],historique[j][1],20,paintBlack);
        }
        */

    }


}
