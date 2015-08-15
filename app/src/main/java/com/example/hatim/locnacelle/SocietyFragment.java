package com.example.hatim.locnacelle;


import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SocietyFragment extends Fragment {

    TextView societyText;
    Typeface type;


    public SocietyFragment() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(),"GeosansLight.ttf");

        societyText = (TextView)getView().findViewById(R.id.societyText);
        societyText.setTextColor(Color.BLACK);
        societyText.setTypeface(type, Typeface.BOLD);
        societyText.setTextSize(5 * getResources().getDisplayMetrics().density);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_society, container, false);
    }


}
