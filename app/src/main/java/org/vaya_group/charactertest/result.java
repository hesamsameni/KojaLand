package org.vaya_group.charactertest;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.json.JSONException;
import org.json.JSONObject;

import cz.msebera.android.httpclient.Header;

public class result extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        Button btnGet = (Button)findViewById(R.id.btnGet);
        btnGet.setTypeface(tf);
        btnGet.setOnClickListener(this);

    }

    @Override
    public void onClick(final View view) {


        ////
        final String gender;
        final Intent a = getIntent();
        gender = a.getStringExtra("gender");
        final String anger;
        Intent b = getIntent();
        anger = b.getStringExtra("hate");
        final String food;
        Intent c = getIntent();
        food = c.getStringExtra("food");
        final String gettowork;
        Intent d = getIntent();
        gettowork = d.getStringExtra("gotowork");
        final String settelment;
        Intent ee = getIntent();
        settelment = ee.getStringExtra("house");
        final String actor;
        Intent f = getIntent();
        actor = f.getStringExtra("star");
        final String weather;
        Intent g = getIntent();
        weather = g.getStringExtra("weather");
        final String weekend;
        Intent h = getIntent();
        weekend = h.getStringExtra("weekend");
        final String color;
        final Intent j = getIntent();
        color = j.getStringExtra("color");
        final String age;
        Intent i10 = getIntent();
        age = i10.getStringExtra("age");
        /////
        view.setEnabled(false);


        /////This is for sending GET request to internet and getting answers ////////
        AsyncHttpClient client = new AsyncHttpClient();
        client.get("http://fun.zoraq.com/games/whichcity/app/check-form.php?gender="+gender+"&anger="+anger+"&food="+food+"&gettowork="+gettowork+"&settelment="+settelment+"&actor="+actor+"&weather="+weather+"&weekend="+weekend+"&color="+color+"&age="+age,new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] response) {
                if (response != null){

                    try {
                        JSONObject jsonObject = new JSONObject(new String(response));

                        //get CityName only//
                        String cityName = jsonObject.getString("city");
                        //HESAMSAMENIIIII//

                        Intent i = new Intent(getApplicationContext(), finalpage.class);
                        i.putExtra("cityName" , cityName );
                        startActivity(i);
                    }



                    catch (JSONException e) {
                        e.printStackTrace();
                    }



                }
                view.setEnabled(true);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                view.setEnabled(true);

            }
        });

    }
}