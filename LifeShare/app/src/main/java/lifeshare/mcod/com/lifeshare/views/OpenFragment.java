package lifeshare.mcod.com.lifeshare.views;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.Fragment;

import java.util.ArrayList;

import lifeshare.mcod.com.lifeshare.R;

/**
 * Created by est on 13/12/16.
 */

public class OpenFragment extends Fragment{

    private RecyclerView recyclerShares;
    public OpenFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
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
        data.add(new ShareDto("Want to donate wheel chair", "Posted on: 30mns ago", "Qty: 10", 2, "20 Kms"));
        return data;
    }

}
