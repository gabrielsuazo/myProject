package com.example.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;


public class Pion extends SurfaceView {
    int x;
    int y;

    Paint paintBlue;
    Rect rect;
    int taille;

    int largeur;
    int longueur;

    public Pion(Context context, int x, int y, int taille) {
        super(context);
        this.x = x;
        this.y = y;

        this.taille = taille;


        rect = new Rect();
        paintBlue = new Paint();

    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        paintBlue.setColor(Color.BLUE);
        paintBlue.setStyle(Paint.Style.FILL);
        canvas.drawRect(x,y, 500 , 500, paintBlue );

    }



}
