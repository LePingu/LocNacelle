package com.example.hatim.locnacelle;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MineActivity extends FragmentActivity implements FragmentInsideDrawer.FragmentDrawerListener {

    private Toolbar myToolBar;
    private FragmentInsideDrawer fragDrawer;
    ActionBarDrawerToggle thisToggle;
    DrawerLayout myDrawer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.mine_layout);

        myToolBar = (Toolbar) findViewById(R.id.toolbar);
        int x = myToolBar.getWidth();
        int y = myToolBar.getHeight();
        myToolBar.setLogo(R.drawable.logosmall);

        fragDrawer = (FragmentInsideDrawer)getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        fragDrawer.setUp(R.id.fragment_navigation_drawer,(DrawerLayout)findViewById(R.id.drawer_layout), myToolBar);
        fragDrawer.setDrawerListener(this);

        displayView(7);

        /*myToolBar.setNavigationIcon(getResources().getDrawable(R.drawable.abc_ic_ab_back_mtrl_am_alpha));
        myToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //
            }
        });*/
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                fragment = new Etape2();
                title = "admnistration";
                break;
            case 1:
                fragment = new AssistanceFragment();
                title = "assai";
                break;
            case 2:
                fragment = new FormationFragment();
                title = "Etape";
                break;
            case 3:
                fragment = new NegativeLayout();
                title = "formation";
                break;
            case 4:
                fragment = new AssaiFragment();
                title = "assai";
                break;
            case 5:
                fragment = new AdministrationFragment();
                title = "admnistration";
                break;
            case 6:
                startActivity(new Intent(getApplicationContext(), AccueilActivity.class));
                finish();
                title = "admnistration";
                break;
            case 7:
                fragment = new AssaiFragment();
                title = "assai";
                break;
            default:
                break;
        }

        if (fragment != null) {
            android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
            android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.frame_container, fragment);
            fragmentTransaction.commit();
        }
    }


}

