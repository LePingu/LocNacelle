package com.example.hatim.locnacelle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import android.support.v4.app.FragmentManager;
//import android.support.v4.app.Fragment;


public class Etape2_fragment extends Fragment {

    private Button interieurBtn;
    private Button exterieurBtn;
    private Button nextBtn;

    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private TextView barre1;
    private TextView barre2;

    boolean intBtnPressed = false;
    boolean extBtnPressed = false;

    Typeface type;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_type_chantier);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement2, 0);
        barre2.setText(R.string.TypeChantier);

    }



    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_etape2_fragment, container, false);



        interieurBtn = (Button) view.findViewById(R.id.interieurBtn);
        interieurBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                interieurBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                exterieurBtn.setBackgroundColor(getResources().getColor(R.color.white));
                tv1.setBackgroundColor(getResources().getColor(R.color.orange));
                tv2.setBackgroundColor(getResources().getColor(R.color.orange));
                tv3.setBackgroundColor(getResources().getColor(R.color.white));
                tv4.setBackgroundColor(getResources().getColor(R.color.white));

                intBtnPressed = true;
                extBtnPressed = false;
            }
        });

        exterieurBtn = (Button) view.findViewById(R.id.exterieurBtn);
        exterieurBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                exterieurBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                interieurBtn.setBackgroundColor(getResources().getColor(R.color.white));
                tv1.setBackgroundColor(getResources().getColor(R.color.white));
                tv2.setBackgroundColor(getResources().getColor(R.color.white));
                tv3.setBackgroundColor(getResources().getColor(R.color.orange));
                tv4.setBackgroundColor(getResources().getColor(R.color.orange));

                extBtnPressed = true;
                intBtnPressed = false;
            }
        });

        tv1 = (TextView)view.findViewById(R.id.tv1);
        tv2 = (TextView)view.findViewById(R.id.tv2);
        tv3 = (TextView)view.findViewById(R.id.tv3);
        tv4 = (TextView)view.findViewById(R.id.tv4);

        nextBtn = (Button)view.findViewById(R.id.btnEtapeSuivante);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (extBtnPressed || intBtnPressed)

                {
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Etape3_fragment frag3 = new Etape3_fragment();
                    fragmentTransaction.replace(R.id.fragment_container, frag3, "fragment3");
                    fragmentTransaction.addToBackStack("fragment3");
                    fragmentTransaction.commit();
                } else

                {
                    FragmentManager fragmentManager = getFragmentManager();
                    DialogFragmentOptions dialogFragment = new DialogFragmentOptions();
                    dialogFragment.show(fragmentManager, "Fragment Dialog");
                }

            }
        });


        type = Typeface.createFromAsset(getActivity().getAssets(),"bebasneue.ttf");

        interieurBtn.setTypeface(type);
        exterieurBtn.setTypeface(type);
        nextBtn.setTypeface(type);

        return view;

    }


}
