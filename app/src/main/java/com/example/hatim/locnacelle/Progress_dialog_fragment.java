package com.example.hatim.locnacelle;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.app.ProgressDialog;
import android.graphics.Typeface;
import android.os.Bundle;

/**
 * Created by rothavykhin on 25/08/15.
 */
public class Progress_dialog_fragment extends DialogFragment {

    Typeface type;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        type = Typeface.createFromAsset(getActivity().getAssets(),"bebasneue.ttf");

        super.onCreate(savedInstanceState);
        setCancelable(false);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState)
    {
        ProgressDialog dialog = new ProgressDialog(getActivity(), getTheme());
        dialog.setMessage(getString(R.string.message_progress_dialog));
        dialog.setIndeterminate(false);
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        return dialog;





    }
}