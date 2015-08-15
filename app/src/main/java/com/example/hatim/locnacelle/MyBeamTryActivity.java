package com.example.hatim.locnacelle;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MyBeamTryActivity extends Activity {


    Toolbar myToolBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_beam_try);

        myToolBar = (Toolbar) findViewById(R.id.toolbar);

        myToolBar.setLogo(R.drawable.justlogobeams);


    }
}
