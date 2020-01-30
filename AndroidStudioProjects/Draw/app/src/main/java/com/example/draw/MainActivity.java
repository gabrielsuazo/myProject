package com.example.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button playbtn;
    private SeekBar seekBar;
    private TextView text;
    public int taille;


    private int taille(){
        taille =  seekBar.getProgress() + 3;
        return seekBar.getProgress() + 3;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        playbtn = (Button) findViewById(R.id.play);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        text = (TextView) findViewById(R.id.text);

        text.setText("Dimension du Jeu : " + taille() + "x " + taille() );



        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                text.setText("Dimension du Jeu : " + taille() + "x " + taille() );

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        playbtn.setText("Play");

        playbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caller = new Intent(getApplicationContext(),Morpion.class);
                caller.putExtra(Morpion.EXTRA_SIZE,taille);
                startActivity(caller);
                finish();

            }
        });






    }
}
