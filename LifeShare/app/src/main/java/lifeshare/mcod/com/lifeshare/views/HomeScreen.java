package lifeshare.mcod.com.lifeshare.views;

import android.content.Intent;
import android.os.Bundle;
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
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import lifeshare.mcod.com.lifeshare.R;

public class HomeScreen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {
    private Boolean isFabOpen = false;
    private FloatingActionButton mFabHelpHand, mFabCloths, mFabFood, mFabHousehold, mFabStationary;
    private Animation fab_open,fab_close,rotate_forward,rotate_backward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mFabHelpHand = (FloatingActionButton) findViewById(R.id.fab);
        mFabCloths = (FloatingActionButton) findViewById(R.id.fabCloths);
        mFabFood = (FloatingActionButton) findViewById(R.id.fabFood);
        mFabHousehold = (FloatingActionButton) findViewById(R.id.fabHousehold);
        mFabStationary = (FloatingActionButton) findViewById(R.id.fabStationary);

        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_backward);
        mFabCloths.setOnClickListener(this);
        mFabFood.setOnClickListener(this);
        mFabHousehold.setOnClickListener(this);
        mFabStationary.setOnClickListener(this);
        mFabHelpHand.setOnClickListener(this);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
       // getMenuInflater().inflate(R.menu.home_screen, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        switch(id){
            case R.id.item_my_shares:
                startActivity(new Intent(HomeScreen.this, MySharesActivity.class));
                break;
            case R.id.item_logout:
                break;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.fab:
                //animateFAB();
                startActivity(new Intent(HomeScreen.this, ShareDetailsActivity.class));
                break;
            case R.id.fabCloths:
                break;
            case R.id.fabFood:
                break;
            case R.id.fabHousehold:
                break;
            case R.id.fabStationary:
                break;
        }
    }

    public void animateFAB(){

        if(isFabOpen){

            mFabHelpHand.startAnimation(rotate_backward);
            mFabCloths.startAnimation(fab_close);
            mFabFood.startAnimation(fab_close);
            mFabHousehold.startAnimation(fab_close);
            mFabStationary.startAnimation(fab_close);
            mFabCloths.setClickable(false);
            mFabFood.setClickable(false);
            mFabHousehold.setClickable(false);
            mFabStationary.setClickable(false);
            isFabOpen = false;

        } else {

            mFabHelpHand.startAnimation(rotate_forward);
            mFabCloths.startAnimation(fab_open);
            mFabFood.startAnimation(fab_open);
            mFabHousehold.startAnimation(fab_open);
            mFabStationary.startAnimation(fab_open);
            mFabCloths.setClickable(true);
            mFabFood.setClickable(true);
            mFabHousehold.setClickable(true);
            mFabStationary.setClickable(true);
            isFabOpen = true;

        }
    }
}
