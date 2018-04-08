package com.example.navigationbar.Events.event.mData;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.navigationbar.R;

/**
 * Created by root on 28/3/18.
 */

public class eventDet extends AppCompatActivity {

    Toolbar toolbar;
    TextView title_tv,desc_tv,venue1,date1,time1,Nu1,Nu2,entryFees;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_description);

        init();

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        String name = getIntent().getStringExtra("event_name");
        String desc = getIntent().getStringExtra("event_desc");
        String ven = getIntent().getStringExtra("event_venue");
        String dat = getIntent().getStringExtra("event_date");
        String tim = getIntent().getStringExtra("event_time");
        String nu1 = getIntent().getStringExtra("event_nu1");
        String nu2 = getIntent().getStringExtra("event_nu2");
        String ent = getIntent().getStringExtra("event_Fee");

                setTitle(name);
        setSupportActionBar(toolbar);
        toolbar.setTitle("name");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        //title_tv.setText(name);
        desc_tv.setText(desc);
        venue1.setText(ven);
        date1.setText(dat);
        time1.setText(tim);

        Nu1.setText(nu1);
        Nu2.setText(nu2);
        entryFees.setText(ent);

        Toast.makeText(getApplicationContext(),""+name,Toast.LENGTH_SHORT).show();
    }


    public void init() {
       // title_tv = (TextView)findViewById(R.id.header_event);
        desc_tv = (TextView) findViewById(R.id.desc_event);
        venue1 = (TextView) findViewById(R.id.venue);
        date1 = (TextView)findViewById(R.id.date);
        time1 = (TextView)findViewById(R.id.time);
        Nu1 = (TextView)findViewById(R.id.nu1);
        Nu2= (TextView)findViewById(R.id.nu2);
        entryFees= (TextView)findViewById(R.id.entryFee);

    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

}
