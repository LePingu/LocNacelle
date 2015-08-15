package com.example.hatim.locnacelle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rothavykhin on 29/06/15.
 */
public class Etape6_fragment extends Fragment  {

    private Button nextBtn;

    private TextView barre1;
    private TextView barre2;

    Typeface type;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape6);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement6, 0);
        barre2.setText(R.string.titre6);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.etape6_fragment, container, false);

        nextBtn = (Button) view.findViewById(R.id.btnEtapeSuivante);
        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Etape7_fragment frag7 = new Etape7_fragment();
                fragmentTransaction.replace(R.id.fragment_container, frag7, "fragment7");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                barre1.setText(R.string.title_activity_etape7);
                barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement7, 0);
                barre2.setText(R.string.titre7);
            }
        });

        //ajout du gif


        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");
        nextBtn.setTypeface(type);
        nextBtn.setTypeface(type);

        return view;
    }



}