package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Patient> lstPatient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPatient = new ArrayList<Patient>();
        int k = 15;

        for (int i = 0; i < k; i++){
            lstPatient.add(new Patient("Patient","Date: 19/03/12",R.drawable.jb));
        }



        RecyclerView myRV = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstPatient);
        myRV.setLayoutManager((new GridLayoutManager(this,3)));
        myRV.setAdapter(myAdapter);
    }
}
