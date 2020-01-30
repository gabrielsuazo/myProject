package com.example.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder{

    ImageView myImageView;
    TextView myNom, myDate;
    CardView cardView;

    public MyViewHolder(View itemView){
        super(itemView);

        this.myImageView = itemView.findViewById(R.id.imageIv);
        this.myNom = itemView.findViewById(R.id.titleTv);
        this.myDate = itemView.findViewById(R.id.descriptionTv);
        this.cardView = itemView.findViewById(R.id.cardview_id);
    }
}