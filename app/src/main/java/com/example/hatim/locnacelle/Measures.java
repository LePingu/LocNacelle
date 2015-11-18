package com.example.hatim.locnacelle;


import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Measures extends Fragment {

    Button distance1;
    Button distance;
    Button distance3;
    Button distance4;
    Button distance2;

    Button[] list;

    Typeface type;

    Toolbar toolbar;


    public Measures() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);


        distance = (Button)getActivity().findViewById(R.id.distancemetre);
        distance1 = (Button)getActivity().findViewById(R.id.distanceparcourue);
        distance2 = (Button)getActivity().findViewById(R.id.montagePhoto);
        distance3 = (Button)getActivity().findViewById(R.id.autodistance);
        distance4 = (Button)getActivity().findViewById(R.id.telemetre);

        list = new Button[]{
                distance,
                distance1,
                distance2,
                distance3,
                distance4,
        };

        type = Typeface.createFromAsset(getActivity().getAssets(),"bebasneue.ttf");

        changeType(list);


        distance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=oops.distancemeter2"));
                startActivity(intent);
            }
        });

        distance1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=omaeno.tools.kyorisokutei"));
                startActivity(intent);
            }
        });

        distance2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.ImaginationUnlimited.instaframe"));
                startActivity(intent);
            }
        });

        distance3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=com.potatotree.autodistance"));
                startActivity(intent);
            }
        });

        distance4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("market://details?id=kr.sira.measure&"));
                startActivity(intent);
            }
        });

        toolbar = (Toolbar)getActivity().findViewById(R.id.toolbar);


        //((ActionBarActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //((ActionBarActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack();
            }
        });

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_measures, container, false);




        return view;




    }

    public void changeType(Button[] butt){

        for (Button bou : butt) {
            bou.setTypeface(type);
        }
    }

    @Override

    public void onDestroy(){

        //((ActionBarActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        //((ActionBarActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(false);



        super.onDestroy();


    }



}
