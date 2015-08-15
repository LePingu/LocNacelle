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
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by rothavykhin on 30/06/15.
 */
public class Etape7_fragment extends Fragment implements View.OnClickListener {

    private Button nextBtn;
    private Button pleinPied;
    private Button quai;
    private Button ouiBtn;
    private Button nonBtn;

    private TextView largeur;
    private TextView tv1;
    private TextView tv2;
    private TextView barre1;
    private TextView barre2;

    private SeekBar seekBarLargeur;

    Typeface type;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape7);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement7, 0);
        barre2.setText(R.string.titre7);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.etape7_fragment, container, false);

        nextBtn = (Button) view.findViewById(R.id.btnEtapeSuivante);
        nextBtn.setOnClickListener(this);

        pleinPied = (Button) view.findViewById(R.id.pleinPiedBtn);
        pleinPied.setOnClickListener(this);

        quai = (Button) view.findViewById(R.id.quaiBtn);
        quai.setOnClickListener(this);

        ouiBtn = (Button) view.findViewById(R.id.oui_btn);
        ouiBtn.setOnClickListener(this);

        nonBtn = (Button) view.findViewById(R.id.non_btn);
        nonBtn.setOnClickListener(this);

        largeur = (TextView) view.findViewById(R.id.largeur);

        tv1 = (TextView) view.findViewById(R.id.tv1);
        tv2 = (TextView) view.findViewById(R.id.tv2);


        seekBarLargeur = (SeekBar) view.findViewById(R.id.seekbarLargeur);
        seekBarLargeur.setProgress(0);
        seekBarLargeur.incrementProgressBy(1);
        seekBarLargeur.setMax(90);
        largeur = (TextView)view.findViewById(R.id.largeur);

        seekBarLargeur.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                largeur.setText(String.valueOf(progress) + " M");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        nextBtn.setTypeface(type);
        pleinPied.setTypeface(type);
        quai.setTypeface(type);
        ouiBtn.setTypeface(type);
        nonBtn.setTypeface(type);
        largeur.setTypeface(type);

        return view;

    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.pleinPiedBtn:
                pleinPied.setBackgroundColor(getResources().getColor(R.color.orange));
                quai.setBackgroundColor(getResources().getColor(R.color.white));
                break;

            case R.id.quaiBtn:
                quai.setBackgroundColor(getResources().getColor(R.color.orange));
                pleinPied.setBackgroundColor(getResources().getColor(R.color.white));
                break;

            case R.id.oui_btn:
                ouiBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                tv1.setBackgroundColor(getResources().getColor(R.color.orange));
                tv2.setBackgroundColor(getResources().getColor(R.color.white));
                nonBtn.setBackgroundColor(getResources().getColor(R.color.white));
                break;

            case R.id.non_btn:
                nonBtn.setBackgroundColor(getResources().getColor(R.color.orange));
                tv2.setBackgroundColor(getResources().getColor(R.color.orange));
                tv1.setBackgroundColor(getResources().getColor(R.color.white));
                ouiBtn.setBackgroundColor(getResources().getColor(R.color.white));
                break;

            case R.id.btnEtapeSuivante:
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Etape8_fragment frag8 = new Etape8_fragment();
                fragmentTransaction.replace(R.id.fragment_container, frag8, "fragment8");
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

        }

    }
}
