package com.example.hatim.locnacelle;


import android.app.AlertDialog;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rothavykhin on 06/07/15.
 */
public class Etape8_fragment extends Fragment {

    private EditText nom;
    private EditText numero;
    private EditText rue;
    private EditText codePostal;
    private EditText ville;

    private Button nextBtn;

    Typeface type;

    private TextView barre1;
    private TextView barre2;


    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape8);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement8, 0);
        barre2.setText(R.string.titre8);
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.etape8_fragment, container, false);

        nom = (EditText) view.findViewById(R.id.editNom);
        numero = (EditText) view.findViewById(R.id.editNumero);
        rue = (EditText) view.findViewById(R.id.editRue);
        codePostal = (EditText) view.findViewById(R.id.editCodePostal);
        ville = (EditText) view.findViewById(R.id.editVille);
        nextBtn = (Button) view.findViewById(R.id.btnEtapeSuivante);

        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        nextBtn.setTypeface(type);
        nom.setTypeface(type);
        numero.setTypeface(type);
        rue.setTypeface(type);
        codePostal.setTypeface(type);
        ville.setTypeface(type);

        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (nom.getText().length() == 0)
                {
                    FragmentManager fragmentManager = getFragmentManager();
                    DialogFragmentChamps dialogFragment = new DialogFragmentChamps();
                    dialogFragment.show(fragmentManager, "Fragment Dialog");
                }

            }
        });

        return view;
    }
}
