package com.example.hatim.locnacelle;


import android.graphics.Color;
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
public class CertifFragment extends Fragment {


    TextView certifText;
    Typeface type;

    public CertifFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(),"GeosansLight.ttf");

        certifText = (TextView)getView().findViewById(R.id.certifText);
        certifText.setTextColor(Color.BLACK);
        certifText.setTypeface(type, Typeface.BOLD);
        certifText.setTextSize(5 * getResources().getDisplayMetrics().density);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_certif, container, false);
    }


}
