package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class fourthquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourthquestion);



        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.q4);
        tv2.setTypeface(tf);
        TextView tv3 = (TextView) findViewById(R.id.apartment);
        tv3.setTypeface(tf);
        TextView tv4 = (TextView) findViewById(R.id.vila);
        tv4.setTypeface(tf);
        TextView tv5 = (TextView) findViewById(R.id.sea);
        tv5.setTypeface(tf);
        TextView tv6 = (TextView) findViewById(R.id.mountain);
        tv6.setTypeface(tf);
        TextView tv7 = (TextView) findViewById(R.id.jungle);
        tv7.setTypeface(tf);
    }

    /////__________HesamSameni_________///////
    //** Goto Nextactivity by animation *//
    public void onClickApartment(View view) {

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


        Intent i = new Intent(getApplicationContext(), fifthquestion.class);
        i.putExtra("house" , "apartment" );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickVila(View view) {

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

        Intent i = new Intent(getApplicationContext(), fifthquestion.class);
        i.putExtra("house" , "vila" );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickMountain(View view) {

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

        Intent i = new Intent(getApplicationContext(), fifthquestion.class);
        i.putExtra("house" , "mountain" );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickSea(View view) {

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

        Intent i = new Intent(getApplicationContext(), fifthquestion.class);
        i.putExtra("house" , "sea" );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

    public void onClickJungle(View view) {

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

        Intent i = new Intent(getApplicationContext(), fifthquestion.class);
        i.putExtra("house" , "jungle" );
        i.putExtra("gotowork" , gotowork );
        i.putExtra("gender" , gender);
        i.putExtra("hate" , hate);
        i.putExtra("food" , food);
        startActivity(i);
        overridePendingTransition(R.animator.activity_push_up_in, R.animator.activity_push_up_out);}

}
