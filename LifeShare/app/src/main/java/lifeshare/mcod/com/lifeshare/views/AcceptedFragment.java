package lifeshare.mcod.com.lifeshare.views;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import lifeshare.mcod.com.lifeshare.R;

/**
 * Created by est on 13/12/16.
 */

public class AcceptedFragment extends Fragment {
    private RecyclerView recyclerShares;
    public AcceptedFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_my_shares, container, false);
        recyclerShares = (RecyclerView)view.findViewById(R.id.recyclerShares);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);
        recyclerShares.setLayoutManager(layoutManager);
        recyclerShares.setAdapter(new SharesAdapter(getData()));
        return view;
    }

    private ArrayList<ShareDto> getData()
    {
        ArrayList<ShareDto> data = new ArrayList<>();
        data.add(new ShareDto("Clothes to be donated", "Posted on: 1hr ago", "Qty: 100", 1, "10 Kms"));
        return data;
    }

}