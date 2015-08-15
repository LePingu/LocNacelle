package com.example.hatim.locnacelle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;




public class SubscribeActivity extends Activity {

    private EditText nom;
    private EditText surname;
    private EditText company;
    private EditText codePostal;
    private EditText mdp;
    private EditText confirmmdp;
    private EditText mail;

    EditText[] myList;

    private Button nextBtn;
    Typeface type;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        nom = (EditText) findViewById(R.id.editName);
        surname = (EditText) findViewById(R.id.editSurname);
        company = (EditText) findViewById(R.id.editCompany);
        codePostal = (EditText) findViewById(R.id.CountryCode);
        mdp = (EditText) findViewById(R.id.editPassword);
        confirmmdp = (EditText) findViewById(R.id.editConfirm);
        mail = (EditText) findViewById(R.id.editMail);
        nextBtn = (Button) findViewById(R.id.btnSubs);
        myList = new EditText[]{nom,surname,company,codePostal,mdp,confirmmdp,mail};

        type = Typeface.createFromAsset(getAssets(), "bebasneue.ttf");

        nextBtn.setTypeface(type);
        nom.setTypeface(type);
        surname.setTypeface(type);
        company.setTypeface(type);
        codePostal.setTypeface(type);
        mdp.setTypeface(type);
        confirmmdp.setTypeface(type);
        mail.setTypeface(type);

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


    public void onClick(View v)
    { // Perform action on click
        if (!validate(myList)){
            startActivity(new Intent(getApplicationContext(), MineActivity.class));
            finish();
        }
    }
}
