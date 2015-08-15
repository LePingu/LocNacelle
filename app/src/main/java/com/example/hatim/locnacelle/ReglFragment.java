package com.example.hatim.locnacelle;


import android.support.v4.app.Fragment;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReglFragment extends Fragment {


    TextView ReglText;
    Typeface type;

    public ReglFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(),"GeosansLight.ttf");

        ReglText = (TextView)getView().findViewById(R.id.reglText);
        ReglText.setTextColor(Color.BLACK);
        ReglText.setTypeface(type, Typeface.BOLD);
        ReglText.setTextSize(5 * getResources().getDisplayMetrics().density);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_regl, container, false);
    }


}
