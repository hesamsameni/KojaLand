package org.vaya_group.charactertest;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class ninethquestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ninethquestion);


        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.q9);
        tv2.setTypeface(tf);}


    /////__________HesamSameni_________///////



    //** Goto Nextactivity by animation *//
    public void onClickYek(View view) {

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
        String color ;
        Intent j = getIntent();
        color =j.getStringExtra("color");

        Intent i = new Intent(getApplicationContext(), result.class);
        i.putExtra("age" , "under20" );
        i.putExtra("color" , color );
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

    public void onClickDo(View view) {

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
        String color ;
        Intent j = getIntent();
        color =j.getStringExtra("color");

        Intent i = new Intent(getApplicationContext(), result.class);
        i.putExtra("age" , "20-30" );
        i.putExtra("color" , color );
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

    public void onClickSe(View view) {

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
        String color ;
        Intent j = getIntent();
        color =j.getStringExtra("color");

        Intent i = new Intent(getApplicationContext(), result.class);
        i.putExtra("age" , "30-40" );
        i.putExtra("color" , color );
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

    public void onClickChahar(View view) {

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
        String color ;
        Intent j = getIntent();
        color =j.getStringExtra("color");

        Intent i = new Intent(getApplicationContext(), result.class);
        i.putExtra("age" , "40-50" );
        i.putExtra("color" , color );
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

    public void onClickPanj(View view) {

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
        String color ;
        Intent j = getIntent();
        color =j.getStringExtra("color");

        Intent i = new Intent(getApplicationContext(), result.class);
        i.putExtra("age" , "over50" );
        i.putExtra("color" , color );
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

