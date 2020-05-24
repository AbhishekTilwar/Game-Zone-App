package com.abhi.androidapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.abhi.androidapp.Interface.ItemClickListener;
import com.abhi.androidapp.R;

public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView txtMenuName;
    public ImageView imageView;

    private ItemClickListener itemClickListener;

    public MenuViewHolder(View itemView){
        super(itemView);
        txtMenuName=(TextView)itemView.findViewById(R.id.menu_name);
        imageView=(ImageView)itemView.findViewById(R.id.menu_item );

        itemView.setOnClickListener(this);


    }
    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener =itemClickListener;
    }



    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v,getAdapterPosition(),false);


    }



}
