package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class sixthquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sixthquestion);


        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.sun);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.rain);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.cloudy);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.snow);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.q6);
        tv6.setTypeface(tf);}

    /////__________HesamSameni_________///////

    //** Goto Nextactivity by animation *//
    public void onClickSun(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");
        String gotowork ;
        Intent d = getIntent();
        gotowork =d.getStringExtra("gotowork");
        String house ;
        Intent e = getIntent();
        house =e.getStringExtra("house");
        String star ;
        Intent f = getIntent();
        star =f.getStringExtra("star");

        Intent i = new Intent(getApplicationContext(), seventhquestion.class);
        i.putExtra("weather" , "sun" );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickRain(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");
        String gotowork ;
        Intent d = getIntent();
        gotowork =d.getStringExtra("gotowork");
        String house ;
        Intent e = getIntent();
        house =e.getStringExtra("house");
        String star ;
        Intent f = getIntent();
        star =f.getStringExtra("star");

        Intent i = new Intent(getApplicationContext(), seventhquestion.class);
        i.putExtra("weather" , "rain" );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickSnow(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");
        String gotowork ;
        Intent d = getIntent();
        gotowork =d.getStringExtra("gotowork");
        String house ;
        Intent e = getIntent();
        house =e.getStringExtra("house");
        String star ;
        Intent f = getIntent();
        star =f.getStringExtra("star");

        Intent i = new Intent(getApplicationContext(), seventhquestion.class);
        i.putExtra("weather" , "snow" );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickCloudy(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");
        String gotowork ;
        Intent d = getIntent();
        gotowork =d.getStringExtra("gotowork");
        String house ;
        Intent e = getIntent();
        house =e.getStringExtra("house");
        String star ;
        Intent f = getIntent();
        star =f.getStringExtra("star");

        Intent i = new Intent(getApplicationContext(), seventhquestion.class);
        i.putExtra("weather" , "cloudy" );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}



}

