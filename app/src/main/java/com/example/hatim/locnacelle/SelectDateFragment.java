package com.example.hatim.locnacelle;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;

/**
 * Created by rothavykhin on 26/08/15.
 */
public class SelectDateFragment extends DialogFragment  {


    DatePickerDialog.OnDateSetListener ondateSet;
    private int year, month, day;

    public SelectDateFragment() {}

    public void setCallBack(DatePickerDialog.OnDateSetListener ondate) {
        ondateSet = ondate;
    }

    @SuppressLint("NewApi")
    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        year = args.getInt("year");
        month = args.getInt("month");
        day = args.getInt("day");
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return new DatePickerDialog(getActivity(), ondateSet, year, month, day);
    }
}
