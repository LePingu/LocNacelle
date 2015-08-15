package com.example.hatim.locnacelle;


import android.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Etape3_fragment extends Fragment {

    private EditText descrip_besoin;
    private TextView barre1;
    private TextView barre2;
    private Button nextBtn;
    Typeface type;


    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);


        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape3);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement3, 0);
        barre2.setText(R.string.descrip_besoin);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.etape3_fragment, container, false);

        /*ab = this.getActivity().getActionBar();
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        ab.setDisplayHomeAsUpEnabled(true);
        ab.setDisplayShowHomeEnabled(true); */


        descrip_besoin = (EditText) view.findViewById(R.id.editBesoin);
        nextBtn = (Button) view.findViewById(R.id.btnEtapeSuivante);

        type = Typeface.createFromAsset(getActivity().getAssets(),"bebasneue.ttf");
        nextBtn.setTypeface(type);

        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Etape4_fragment frag4 = new Etape4_fragment();
                fragmentTransaction.replace(R.id.fragment_container, frag4, "fragment4");
                fragmentTransaction.addToBackStack("fragment4");
                fragmentTransaction.commit();


                barre1.setText(R.string.title_activity_etape4);
                barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement4, 0);
                barre2.setText(R.string.sous_sol);

            }
        });
        return view;
    }
}