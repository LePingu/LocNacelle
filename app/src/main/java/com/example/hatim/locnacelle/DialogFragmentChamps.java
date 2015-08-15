package com.example.hatim.locnacelle;


import android.support.v4.app.DialogFragment;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by rothavykhin on 06/07/15.
 */
public class DialogFragmentChamps extends DialogFragment {

    private Button ok;
    private TextView contentDialog;
    Typeface type;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_dialog_fragment_champs, container, false);
        getDialog().setTitle(R.string.titreDialog);
        return rootView;
    }
}