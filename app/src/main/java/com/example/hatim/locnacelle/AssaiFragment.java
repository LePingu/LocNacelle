package com.example.hatim.locnacelle;

import android.app.Activity;
import android.support.v4.app.FragmentTransaction;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.webkit.ConsoleMessage;
import android.widget.Button;

import java.io.Console;


/**
 * A simple {@link Fragment} subclass.
 */
public class AssaiFragment extends Fragment {


    public Display display;
    public Point size;
    public int width;
    public int height;

    Typeface typeF;

    Button Reservation;
    Button Mesures;
    Button Formation;
    Button Catalogue;
    Button Administration;
    Button Assistance;

    Fragment fragment = null;

    Toolbar toolbar;

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        display = getActivity().getWindowManager().getDefaultDisplay();
        size = new Point();
        display.getSize(size);
        width = size.x;
        Log.w("monMessage", Integer.toString(width));
        height = size.y;

        Reservation = (Button)getView().findViewById(R.id.reservation);
        Mesures = (Button)getView().findViewById(R.id.mesures);
        Formation = (Button)getView().findViewById(R.id.formation);
        Catalogue = (Button)getView().findViewById(R.id.catalogues);
        Assistance = (Button)getView().findViewById(R.id.assistance);
        Administration = (Button)getView().findViewById(R.id.administration);
        /*ViewGroup.LayoutParams params = (Reservation).getLayoutParams();
        ViewGroup.LayoutParams paramsA = (Assistance).getLayoutParams();
        ViewGroup.LayoutParams paramsC = (Catalogue).getLayoutParams();
        ViewGroup.LayoutParams paramsAd = (Administration).getLayoutParams();
        ViewGroup.LayoutParams paramsM = (Mesures).getLayoutParams();
        ViewGroup.LayoutParams paramsF = (Formation).getLayoutParams();
        params.height = paramsA.height = paramsC.height = paramsAd.height = paramsF.height = paramsM.height = height/3;
        params.width = paramsA.width = paramsAd.width = paramsC.width = paramsF.width = paramsM.width = width/2;*/

        typeF = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        Mesures.setTypeface(typeF);
        Reservation.setTypeface(typeF);
        Catalogue.setTypeface(typeF);
        Assistance.setTypeface(typeF);
        Administration.setTypeface(typeF);
        Formation.setTypeface(typeF);

        Reservation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = new Etape2();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });

        Catalogue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new NegativeLayout();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Assistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new AssistanceFragment();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Formation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new FormationFragment();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Administration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new AdministrationFragment();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        Mesures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new Measures();
                android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
                android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame_container, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        //toolbar = (Toolbar)getActivity().findViewById(R.id.toolbar);
        //toolbar.setNavigationIcon(0);

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View view = inflater.inflate(R.layout.fragment_assai, container, false);






        Log.w("moi","Je suis dans le OnCreate");
        return view;
    }


/*    public void onClick(View v) {
        Fragment newFragment = new Etape2();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        transaction.replace(R.id.fragment_container,newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }*/
}
