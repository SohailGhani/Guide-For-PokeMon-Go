package com.teknords.guideforpokemon;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnPlyr, btnCatching, btnTraining, btnStp, btnGyms, btnbtng;
    private Cursor cursor;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-1261846064716355/6859850624").build();
        mAdView.loadAd(adRequest);

        btnPlyr = (Button) findViewById(R.id.btnPlyr);
        btnCatching = (Button) findViewById(R.id.btnCatching);
        btnTraining = (Button) findViewById(R.id.btnTraining);
        btnStp = (Button) findViewById(R.id.btnStp);
        btnGyms = (Button) findViewById(R.id.btnGyms);
        btnbtng = (Button) findViewById(R.id.btnbtng);


        btnPlyr.setOnClickListener(this);
        btnCatching.setOnClickListener(this);
        btnTraining.setOnClickListener(this);
        btnStp.setOnClickListener(this);
        btnGyms.setOnClickListener(this);
        btnbtng.setOnClickListener(this);

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.btnPlyr:

                Intent g = new Intent(MainActivity.this, TextActivity.class);
                int gn = 0;
                g.putExtra("txtToShow", gn);
                startActivity(g);

                break;

            case R.id.btnCatching:

                Intent intenta = new Intent(MainActivity.this, TextActivity.class);
                int a = 1;
                intenta.putExtra("txtToShow", a);
                startActivity(intenta);
                break;

            case R.id.btnTraining:

                Intent intentb = new Intent(MainActivity.this, TextActivity.class);
                int b = 2;
                intentb.putExtra("txtToShow", b);
                startActivity(intentb);


                break;

            case R.id.btnStp:


                Intent intentc = new Intent(MainActivity.this, TextActivity.class);
                int c = 3;
                intentc.putExtra("txtToShow", c);
                startActivity(intentc);
                break;

            case R.id.btnGyms:
                Intent intentd = new Intent(MainActivity.this, TextActivity.class);
                int d = 4;
                intentd.putExtra("txtToShow", d);
                startActivity(intentd);
                break;
            case R.id.btnbtng:
                Intent intente = new Intent(MainActivity.this, TextActivity.class);
                int e = 5;
                intente.putExtra("txtToShow", e);
                startActivity(intente);
                break;


        }


    }
    @Override
    public void onBackPressed() {


            this.finish();
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

    /*int pid = android.os.Process.myPid();=====> use this if you want to kill your activity. But its not a good one to do.
    android.os.Process.killProcess(pid);*/

    }


    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.teknords.guideforpokemon/http/host/path")
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
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.teknords.guideforpokemon/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}
