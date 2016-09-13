package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class eighthquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eighthquestion);



        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");

        TextView tv = (TextView) findViewById(R.id.q8);
        tv.setTypeface(tf);
        TextView tv2 = (TextView) findViewById(R.id.green);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.white);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.black);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.blue);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.yellow);
        tv6.setTypeface(tf);
        TextView tv7 = (TextView) findViewById(R.id.red);
        tv7.setTypeface(tf);}

    /////__________HesamSameni_________///////

    //** Goto Nextactivity by animation *//
    public void onClickGreen(View view) {

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
        String weekend ;
        Intent h = getIntent();
        weekend =h.getStringExtra("weekend");

        Intent i = new Intent(getApplicationContext(), ninethquestion.class);
        i.putExtra("color" , "green" );
        i.putExtra("weekend" , weekend );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickWhite(View view) {

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
        String weekend ;
        Intent h = getIntent();
        weekend =h.getStringExtra("weekend");

        Intent i = new Intent(getApplicationContext(), ninethquestion.class);
        i.putExtra("color" , "white" );
        i.putExtra("weekend" , weekend );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickBlack(View view) {

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
        String weekend ;
        Intent h = getIntent();
        weekend =h.getStringExtra("weekend");

        Intent i = new Intent(getApplicationContext(), ninethquestion.class);
        i.putExtra("color" , "black" );
        i.putExtra("weekend" , weekend );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickBlue(View view) {

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
        String weekend ;
        Intent h = getIntent();
        weekend =h.getStringExtra("weekend");

        Intent i = new Intent(getApplicationContext(), ninethquestion.class);
        i.putExtra("color" , "blue" );
        i.putExtra("weekend" , weekend );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickYellow(View view) {

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
        String weekend ;
        Intent h = getIntent();
        weekend =h.getStringExtra("weekend");

        Intent i = new Intent(getApplicationContext(), ninethquestion.class);
        i.putExtra("color" , "yellow" );
        i.putExtra("weekend" , weekend );
        i.putExtra("weather" , weather );
        i.putExtra("star" , star );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickRed(View view) {

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
        String weekend ;
        Intent h = getIntent();
        weekend =h.getStringExtra("weekend");

        Intent i = new Intent(getApplicationContext(), ninethquestion.class);
        i.putExtra("color" , "red" );
        i.putExtra("weekend" , weekend );
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

