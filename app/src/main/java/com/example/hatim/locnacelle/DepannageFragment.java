package com.example.hatim.locnacelle;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DepannageFragment extends Fragment {

    TextView text1;
    TextView text2;
    TextView text4;
    TextView text3;

    Typeface type;


    public DepannageFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(), "GeosansLight.ttf");
        // Inflate the layout for this fragment
        text1 = (TextView)getView().findViewById(R.id.textquestion1);
        text3 = (TextView)getView().findViewById(R.id.textquestion2);
        text2 = (TextView)getView().findViewById(R.id.textrep1);
        text4 = (TextView)getView().findViewById(R.id.textrep2);

        text1.setTypeface(type);
        text2.setTypeface(type);
        text3.setTypeface(type);
        text4.setTypeface(type);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        return inflater.inflate(R.layout.fragment_depannage, container, false);
    }


}
