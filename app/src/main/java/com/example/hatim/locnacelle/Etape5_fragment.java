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
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by rothavykhin on 28/06/15.
 */
public class Etape5_fragment extends Fragment implements View.OnClickListener {

    private Button nextBtn;
    private Button beton;
    private Button parquet;
    private Button enrobe;
    private Button carrelage;
    private Button plastique;
    private Button bois;
    private Button terrain;
    private Button plancher;
    private Button concasse;
    private Button ouiBtn;
    private Button nonBtn;

    private TextView poids;
    private TextView tv1;
    private TextView tv2;
    private TextView barre1;
    private TextView barre2;

    private SeekBar seekBarPoids;

    boolean ouiPressed = false;
    boolean nonPressed = false;
    boolean betonPressed = false;
    boolean parquetPressed = false;
    boolean enrobePressed = false;
    boolean carrelagePressed = false;
    boolean plastiquePressed = false;
    boolean boisPressed = false;
    boolean terrainPressed = false;
    boolean plancherPressed = false;
    boolean concassePressed = false;


    Typeface type;

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape5);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement5, 0);
        barre2.setText(R.string.sous_sol);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.etape5_fragment, container, false);

        nextBtn = (Button) view.findViewById(R.id.btnEtapeSuivante);
        nextBtn.setOnClickListener(this);

        beton = (Button) view.findViewById(R.id.betonBtn);
        beton.setOnClickListener(this);

        parquet = (Button) view.findViewById(R.id.parquetBtn);
        parquet.setOnClickListener(this);

        enrobe = (Button) view.findViewById(R.id.enrobeBtn);
        enrobe.setOnClickListener(this);

        carrelage = (Button) view.findViewById(R.id.carrelageBtn);
        carrelage.setOnClickListener(this);

        plastique = (Button) view.findViewById(R.id.plastiqueBtn);
        plastique.setOnClickListener(this);

        plancher = (Button) view.findViewById(R.id.plancherBtn);
        plancher.setOnClickListener(this);

        bois = (Button) view.findViewById(R.id.boisBtn);
        bois.setOnClickListener(this);

        terrain = (Button) view.findViewById(R.id.terrainBtn);
        terrain.setOnClickListener(this);

        concasse = (Button) view.findViewById(R.id.concasseBtn);
        concasse.setOnClickListener(this);

        ouiBtn = (Button) view.findViewById(R.id.oui_btn);
        ouiBtn.setOnClickListener(this);

        nonBtn = (Button) view.findViewById(R.id.non_btn);
        nonBtn.setOnClickListener(this);

        poids = (TextView) view.findViewById(R.id.poids);
        tv1 = (TextView) view.findViewById(R.id.tv1);
        tv2 = (TextView) view.findViewById(R.id.tv2);


        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        nextBtn.setTypeface(type);
        parquet.setTypeface(type);
        plancher.setTypeface(type);
        plastique.setTypeface(type);
        enrobe.setTypeface(type);
        carrelage.setTypeface(type);
        bois.setTypeface(type);
        concasse.setTypeface(type);
        terrain.setTypeface(type);
        beton.setTypeface(type);
        ouiBtn.setTypeface(type);
        nonBtn.setTypeface(type);
        poids.setTypeface(type);

        seekBarPoids = (SeekBar) view.findViewById(R.id.seekbarPoids);
        seekBarPoids.setProgress(0);
        seekBarPoids.incrementProgressBy(1);
        seekBarPoids.setMax(5000);
        poids = (TextView)view.findViewById(R.id.poids);

        seekBarPoids.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                poids.setText(String.valueOf(progress) + " KG");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {

            }
        });

        return view;

    };


    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.parquetBtn:
                parquet.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                parquetPressed = true;
                break;

            case R.id.plancherBtn:
                plancher.setBackgroundColor(getResources().getColor(R.color.orange));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                plancherPressed = true;
                break;

            case R.id.enrobeBtn:
                enrobe.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                enrobePressed = true;
                break;

            case R.id.carrelageBtn:
                carrelage.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                carrelagePressed = true;
                break;

            case R.id.boisBtn:
                bois.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                boisPressed = true;
                break;

            case R.id.concasseBtn:
                concasse.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                concassePressed = true;
                break;

            case R.id.terrainBtn:
                terrain.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                terrainPressed = true;
                break;

            case R.id.betonBtn:
                beton.setBackgroundColor(getResources().getColor(R.color.orange));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                plastique.setBackgroundColor(getResources().getColor(R.color.white));
                betonPressed = true;
                break;

            case R.id.plastiqueBtn:
                plastique.setBackgroundColor(getResources().getColor(R.color.orange));
                parquet.setBackgroundColor(getResources().getColor(R.color.white));
                plancher.setBackgroundColor(getResources().getColor(R.color.white));
                enrobe.setBackgroundColor(getResources().getColor(R.color.white));
                carrelage.setBackgroundColor(getResources().getColor(R.color.white));
                bois.setBackgroundColor(getResources().getColor(R.color.white));
                concasse.setBackgroundColor(getResources().getColor(R.color.white));
                terrain.setBackgroundColor(getResources().getColor(R.color.white));
                beton.setBackgroundColor(getResources().getColor(R.color.white));
                plastiquePressed = true;
                break;

            case R.id.oui_btn:
                ouiBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                tv1.setBackgroundColor(getResources().getColor(R.color.orange));
                tv2.setBackgroundColor(getResources().getColor(R.color.white));
                nonBtn.setBackgroundColor(getResources().getColor(R.color.white));
                ouiPressed = true;
                break;

            case R.id.non_btn:
                ouiBtn.setBackgroundColor(getResources().getColor(R.color.white));
                tv1.setBackgroundColor(getResources().getColor(R.color.white));
                tv2.setBackgroundColor(getResources().getColor(R.color.orange));
                nonBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                nonPressed = true;
                break;

            case R.id.btnEtapeSuivante:

                if ( (betonPressed || enrobePressed || carrelagePressed || plancherPressed || parquetPressed || plastiquePressed || boisPressed || terrainPressed || concassePressed) && (ouiPressed || nonPressed) )

                {
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    Etape6_fragment frag6 = new Etape6_fragment();
                    fragmentTransaction.replace(R.id.fragment_container, frag6, "fragment6");
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


