package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class firstquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstquestion);







        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.kasifi);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.traffic);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.noise);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.earlyclose);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.q1);
        tv6.setTypeface(tf);}

        /////__________HesamSameni_________///////

        //** Goto Nextactivity by animation *//
    public void onClickKasifi(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");

        Intent i = new Intent(getApplicationContext(), secondquestion.class);
        i.putExtra("hate" , "kasifi" );
        i.putExtra("gender" , gender);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickTraffic(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");

        Intent i = new Intent(getApplicationContext(), secondquestion.class);
        i.putExtra("hate" , "trafic" );
        i.putExtra("gender" , gender);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickNoise(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");

        Intent i = new Intent(getApplicationContext(), secondquestion.class);
        i.putExtra("hate" , "noise" );
        i.putExtra("gender" , gender);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickEarlyclose(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");

        Intent i = new Intent(getApplicationContext(), secondquestion.class);
        i.putExtra("hate" , "earlyclose" );
        i.putExtra("gender" , gender);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}



    }

