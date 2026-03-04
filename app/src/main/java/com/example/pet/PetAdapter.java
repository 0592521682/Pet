package com.example.pet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import java.util.ArrayList;

public class PetAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Pet> petList;

    public PetAdapter(Context context, ArrayList<Pet> petList) {
        this.context = context;
        this.petList = petList;
    }

    @Override
    public int getCount() {
        return petList.size();
    }

    @Override
    public Object getItem(int position) {
        return petList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_pet, parent, false);
        }


        Pet currentPet = petList.get(position);

        ImageView imgPet = convertView.findViewById(R.id.imgPet);
        TextView txtName = convertView.findViewById(R.id.txtPetName);
        TextView txtPrice = convertView.findViewById(R.id.txtPetPrice);
        RatingBar ratingBar = convertView.findViewById(R.id.petRating);

        if (currentPet != null) {
            imgPet.setImageResource(currentPet.getImageResId());
            txtName.setText(currentPet.getName() + " (" + currentPet.getBreed() + ")");
            txtPrice.setText(currentPet.getPrice());
            ratingBar.setRating(currentPet.getRating());
        }

        return convertView;
    }
}