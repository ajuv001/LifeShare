package lifeshare.mcod.com.lifeshare.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import lifeshare.mcod.com.lifeshare.R;

public class MySharesActivity extends AppCompatActivity {

    private RecyclerView recyclerShares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_shares);
        recyclerShares = (RecyclerView)findViewById(R.id.recyclerShares);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerShares.setLayoutManager(layoutManager);
        recyclerShares.setAdapter(new SharesAdapter(getData()));
    }

    private ArrayList<ShareDto> getData()
    {
        ArrayList<ShareDto> data = new ArrayList<>();
        data.add(new ShareDto("Left over food from a function", "Posted on: 3hrs ago", "Qty: 25ppl", 0, null));
        data.add(new ShareDto("Want to share some clothes", "Posted on: 1hr ago", "Qty: 30", 1, "Received By Vision NGO"));
        return data;
    }
}
