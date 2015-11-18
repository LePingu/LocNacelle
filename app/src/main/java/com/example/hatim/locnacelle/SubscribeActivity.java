package com.example.hatim.locnacelle;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class SubscribeActivity extends Activity {

    private EditText nom;
    private EditText surname;
    private EditText company;
    private EditText codePostal;
    private EditText mdp;
    private EditText confirmmdp;
    private EditText mail;
    TextView cgu;
    CheckBox check;

    EditText[] myList;

    private Button nextBtn;
    Context con;
    Typeface type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);


        con = this;

        nom = (EditText) findViewById(R.id.editName);
        surname = (EditText) findViewById(R.id.editSurname);
        company = (EditText) findViewById(R.id.editCompany);
        codePostal = (EditText) findViewById(R.id.CountryCode);
        mdp = (EditText) findViewById(R.id.editPassword);
        confirmmdp = (EditText) findViewById(R.id.editConfirm);
        mail = (EditText) findViewById(R.id.editMail);
        nextBtn = (Button) findViewById(R.id.btnSubs);
        myList = new EditText[]{nom,surname,company,codePostal,mdp,confirmmdp,mail};
        check = (CheckBox)findViewById(R.id.checkBox);
        cgu = (TextView)findViewById(R.id.CGU);

        type = Typeface.createFromAsset(getAssets(), "bebasneue.ttf");

        nextBtn.setTypeface(type);
        nom.setTypeface(type);
        surname.setTypeface(type);
        company.setTypeface(type);
        codePostal.setTypeface(type);
        mdp.setTypeface(type);
        confirmmdp.setTypeface(type);
        mail.setTypeface(type);
        cgu.setTypeface(type);

        cgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog alertDialog2 = new AlertDialog.Builder(con).create(); //Read Update
                alertDialog2.setTitle("CGU");
                alertDialog2.setMessage("LoremIpsum");

                alertDialog2.setButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        alertDialog2.cancel();
                    }
                });
            }});


        nextBtn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!validate(myList)){
                            if (check.isChecked()){


                                final AlertDialog alertDialog1 = new AlertDialog.Builder(con).create(); //Read Update
                                alertDialog1.setTitle("OUPS!");
                                alertDialog1.setMessage("Vous devez accepter les condition pour pouvoir vous inscrire");

                                alertDialog1.setButton("OK", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int which) {
                                        alertDialog1.cancel();
                                    }
                                });
                            }
                            else{
                                startActivity(new Intent(getApplicationContext(), MineActivity.class));
                                finish();
                            }

                        }
                    }
                });



    }

    private boolean validate(EditText[] fields)
    {
        for(int i=0; i<fields.length; i++){
            EditText currentField=fields[i];
            if(currentField.getText().toString().length()<=0){
                return false;
            }
        }
        return true;
    }
}