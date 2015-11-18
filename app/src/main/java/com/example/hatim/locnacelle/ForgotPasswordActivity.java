package com.example.hatim.locnacelle;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Type;


public class ForgotPasswordActivity extends Activity {

    EditText mail;
    EditText ConfirmMail;
    Button done;

    Typeface type;

    Context con;
    EditText[] myList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        con = this;

        type = Typeface.createFromAsset(getAssets(), "bebasneue.ttf");

        final Context con = this;

        mail = (EditText)findViewById(R.id.editTextMail);
        ConfirmMail = (EditText)findViewById(R.id.editTextConfirm);
        done = (Button)findViewById(R.id.retrieveButton);

        mail.setTypeface(type);
        mail.setTextSize(height / 75);

        ViewGroup.LayoutParams paramsmail = mail.getLayoutParams();
        paramsmail.height = height/9;
        paramsmail.width = width;

        ConfirmMail.setTypeface(type);
        ConfirmMail.setTextSize(height / 75);

        ViewGroup.LayoutParams paramsmail1 = ConfirmMail.getLayoutParams();
        paramsmail1.height = height/9;
        paramsmail1.width = width;


        ViewGroup.LayoutParams params = done.getLayoutParams();
        params.height = height/8;
        params.width = width;
        done.setTypeface(type);
        done.setTextSize(height/55);

        myList = new EditText[]{mail,ConfirmMail};

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!mail.getText().toString().equals(ConfirmMail.getText().toString())){
                    final AlertDialog alertDialog = new AlertDialog.Builder(con).create(); //Read Update
                    alertDialog.setTitle("Oup!");
                    alertDialog.setMessage("Les adresses ne correspondent pas");

                    alertDialog.setButton("Continue", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertDialog.cancel();
                        }
                    });

                    alertDialog.show();
                }
                if (!validate(myList) && mail.getText().toString().equals(ConfirmMail.getText().toString())){

                    final AlertDialog alertDialog1 = new AlertDialog.Builder(con).create(); //Read Update
                    alertDialog1.setTitle("Votre Email est parti!");
                    alertDialog1.setMessage("Un Email a bien été pour la récupération de votre mot de passe");

                    alertDialog1.setButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            alertDialog1.cancel();
                            startActivity(new Intent(getApplicationContext(), AccueilActivity.class));
                            finish();
                        }
                    });
                }
            }
        });




    }


    private boolean validate(EditText[] fields){
        for(int i=0; i<fields.length; i++){
            EditText currentField=fields[i];
            if(currentField.getText().toString().length()<=0){
                return false;
            }
        }
        return true;
    }
}
