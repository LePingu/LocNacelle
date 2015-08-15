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
public class EvalFragment extends Fragment {


    TextView evalText;
    Typeface type;

    public EvalFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(),"GeosansLight.ttf");

        evalText = (TextView)getView().findViewById(R.id.evalText);
        evalText.setTextColor(Color.BLACK);
        evalText.setTypeface(type, Typeface.BOLD);
        evalText.setTextSize(5 * getResources().getDisplayMetrics().density);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eval, container, false);
    }


}
