package com.example.hatim.locnacelle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class AccueilActivity extends Activity {

    Button ConnectButton;
    Button SubsButton;
    Button ForgotButton;
    ImageView myview;
    Drawable thepeople;
    Typeface type;
    Drawable myDraw;

    EditText[] myList;

    EditText mail;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        type = Typeface.createFromAsset(getAssets(),"bebasneue.ttf");
        Log.w("helloMoi","Je suis dans le Main");

        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;

        //myPeople = BitmapFactory.decodeResource(getResources(), R.drawable.people);
        //myPeople = getResizedBitmap(myPeople, width / 9, height / 9);

        myDraw = getResources().getDrawable(R.drawable.people);
        //thepeople = new ScaleDrawable(myDraw,0,width/9, height/9);
        //thepeople.setBounds(0, 0, width / 9, height / 9);

        Bitmap bitmap = ((BitmapDrawable) myDraw).getBitmap();
        thepeople = new BitmapDrawable(getResources(),Bitmap.createScaledBitmap(bitmap,width/10, height/14,true));

        Drawable arrowConnect = getResources().getDrawable(R.drawable.connexionarrow);


        ConnectButton = (Button) findViewById(R.id.connectButton);
        //ConnectButton.setCompoundDrawables(null, null, arrowConnect, null);
        ViewGroup.LayoutParams params = ConnectButton.getLayoutParams();
        params.height = height/8;
        params.width = width;
        ConnectButton.setTypeface(type);
        ConnectButton.setTextSize(height/55);

        myview = (ImageView) findViewById(R.id.surfaceView);
        //myview.setBackground(R.drawable.locnacellelogo);

        SubsButton = (Button) findViewById(R.id.Subsbutton);
        ViewGroup.LayoutParams otherparams = SubsButton.getLayoutParams();
        otherparams.height = height/8;
        otherparams.width = width;
        SubsButton.setTypeface(type);
        SubsButton.setTextSize(height/55);

        ForgotButton = (Button) findViewById(R.id.ForgotPass);
        ViewGroup.LayoutParams otherparams1 = ForgotButton.getLayoutParams();
        otherparams1.height = height/9;
        otherparams1.width = width/2;
        ForgotButton.setTypeface(type);

        mail = (EditText) findViewById(R.id.editText2);
        mail.setTypeface(type);
        mail.setTextSize(height / 75);

        mail.setCompoundDrawablesWithIntrinsicBounds(R.drawable.people, 0, 0, 0);


        ViewGroup.LayoutParams paramsmail = mail.getLayoutParams();
        paramsmail.height = height/9;
        paramsmail.width = width;

        password = (EditText) findViewById(R.id.editText);
        password.setTypeface(type);
        password.setTextSize(height / 75);

        password.setCompoundDrawablesWithIntrinsicBounds(R.drawable.lock, 0, 0, 0);

        ViewGroup.LayoutParams paramspassword = password.getLayoutParams();
        paramspassword.height = height/9;
        paramspassword.width = width;

        myList = new EditText[]{mail,password};


        SubsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SubscribeActivity.class));
                finish();
            }
        });

        ConnectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!validate(myList)){}
                else{
                    startActivity(new Intent(getApplicationContext(), MineActivity.class));
                    finish();
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
