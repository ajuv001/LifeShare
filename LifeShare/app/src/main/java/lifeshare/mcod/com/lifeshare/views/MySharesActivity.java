package lifeshare.mcod.com.lifeshare.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

import lifeshare.mcod.com.lifeshare.R;

public class MySharesActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView recyclerShares;
    private ImageView mtv_header_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shares);
        recyclerShares = (RecyclerView)findViewById(R.id.recyclerShares);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //getSupportActionBar().setHomeAsUpIndicator(R.mipmap.arrow_back);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerShares.setLayoutManager(layoutManager);
        recyclerShares.setAdapter(new SharesAdapter(getData()));
        mtv_header_back=(ImageView) findViewById(R.id.tv_header_back);
        mtv_header_back.setOnClickListener(this);
    }

    private ArrayList<ShareDto> getData()
    {
        ArrayList<ShareDto> data = new ArrayList<>();
        data.add(new ShareDto("Left over food from a function", "Posted on: 3hrs ago", "Qty: 25ppl", 0, null));
        data.add(new ShareDto("Want to share some clothes", "Posted on: 1hr ago", "Qty: 30", 1, "Received By Vision NGO"));
        return data;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == android.R.id.home) {
            startActivity(new Intent(MySharesActivity.this, HomeScreen.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();

        if(id==R.id.tv_header_back){
            startActivity(new Intent(MySharesActivity.this, HomeScreen.class));
            finish();
        }
    }
   /* public void moveBack(){

        startActivity(new Intent(MySharesActivity.this, HomeScreen.class));
    }*/


}
