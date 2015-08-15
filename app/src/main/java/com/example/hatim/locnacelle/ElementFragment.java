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
public class ElementFragment extends Fragment {


    public ElementFragment() {
        // Required empty public constructor
    }

    TextView text1;
    TextView text2;
    TextView text4;
    TextView text3;
    TextView text5;
    TextView text6;
    TextView text7;
    TextView text8;

    Typeface type;
    Typeface type2;


    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(), "GeosansLight.ttf");
        type2 = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");
        // Inflate the layout for this fragment
        text1 = (TextView)getView().findViewById(R.id.textspe1);
        text2 = (TextView)getView().findViewById(R.id.textspe2);
        text3 = (TextView)getView().findViewById(R.id.textspe3);
        text4 = (TextView)getView().findViewById(R.id.textspe4);
        text5 = (TextView)getView().findViewById(R.id.textspe5);
        text6 = (TextView)getView().findViewById(R.id.textspe6);
        text7 = (TextView)getView().findViewById(R.id.textspe7);
        text8 = (TextView)getView().findViewById(R.id.textspe8);

        text1.setTypeface(type);
        text2.setTypeface(type2);
        text3.setTypeface(type);
        text4.setTypeface(type2);
        text5.setTypeface(type);
        text6.setTypeface(type2);
        text7.setTypeface(type);
        text8.setTypeface(type2);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_element, container, false);
    }


}
