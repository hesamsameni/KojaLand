package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class secondquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondquestion);





        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.steak);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.seafood);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.pasta);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.hot);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.kabab);
        tv6.setTypeface(tf);
        TextView tv7 = (TextView) findViewById(R.id.q2);
        tv7.setTypeface(tf);
    }

        /////__________HesamSameni_________///////
        //** Goto Nextactivity by animation *//
    public void onClickSteak(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");

        Intent i = new Intent(getApplicationContext(), thirdquestion.class);
        i.putExtra("food" , "steak" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickSeaFood(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");

        Intent i = new Intent(getApplicationContext(), thirdquestion.class);
        i.putExtra("food" , "seafood" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickPasta(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");

        Intent i = new Intent(getApplicationContext(), thirdquestion.class);
        i.putExtra("food" , "pasta" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickHot(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");

        Intent i = new Intent(getApplicationContext(), thirdquestion.class);
        i.putExtra("food" , "hot" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickKabab(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");

        Intent i = new Intent(getApplicationContext(), thirdquestion.class);
        i.putExtra("food" , "kabab" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    }
