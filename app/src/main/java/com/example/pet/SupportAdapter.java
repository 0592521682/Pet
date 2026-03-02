package com.example.pet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class SupportAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<SupportOption> optionsList;

    public SupportAdapter(Context context, ArrayList<SupportOption> optionsList) {
        this.context = context;
        this.optionsList = optionsList;
    }

    @Override
    public int getCount() {
        return optionsList.size();
    }

    @Override
    public Object getItem(int position) {
        return optionsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            // استخدام layout الذي أنشأناه (item_support)
            convertView = LayoutInflater.from(context).inflate(R.layout.item_support, parent, false);
        }

        SupportOption currentOption = optionsList.get(position);

        ImageView imgIcon = convertView.findViewById(R.id.imgSupportIcon);
        TextView txtTitle = convertView.findViewById(R.id.txtSupportTitle);

        if (imgIcon != null) {
            imgIcon.setImageResource(currentOption.getIconResId());
        }
        if (txtTitle != null) {
            txtTitle.setText(currentOption.getTitle());
        }

        // تمييز الخيار الأول بإطار برتقالي كما هو مطلوب
        if (position == 0) {
            convertView.setBackgroundResource(R.drawable.rounded_border);
        } else {
            convertView.setBackgroundResource(R.drawable.rounded_background);
        }

        return convertView;
    }
}