package com.example.hatim.locnacelle;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class TestSplash extends Activity {

    TextView prenom;
    TextView nom;
    TextView login;
    TextView date;

    Typeface type;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_splash);

        prenom = (TextView)findViewById(R.id.textView);
        nom = (TextView)findViewById(R.id.textView2);
        login = (TextView)findViewById(R.id.textView3);
        date = (TextView)findViewById(R.id.textView4);


        type = Typeface.createFromAsset(getAssets(), "bebasneue.ttf");

        prenom.setTypeface(type);
        nom.setTypeface(type);
        login.setTypeface(type);
        date.setTypeface(type);


    }
}
