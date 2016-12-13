package lifeshare.mcod.com.lifeshare.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import lifeshare.mcod.com.lifeshare.R;

/**
 * Created by est on 13/12/16.
 */

public class ShareDetailsActivity extends AppCompatActivity implements View.OnClickListener{
private ImageView mtv_header_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_details_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayShowHomeEnabled(false);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //getSupportActionBar().setHomeAsUpIndicator(R.mipmap.arrow_back);
        mtv_header_back=(ImageView) findViewById(R.id.tv_header_back);
        mtv_header_back.setOnClickListener(this);

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
            finish();
            return true;
        }else if(id== R.id.action_forward){
            startActivity(new Intent(ShareDetailsActivity.this, MySharesActivity.class));
        }

        return super.onOptionsItemSelected(item);
    }
public void moveBack(){
    finish();
}
    @Override
    public void onClick(View v) {
        int id=v.getId();

        if(id==R.id.tv_header_back){
            finish();
        }
    }
}
