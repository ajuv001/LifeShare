package lifeshare.mcod.com.lifeshare.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.support.v4.app.Fragment;

import lifeshare.mcod.com.lifeshare.R;

/**
 * Created by est on 13/12/16.
 */

public class OpenFragment extends Fragment{

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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.my_shares_item, container, false);
    }

}
