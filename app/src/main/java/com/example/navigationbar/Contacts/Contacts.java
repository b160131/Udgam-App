package com.example.navigationbar.Contacts;

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
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.navigationbar.Developers.developer;
import com.example.navigationbar.Events.event.events;
import com.example.navigationbar.Main2Activity;
import com.example.navigationbar.MainActivity;
import com.example.navigationbar.R;
import com.example.navigationbar.Sponsers.sponser;
import com.example.navigationbar.about_udgam.udgam;
import com.example.navigationbar.gallery.gallery;
import com.example.navigationbar.guests.guest;

public class Contacts extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView lst;
    String[] fruit = {"Dr Pranab Kundu", "Sourav singh Rathore", "Gaurav Kumar", "Abisek Dahal", "Meraj Ahmad","Supriyo Banarjee","Deepak Prasad","Mayank Josi","Bimal Gautam","Prateek Sharma","Divyanshi Verma" ,"Diksha Soni","Rishabh Mishra","Mithun Singh","Aksheeta","Hema","Prerna Tamang","Nim Lhamu Tmang","Manish Kumar","Prince Raj","Suraj Kumar Giri","Priyanka","Dezong Lepcha","Diwakar Sharma","Soni Reshmi","Pritam","Sandeep","Jahir","Anjum","Goverdhan","Aditi Anupam","Bittu Jaiswal","Snehal M Panchal","Koshik Singh","Prasun Kumar","Vivek Kumar","K.Sai Lakshman","Rinzing Bhutia","Sanyam Chauhan","Narbada"};

    String[] desc = {"Faculty Advisor", "President", "Vice-President", "Secretary", "Joint Secretary ","Website(Coordinator)","Website(Coordinator)","Technical(Coordinator)","Technical(Coordinator)","Technical(Coordinator)","Event(Coordinator)","Event(Coordinator)","Event(Coordinator)","Event(Coordinator)","Cultural(Coordinator)","Cultural(Coordinator)","Cultural(Coordinator)","Hospitality(Coordinator)","Hospitality(Coordinator)","Sponsership(Coordinator)","Sponsership(Coordinator)","Sponsership(Coordinator)","Sponsership(Coordinator)","Sponsership(Coordinator)","Creativity(Coordinator)","Creativity(Coordinator)","Creativity(Coordinator)","Creativity(Coordinator)","Content(Coordinator)","Content(Coordinator)","Procurement(Coordinator)","Procurement(Coordinator)","Wind Up(Coordinator)","Wind Up(Coordinator)","Wind Up(Coordinator)","Wind Up(Coordinator","Accounts(Coordinator)","Accounts(Coordinator)","Merchandise(Coordinator)","Merchandise(Coordinator)","Publicity(Coordinator)","Publicity(Coordinator)","Publicity(Coordinator)"};
    Integer[] imgid = {R.drawable.pranab, R.drawable.sourav, R.drawable.gaurav, R.drawable.abisek, R.drawable.meeraj, R.drawable.supriyo,R.drawable.deepak,R.drawable.mayank,R.drawable.bimal,R.drawable.t2,R.drawable.divyanshi,R.drawable.diksha,R.drawable.rishab,R.drawable.mithun,R.drawable.aksheeta,R.drawable.hema2,R.drawable.prena,R.drawable.t2,R.drawable.t2,R.drawable.prince,R.drawable.suraj,R.drawable.priyanka,R.drawable.t2,R.drawable.diwakar,R.drawable.soni,R.drawable.pritam,R.drawable.sandeep,R.drawable.t2,R.drawable.anjum2,R.drawable.govardhan,R.drawable.aditi,R.drawable.bittu,R.drawable.t2,R.drawable.kaushik,R.drawable.t2,R.drawable.t2,R.drawable.t2,R.drawable.t2,R.drawable.sanyam,R.drawable.narbada};
    boolean doubleBackToExitPressedOnce = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);
        Toast.makeText(this, "click for description",
                Toast.LENGTH_LONG).show();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_arrow_back_white_24dp);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);


            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        lst = findViewById(R.id.lvMain);

        CustomListview customListview=new CustomListview(this,fruit,desc,imgid);
        lst.setAdapter(customListview);




        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position,
                                    long id) {
                int k=position;



                MyAlert myalert=new MyAlert(fruit[position], imgid[position]);
                myalert.show(getFragmentManager(),"MyAlert");

            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else if (doubleBackToExitPressedOnce) {
            Intent intent = new Intent(this, MainActivity.class);
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
        getMenuInflater().inflate(R.menu.main, menu);
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



        else if (id == R.id.nav_events) {
            Intent intent = new Intent(this, events.class);
            startActivity(intent);

        }

        else if (id == R.id.nav_developer) {
            Intent intent = new Intent(this, developer.class);
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


