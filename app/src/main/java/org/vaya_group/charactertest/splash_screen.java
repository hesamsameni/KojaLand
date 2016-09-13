package org.vaya_group.charactertest;

import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import java.lang.reflect.Type;
import java.util.Locale;


public class splash_screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //___ Set Timer For Splash Screen to be On The Screen (3000 means 3 seconds____///
        Thread myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    Intent startMainScreen = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startMainScreen);
                    overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
        //_________HesamSameni_______//////


        setContentView(R.layout.splashscreen);
        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");
        TextView tv2 = (TextView) findViewById(R.id.text2);
        tv2.setTypeface(tf);
        /////__________HesamSameni_________///////
    }







}



