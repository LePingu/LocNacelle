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
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by rothavykhin on 28/06/15.
 */
public class Etape4_fragment extends Fragment implements View.OnClickListener{

    private Button nextBtn;
    private Button ouiBtn;
    private Button nonBtn;
    private Button garage;
    private Button videS;
    private Button parking;
    private Button autre;

    boolean ouiBtnPressed = false;
    boolean nonBtnPressed = false;
    boolean garageBtnPressed = false;
    boolean videBtnPressed = false;
    boolean parkingBtnPressed = false;
    //boolean autreBtnPressed = false;

    private TextView barre1;
    private TextView barre2;

    private EditText editSousS;

    Typeface type;

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape4);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement4, 0);
        barre2.setText(R.string.sous_sol);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.etape4_fragment, container, false);
        nextBtn = (Button) view.findViewById(R.id.btnEtapeSuivante);
        nextBtn.setOnClickListener(this);

        ouiBtn = (Button) view.findViewById(R.id.oui_btn);
        ouiBtn.setOnClickListener(this);

        nonBtn = (Button)view.findViewById(R.id.non_btn);
        nonBtn.setOnClickListener(this);

        garage = (Button) view.findViewById(R.id.garageBtn);
        garage.setOnClickListener(this);

        parking = (Button) view.findViewById(R.id.parkingBtn);
        parking.setOnClickListener(this);

        videS = (Button) view.findViewById(R.id.videSanitaireBtn);
        videS.setOnClickListener(this);

        autre = (Button) view.findViewById(R.id.autreBtn);
        autre.setOnClickListener(this);

        editSousS = (EditText) view.findViewById(R.id.editSousS);

        type = Typeface.createFromAsset(getActivity().getAssets(),"bebasneue.ttf");
        nextBtn.setTypeface(type);
        ouiBtn.setTypeface(type);
        nonBtn.setTypeface(type);
        parking.setTypeface(type);
        garage.setTypeface(type);
        videS.setTypeface(type);
        autre.setTypeface(type);
        editSousS.setTypeface(type);


        nextBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Etape5_fragment frag5 = new Etape5_fragment();
                fragmentTransaction.replace(R.id.fragment_container, frag5, "fragment5");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


            }
        });

        return view;

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.oui_btn:
                ouiBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                nonBtn.setBackgroundColor(getResources().getColor(R.color.white));

                ouiBtnPressed = true;
                nonBtnPressed = false;

                break;

            case R.id.non_btn:
                ouiBtn.setBackgroundColor(getResources().getColor(R.color.white));
                nonBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                garage.setBackgroundColor(getResources().getColor(R.color.white));
                parking.setBackgroundColor(getResources().getColor(R.color.white));
                videS.setBackgroundColor(getResources().getColor(R.color.white));
                autre.setBackgroundColor(getResources().getColor(R.color.white));

                ouiBtnPressed = false;
                nonBtnPressed = true;

                break;

            case R.id.garageBtn:
                garage.setBackgroundColor(getResources().getColor(R.color.orange));
                parking.setBackgroundColor(getResources().getColor(R.color.white));
                videS.setBackgroundColor(getResources().getColor(R.color.white));
                autre.setBackgroundColor(getResources().getColor(R.color.white));

                garageBtnPressed = true;

                break;

            case R.id.parkingBtn:
                parking.setBackgroundColor(getResources().getColor(R.color.orange));
                garage.setBackgroundColor(getResources().getColor(R.color.white));
                videS.setBackgroundColor(getResources().getColor(R.color.white));
                autre.setBackgroundColor(getResources().getColor(R.color.white));

                parkingBtnPressed = true;

                break;

            case R.id.videSanitaireBtn:
                videS.setBackgroundColor(getResources().getColor(R.color.orange));
                parking.setBackgroundColor(getResources().getColor(R.color.white));
                garage.setBackgroundColor(getResources().getColor(R.color.white));
                autre.setBackgroundColor(getResources().getColor(R.color.white));

                videBtnPressed = true;

                break;

            case R.id.autreBtn:
                autre.setBackgroundColor(getResources().getColor(R.color.orange));
                parking.setBackgroundColor(getResources().getColor(R.color.white));
                videS.setBackgroundColor(getResources().getColor(R.color.white));
                garage.setBackgroundColor(getResources().getColor(R.color.white));
                break;

            case R.id.btnEtapeSuivante:

                if ( (ouiBtnPressed && (garageBtnPressed || parkingBtnPressed || videBtnPressed)) || nonBtnPressed  )
                {
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Etape5_fragment frag5 = new Etape5_fragment();
                    fragmentTransaction.replace(R.id.fragment_container, frag5, "fragment5");
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();

                }

                else

                {
                    FragmentManager fragmentManager = getFragmentManager();
                    DialogFragmentOptions dialogFragment = new DialogFragmentOptions();
                    dialogFragment.show(fragmentManager, "Fragment Dialog");

                }





        }
    }
}