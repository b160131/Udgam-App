package com.example.navigationbar.Developers;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.example.navigationbar.Contacts.Contacts;
import com.example.navigationbar.Events.event.events;
import com.example.navigationbar.Main2Activity;
import com.example.navigationbar.MainActivity;
import com.example.navigationbar.R;
import com.example.navigationbar.Sponsers.sponser;
import com.example.navigationbar.about_udgam.udgam;
import com.example.navigationbar.gallery.gallery;
import com.example.navigationbar.guests.guest;

import java.util.ArrayList;

public class developer extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        //developer informations is showing here, total developers of udgam 2018

        ListView mlistView = (ListView)findViewById(R.id.listview);

        Persion Prashant = new Persion("Prashant Agarwal","CSE","B160131","drawable://" + R.drawable.calender);
        Persion Aman = new Persion("Aman Yadav","CSE","B1600136","drawable://" + R.drawable.ic_menu_camera);
        Persion Anshu = new Persion("Anshu Priya Jain","CSE","B160093","drawable://" + R.drawable.ic_menu_camera);
        Persion Ravi =new Persion("Ravi Mishra","CSE","B160010","drawable://" + R.drawable.ic_menu_camera);
        Persion Akshay = new Persion("Kumar Akshay Gupta","CSE","B160106","drawable://" + R.drawable.ic_menu_camera);



        ArrayList<Persion> list= new ArrayList<>();
        list.add(Prashant);
        list.add(Aman);
        list.add(Anshu);
        list.add(Ravi);
        list.add(Akshay);




        PersonListAdapter adapter= new PersonListAdapter(this,R.layout.devlist,list);
        mlistView.setAdapter(adapter);

    }



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, " click again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.developer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

        if (id == R.id.nav_demo)
        {Intent intent= new Intent(this,Main2Activity.class);
            startActivity(intent);

        } else if (id == R.id.nav_gallery) {
            Intent intent = new Intent(this, gallery.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_contacts) {
            Intent intent = new Intent(this, Contacts.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_events) {
            Intent intent = new Intent(this, events.class);
            startActivity(intent);

        }



        else if (id == R.id.nav_udgam) {
            Intent intent = new Intent(this, udgam.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_guests) {
            Intent intent = new Intent(this, guest.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_sponsers) {
            Intent intent = new Intent(this, sponser.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_exit) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
