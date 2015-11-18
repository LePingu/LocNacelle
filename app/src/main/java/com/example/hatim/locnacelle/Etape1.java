package com.example.hatim.locnacelle;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.graphics.Typeface;
import android.widget.Button;
import android.widget.TextView;


/**
 * Created by rothavykhin on 21/08/15.
 */
public class Etape1 extends Fragment {

    Button formulaire;
    Button suite_parcours;
    Button next_btn;
    Typeface type;
    TextView sous_titre;

    public boolean formulaireBtnPressed = false;
    public boolean suite_parcours_BtnPressed = false;


    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        sous_titre = (TextView) getView().findViewById(R.id.sous_titre_etape1);
        sous_titre.setTypeface(type);

        formulaire = (Button) getView().findViewById(R.id.formulaire_etape1);
        formulaire.setTypeface(type);
        formulaire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formulaire.setBackgroundColor(getResources().getColor(R.color.orange));
                suite_parcours.setBackgroundColor(getResources().getColor(R.color.white));
                formulaireBtnPressed = true;
            }
        });

        suite_parcours = (Button) getView().findViewById(R.id.suite_parcours);
        suite_parcours.setTypeface(type);
        suite_parcours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suite_parcours.setBackgroundColor(getResources().getColor(R.color.orange));
                formulaire.setBackgroundColor(getResources().getColor(R.color.white));
                suite_parcours_BtnPressed = true;
            }
        });

        next_btn = (Button) getView().findViewById(R.id.btnEtapeSuivante);
        next_btn.setTypeface(type);

        next_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (formulaireBtnPressed) {
                    /* envoi d'email
                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, adressemail);
                    email.setType("plain/text"); */

                    FragmentManager fragmentManager = getFragmentManager();
                    Progress_dialog_fragment progress_dialogFragment = new Progress_dialog_fragment();
                    progress_dialogFragment.show(fragmentManager, "Progress dialogfrag");
                }

                if (suite_parcours_BtnPressed) {

                    //passer à l'étape 2

                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Etape2_fragment frag2 = new Etape2_fragment();
                    fragmentTransaction.replace(R.id.fragment_container, frag2, "fragment2");
                    fragmentTransaction.addToBackStack("fragment2");
                    fragmentTransaction.commit();


                    // ici test : passage à l'étape 8

                    /*FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Etape8_fragment frag8 = new Etape8_fragment();
                    fragmentTransaction.replace(R.id.fragment_container, frag8, "fragment8");
                    fragmentTransaction.addToBackStack("fragment8");
                    fragmentTransaction.commit();*/
                }

            }
        });


    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment


        return inflater.inflate(R.layout.fragment_etape1, container, false);

    }

}
