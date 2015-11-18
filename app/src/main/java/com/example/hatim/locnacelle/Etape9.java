package com.example.hatim.locnacelle;


import android.app.DatePickerDialog;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hatim.locnacelle.SelectDateFragment;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by rothavykhin on 25/08/15.
 */
public class Etape9 extends Fragment {

    private Button dateLivraison_btn;
    private Button dateFinChantier_btn;
    private Button nextBtn;

    private Button dateFinChantier;
    private Button dateLivraison;

    Typeface type;

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);

        type = Typeface.createFromAsset(getActivity().getAssets(), "bebasneue.ttf");

        dateLivraison = (Button) getView().findViewById(R.id.dateLivraison);
        dateFinChantier = (Button) getView().findViewById(R.id.dateFinChantier);


        dateLivraison_btn = (Button) getView().findViewById(R.id.btn_dateLivraison);
        dateLivraison_btn.setTypeface(type);
        dateLivraison_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                showDatePicker_livraison();
            }
        });
        /* dateLivraison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DialogFragment newFragment = new SelectDateFragment();
                newFragment.show(getFragmentManager(), "DatePicker");

            }
        }); */

        dateFinChantier_btn = (Button) getView().findViewById(R.id.btn_dateFinChantier);
        dateFinChantier_btn.setTypeface(type);
        dateFinChantier_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePicker_finChantier();
            }
        });

        nextBtn = (Button) getView().findViewById(R.id.btnEtapeSuivante);
        nextBtn.setTypeface(type);
        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


       /* barre1 = (TextView) this.getActivity().findViewById(R.id.barre1);
        barre2 = (TextView) this.getActivity().findViewById(R.id.barre2);

        barre1.setText(R.string.title_activity_etape9);
        barre1.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.avancement9, 0);
        barre2.setText(R.string.titre9); */
    }

    private void showDatePicker_finChantier() {

        SelectDateFragment date = new SelectDateFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */

        date.setCallBack(ondate_finChantier);
        date.show(getFragmentManager(), "Date Picker");
    }

    DatePickerDialog.OnDateSetListener ondate_finChantier= new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            dateFinChantier_btn.setText(String.valueOf(dayOfMonth) + " " + (monthOfYear+1)
                    + " " + String.valueOf(year));
        }
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_etape9, container, false);
        return view;

    }

    /* public void onViewCreated(View view, Bundle savedInstanceState)
    {
        super.onViewCreated(view, savedInstanceState);

        dateLivraison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                // TODO Auto-generated method stub
                showDatePicker();
            }
        });
    } */

    private void showDatePicker_livraison()
    {
        SelectDateFragment date = new SelectDateFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putString("month", calender.getDisplayName(calender.MONTH, calender.LONG, Locale.getDefault()));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */
        date.setCallBack(ondate_livraison);
        date.show(getFragmentManager(), "Date Picker");
    }

    DatePickerDialog.OnDateSetListener ondate_livraison = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            dateLivraison_btn.setText(String.valueOf(dayOfMonth) + " " + getString(monthOfYear + 1)
                    + " " + String.valueOf(year));
        }
    };
}