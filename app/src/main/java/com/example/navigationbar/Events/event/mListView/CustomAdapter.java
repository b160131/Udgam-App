package com.example.navigationbar.Events.event.mListView;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;



import com.example.navigationbar.Events.event.mData.Day;
import com.example.navigationbar.Events.event.mData.eventDet;
import com.example.navigationbar.R;

import java.util.ArrayList;


public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<Day> days;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<Day> days) {
        this.c = c;
        this.days = days;
    }

    @Override
    public int getCount() {
        return days.size();
    }

    @Override
    public Object getItem(int position) {
        return days.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.model, parent, false);
        }

        TextView nameTxt = (convertView).findViewById(R.id.nameTxt);
        ImageView img = (convertView).findViewById(R.id.imageView);
        TextView dayTxt = (convertView).findViewById(R.id.posTxt);

        final String name = days.get(position).getName();
        String day = days.get(position).getday();
        int image = days.get(position).getImage();

        nameTxt.setText(name);
        img.setImageResource(image);
        dayTxt.setText(day);


        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(c, eventDet.class);
                intent.putExtra("event_name", days.get(position).getName());
                intent.putExtra("event_desc", days.get(position).getDescription());
                intent.putExtra("event_venue", days.get(position).getVenue());
                intent.putExtra("event_date", days.get(position).getDate());
                intent.putExtra("event_time", days.get(position).getTime());
                intent.putExtra("event_nu1", days.get(position).getNu1());
                intent.putExtra("event_nu2", days.get(position).getNu2());
                intent.putExtra("event_Fee", days.get(position).getentryFeee());

                c.startActivity(intent);



            }
        });
        return convertView;
    }
}

