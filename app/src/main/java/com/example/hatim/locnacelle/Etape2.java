package com.example.hatim.locnacelle;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Etape2 extends Fragment {


    private TextView barre1;
    private TextView barre2;

    Typeface type;

    public Etape2() {
        // Required empty public constructor
    }

    @Override

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");
        barre1 = (TextView)getView().findViewById(R.id.barre1);
        barre2 = (TextView)getView().findViewById(R.id.barre2);

        barre1.setTypeface(type);
        barre2.setTypeface(type);


        if (savedInstanceState == null)
        {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Etape2_fragment frag2 = new Etape2_fragment();
            fragmentTransaction.add(R.id.fragment_container, frag2, "fragment2");
            fragmentTransaction.commit();

        }


    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_etape2, container, false);
    }


}
