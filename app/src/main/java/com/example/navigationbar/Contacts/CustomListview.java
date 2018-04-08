package com.example.navigationbar.Contacts;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navigationbar.R;

public class CustomListview extends ArrayAdapter {


    private String[] fruit;
    private String[] desc;
    private Integer[] imgid;
    private Activity context;

    public CustomListview(Activity context,String[] fruit,String[] desc,Integer[] imgid) {
        super(context, R.layout.single_row_layout, fruit);

        this.context = context;
        this.fruit = fruit;
        this.desc = desc;
        this.imgid = imgid;
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View r=convertView;
        viewHolder viewholder=null;
        if(r==null) {
            LayoutInflater layoutInflater = context.getLayoutInflater();
            r = layoutInflater.inflate(R.layout.single_row_layout, null, true);


            viewholder=new viewHolder(r);
            r.setTag(viewholder);
        }
        else {
            viewholder = (viewHolder) r.getTag();
        }

        viewholder.iv.setImageResource(imgid[position]);
        viewholder.tv1.setText(fruit[position]);
        viewholder.tv2.setText(desc[position]);

        return r;

    }

    class viewHolder{
        TextView tv1;
        TextView tv2;
        ImageView iv;

        viewHolder(View v){
            tv1=v.findViewById(R.id.textView);
            tv2=v.findViewById(R.id.textView2);
            iv=v.findViewById(R.id.imageView2);
        }
    }

}

