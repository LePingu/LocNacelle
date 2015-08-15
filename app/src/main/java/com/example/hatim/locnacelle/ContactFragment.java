package com.example.hatim.locnacelle;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.lang.reflect.Type;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    TextView contactText;
    Typeface type;


    public ContactFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(),"GeosansLight.ttf");

        contactText = (TextView)getView().findViewById(R.id.contactText);
        contactText.setTextColor(Color.BLACK);
        contactText.setTypeface(type, Typeface.BOLD);
        contactText.setTextSize(5 * getResources().getDisplayMetrics().density);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false);
    }


}
