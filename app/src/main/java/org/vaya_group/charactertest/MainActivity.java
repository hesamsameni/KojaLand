package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.manOrwoman);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.man1);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.woman1);
        tv4.setTypeface(tf);
        /////__________HesamSameni_________///////
    }

        //** Goto Nestactivity by animation *//
    public void onClickMan(View view) {
        Intent i = new Intent(getApplicationContext(), firstquestion.class);
        i.putExtra("gender" , "male" );

        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickWoman(View view) {
        Intent i = new Intent(getApplicationContext(), firstquestion.class);
        i.putExtra("gender" , "female" );

        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}






}
