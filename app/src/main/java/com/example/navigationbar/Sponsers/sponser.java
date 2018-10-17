package com.example.navigationbar.Sponsers;

import android.content.Intent;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.navigationbar.MainActivity;
import com.example.navigationbar.R;

import java.util.ArrayList;

public class sponser extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelSponser> sponsersList;
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponser);
        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_arrow_back_white_24dp);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);


            }
        });

        //adding back arrow into toolbar
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

        recyclerView = findViewById(R.id.recycler_view);

        sponsersList = new ArrayList<>();

        sponsersList.add(new ModelSponser(R.drawable.godrej, "Godrej", "Gold sponser"));
        sponsersList.add(new ModelSponser(R.drawable.maruti, "Maruti Suzuki", "gold Soponser"));
        sponsersList.add(new ModelSponser(R.drawable.sbi, "SBI","Silver Sponser"));
        sponsersList.add(new ModelSponser(R.drawable.hdfc, "HDFC Bank","Silver Sponser"));
        sponsersList.add(new ModelSponser(R.drawable.intel, "Intel","Silver Sponser"));
        sponsersList.add(new ModelSponser(R.drawable.ravangal Star, "Ravagla star", "Gold sponser"));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager rlmanager = linearLayoutManager;
        recyclerView.setLayoutManager(rlmanager);

        FoodSponser adapter = new FoodSponser(this, sponsersList);

        recyclerView.setAdapter(adapter);
    }


    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        return true;
    }

    public void onBackPressed() {

        if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, " click again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }




}
