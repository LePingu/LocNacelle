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
 * Created by rothavykhin on 29/06/15.
 */
public class DialogFragmentOptions extends DialogFragment {

    private Button ok;
    private TextView contentDialog;
    Typeface type;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.dialog_fragment_options, container, false);
        getDialog().setTitle(R.string.titreDialog);

        type = Typeface.createFromAsset(getActivity().getAssets(),"bebasneue.ttf");

        ok = (Button) rootView.findViewById(R.id.dismiss);
        ok.setTypeface(type);

        contentDialog = (TextView) rootView.findViewById(R.id.title);
        contentDialog.setTypeface(type);

        ok.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                dismiss();
            }
        });
        return rootView;
    }
}
