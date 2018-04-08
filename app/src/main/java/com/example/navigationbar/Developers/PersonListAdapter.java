package com.example.navigationbar.Developers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.navigationbar.R;

import java.util.ArrayList;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;


public class PersonListAdapter extends ArrayAdapter<Persion> {
    private static final String TAG = "PersonListAdapter";
    private Context mContext;
    private int mResource;
    private int lastPosition=-1;


    private static class ViewHolder
    {
        TextView name;
        TextView branch;
        TextView rollno;
        ImageView image;
    }




    public PersonListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Persion> objects)
    {
        super(context, resource, objects);
        mContext= context;
        mResource=resource;
    }



    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {
        String name = getItem(position).getName();
        String branch = getItem(position).getBranch();
        String rollno = getItem(position).getRollno();
        String imgURL = getItem(position).getImage();
        setupImageLoader();

        final View result;


        ViewHolder holder;


        if (convertView == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.textView1);
            holder.branch = (TextView) convertView.findViewById(R.id.textView2);
            holder.rollno = (TextView) convertView.findViewById(R.id.textView3);
            holder.image = (ImageView) convertView.findViewById(R.id.image);

            result = convertView;

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


                    Animation animation = AnimationUtils.loadAnimation(mContext,
                            (position > lastPosition) ? R.anim.load_down_animation : R.anim.load_up_animation);
                    result.startAnimation(animation);
                    lastPosition = position;


        ImageLoader imageLoader = ImageLoader.getInstance();

        int defaultImage = mContext.getResources().getIdentifier("@drawable/ic_menu_camera", null, mContext.getPackageName());
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(defaultImage)
                .showImageOnFail(defaultImage)
                .showImageOnLoading(defaultImage).build();
        imageLoader.displayImage(imgURL, holder.image, options);

        holder.name.setText(name);

        holder.branch.setText(branch);
        holder.rollno.setText(rollno);

        return convertView;
    }

    private void setupImageLoader(){

        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
    }


}
