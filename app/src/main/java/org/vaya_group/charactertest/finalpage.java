package org.vaya_group.charactertest;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.media.Image;
import android.media.ImageReader;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.InputStream;
import java.net.URL;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpGet;
import cz.msebera.android.httpclient.entity.BufferedHttpEntity;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;



public class finalpage extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalpage);

        Button btnGet = (Button) findViewById(R.id.getDescription);

        ///___Used to automatically click the button ____/////
        btnGet.performClick();
        ///_______HesamSameni_________////



        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onClick(final View v) {


        ////___ This is the way to set a custom font to several TextViews ____/////
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/IRANSansMobile.ttf");


        TextView tv2 = (TextView) findViewById(R.id.description);
        tv2.setTypeface(tf);
        final TextView tv4 = (TextView) findViewById(R.id.tagLine);
        tv4.setTypeface(tf);
        Button btnGet = (Button) findViewById(R.id.getDescription);
        btnGet.setTypeface(tf);
        final ImageView iv = (ImageView)findViewById(R.id.cityImagee);
        //this line makes the button invisible after clicking////
        btnGet.setVisibility(View.GONE);
        ///_______HESAMSAMENI_____///////////







        final String cityName;
        Intent a = getIntent();
        cityName = a.getStringExtra("cityName");

        v.setEnabled(false);




        final AsyncHttpClient clientfinal = new AsyncHttpClient();
        clientfinal.get("http://fun.zoraq.com/games/whichcity/app/city-description.php?city=" + cityName, new AsyncHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                if (responseBody != null) {
                    TextView description = (TextView) findViewById(R.id.description);
                    try {
                        JSONObject jsonObject2 = new JSONObject(new String(responseBody));
                        String describe = jsonObject2.getString("description");
                        String persianName = jsonObject2.getString("persian_name");
                        String tagLine = jsonObject2.getString("tagline");
                        String imageUrl = jsonObject2.getString("image");
                        tv4.setText(tagLine);
                        description.setText(describe);


                        ///___ displaying image from url using PICASSO____////
                        Picasso.with(getApplicationContext()).load(imageUrl).into(iv);
                        ////_____HesamSameni____/////






                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                }
                v.setEnabled(true);

            }

            @Override
            public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                v.setEnabled(true);

            }
        });

    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "finalpage Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://org.vaya_group.charactertest/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "finalpage Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://org.vaya_group.charactertest/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}





