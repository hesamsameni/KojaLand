package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class fifthquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifthquestion);


        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.q5);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.georg);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.al);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.monicha);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.merlin);
        tv6.setTypeface(tf);
        TextView tv7 = (TextView) findViewById(R.id.jim);
        tv7.setTypeface(tf);
        TextView tv8 = (TextView) findViewById(R.id.angelina);
        tv8.setTypeface(tf);
    }

    /////__________HesamSameni_________///////
    //** Goto Nextactivity by animation *//
    public void onClickGeorg(View view) {

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

        Intent i = new Intent(getApplicationContext(), sixthquestion.class);
        i.putExtra("star" , "george" );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickAl(View view) {

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

        Intent i = new Intent(getApplicationContext(), sixthquestion.class);
        i.putExtra("star" , "al" );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickMonicha(View view) {

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

        Intent i = new Intent(getApplicationContext(), sixthquestion.class);
        i.putExtra("star" , "monicha" );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickMerlin(View view) {

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

        Intent i = new Intent(getApplicationContext(), sixthquestion.class);
        i.putExtra("star" , "merlin" );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickJim(View view) {

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

        Intent i = new Intent(getApplicationContext(), sixthquestion.class);
        i.putExtra("star" , "jim" );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickAngelina(View view) {

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

        Intent i = new Intent(getApplicationContext(), sixthquestion.class);
        i.putExtra("star" , "angelina" );
        i.putExtra("house" , house );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

}
