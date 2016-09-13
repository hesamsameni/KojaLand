package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class thirdquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thirdquestion);



        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.q3);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.metro);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.taxi);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.foot);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.bicycle);
        tv6.setTypeface(tf);
    }


        /////__________HesamSameni_________///////

        //** Goto Nextactivity by animation *//
    public void onClickMetro(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");

        Intent i = new Intent(getApplicationContext(), fourthquestion.class);
        i.putExtra("gotowork" , "metro" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickTaxi(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");

        Intent i = new Intent(getApplicationContext(), fourthquestion.class);
        i.putExtra("gotowork" , "taxi" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickFoot(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");

        Intent i = new Intent(getApplicationContext(), fourthquestion.class);
        i.putExtra("gotowork" , "foot" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickBicyle(View view) {

        String gender ;
        Intent a = getIntent();
        gender =a.getStringExtra("gender");
        String hate ;
        Intent b = getIntent();
        hate =b.getStringExtra("hate");
        String food ;
        Intent c = getIntent();
        food =c.getStringExtra("food");

        Intent i = new Intent(getApplicationContext(), fourthquestion.class);
        i.putExtra("gotowork" , "bicycle" );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}


}
