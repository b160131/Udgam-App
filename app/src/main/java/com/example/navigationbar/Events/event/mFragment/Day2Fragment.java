package com.example.navigationbar.Events.event.mFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.navigationbar.Events.event.mData.Day;
import com.example.navigationbar.Events.event.mListView.CustomAdapter;
import com.example.navigationbar.R;

import java.util.ArrayList;

/**
 * Created by root on 28/3/18.
 */

public class Day2Fragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.day2, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.day2ListView);


        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getEvents2());
        lv.setAdapter(adapter);


        return rootView;
    }

    private ArrayList<Day> getEvents2()

    {
        String[] desc2 = getResources().getStringArray(R.array.description2);
        String[] venue2 = getResources().getStringArray(R.array.Venue2);
        String[] date2 = getResources().getStringArray(R.array.Date2);
        String[] time2 = getResources().getStringArray(R.array.Time2);
        String[] nu11 = getResources().getStringArray(R.array.Nu11);
        String[] nu22 = getResources().getStringArray(R.array.Nu22);
        String[] Entry2 = getResources().getStringArray(R.array.entry2);


        ArrayList<Day> events = new ArrayList<>();
        Day ev1 = new Day("WALL PAINTING", R.drawable.wall, "day2", desc2[0],venue2[0],date2[0],time2[0],nu11[0],nu22[0],Entry2[0]);
        events.add(ev1);
        Day ev2 = new Day("ANTAKSHARI", R.drawable.antakshari, "day2", desc2[1],venue2[1],date2[1],time2[1],nu11[1],nu22[1],Entry2[1]);
        events.add(ev2);
        Day ev3 = new Day("MIMICRY", R.drawable.mimicry, "day 2", desc2[2],venue2[2],date2[2],time2[2],nu11[2],nu22[2],Entry2[2]);
        events.add(ev3);
        Day ev4 = new Day("J.A.M", R.drawable.jam, "day2", desc2[3],venue2[3],date2[3],time2[3],nu11[3],nu22[3],Entry2[3]);
        events.add(ev4);
        Day ev5 = new Day("TREASURE HUNT", R.drawable.treasurehunt, "day2", desc2[4],venue2[4],date2[4],time2[4],nu11[4],nu22[4],Entry2[4]);
        events.add(ev5);
        Day ev6 = new Day("CAMERA NE BNA DI JODI", R.drawable.camera_ne_bna_di_jodi, "day2", desc2[5],venue2[5],date2[5],time2[5],nu11[5],nu22[5],Entry2[5]);
        events.add(ev6);
        Day ev7 = new Day("ARM WRESTLING", R.drawable.arm_wrestling, "day2", desc2[6],venue2[6],date2[6],time2[6],nu11[6],nu22[6],Entry2[6]);
        events.add(ev7);
        Day ev8 = new Day("FAKE ADVERTISEMENT", R.drawable.fake, "day2",desc2[7],venue2[7],date2[7],time2[7],nu11[7],nu22[7],Entry2[7]);
        events.add(ev8);
        return events;
    }


    public String toString() {
        String title = "day 2";
        return title;
    }

}


