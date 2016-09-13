package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class seventhquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seventhquestion);



        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.outdoor);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.cafe);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.gatherin);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.culture);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.q7);
        tv6.setTypeface(tf);}

    /////__________HesamSameni_________///////

    //** Goto Nextactivity by animation *//
    public void onClickOutdoor(View view) {

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
        String weather ;
        Intent g = getIntent();
        weather =g.getStringExtra("weather");

        Intent i = new Intent(getApplicationContext(), eighthquestion.class);
        i.putExtra("weekend" , "outdoor" );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickCafe(View view) {

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
        String weather ;
        Intent g = getIntent();
        weather =g.getStringExtra("weather");

        Intent i = new Intent(getApplicationContext(), eighthquestion.class);
        i.putExtra("weekend" , "cafe" );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickGathering(View view) {

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
        String weather ;
        Intent g = getIntent();
        weather =g.getStringExtra("weather");

        Intent i = new Intent(getApplicationContext(), eighthquestion.class);
        i.putExtra("weekend" , "gathering" );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickCulture(View view) {

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
        String weather ;
        Intent g = getIntent();
        weather =g.getStringExtra("weather");

        Intent i = new Intent(getApplicationContext(), eighthquestion.class);
        i.putExtra("weekend" , "culture" );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}



}

