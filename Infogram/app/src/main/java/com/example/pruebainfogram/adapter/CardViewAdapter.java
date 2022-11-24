package com.example.pruebainfogram.adapter;

import static android.os.Build.VERSION_CODES.R;

import android.app.Activity;
import android.os.Build;
import android.provider.ContactsContract;
import android.provider.Telephony;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pruebainfogram.R;
import com.example.pruebainfogram.model.Image;

import java.io.ObjectInputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CardViewAdapter extends RecyclerView.Adapter<CardViewAdapter.CardViewHolder> {
    //Lista de imagenes
    private ArrayList<Image> images;
    private int resource;
    private Activity activity;


    public CardViewAdapter(ArrayList<Image> images, int resource, Activity activity){
        this.images = images;
        this.resource = resource;
        this.activity = activity;
    }


    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);

        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Image image = images.get(position);
        //image


        Picasso.get().load(image.getUrlImagen()).into(holder.imageCardView);
        holder.usernameCardView.setText(image.getUsernam());
        holder.cantidadDiasCardView.setText(image.getCatidadDias());
        holder.cantidadMegustaCardView.setText(image.getCantidadMeGusta());

    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageCardView;
        private TextView usernameCardView;
        private TextView cantidadDiasCardView;
        private TextView cantidadMegustaCardView;

        public CardViewHolder(@NonNull View itemView) {
            super(itemView);

            imageCardView = itemView.findViewById(R.id.imageCardView);
            usernameCardView = itemView.findViewById(R.id.usernameCardView);
            cantidadDiasCardView = itemView.findViewById(R.id.cantidadDiasCardView);
            cantidadMegustaCardView = itemView.findViewById(R.id.cantidadMeGustaCardView);
        }
    }

}
