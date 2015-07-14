package com.kooknluke.skidice;

import android.graphics.PorterDuff;
import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        final Context context = this;

//        Button btnJump = (Button) findViewById(R.id.btnJumps);
//        Button btnRail = (Button) findViewById(R.id.btnRails);
//        Button btnSlopeStyle = (Button) findViewById(R.id.btnSlope);
        final Button btnApres = (Button) findViewById(R.id.btnApres);
        final Button btnShakeJump = (Button) findViewById(R.id.btnJumps);
        final Button btnDiffSel = (Button) findViewById(R.id.btnDifficulty);
        final Button btnShakeRail = (Button) findViewById(R.id.btnRails);
        final Button btnSlope = (Button) findViewById(R.id.btnSlopeStyle);

        btnApres.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                buttonEffect(btnApres);
                Intent intentSlope = new Intent(context, Apres.class);
                startActivity(intentSlope);
            }
        });

        btnShakeJump.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                buttonEffect(btnShakeJump);
                Intent intentSlope = new Intent(context, jumpShake.class);
                startActivity(intentSlope);
            }
        });

        btnDiffSel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                buttonEffect(btnDiffSel);
                Intent intentSlope = new Intent(context, Difficulty_Selection.class);
                startActivity(intentSlope);
            }
        });

        btnShakeRail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                buttonEffect(btnShakeRail);
                Intent intentSlope = new Intent(context, railShake.class);
                startActivity(intentSlope);
            }
        });

        btnSlope.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                buttonEffect(btnSlope);
                Intent intentSlope = new Intent(context, shakeSlope.class);
                startActivity(intentSlope);
            }
        });

    }

    public static void buttonEffect(View btn){
        btn.setOnTouchListener(new View.OnTouchListener() {

            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        v.getBackground().setColorFilter(0xeee0000, PorterDuff.Mode.SRC_ATOP);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        v.getBackground().clearColorFilter();
                        v.invalidate();
                        break;
                    }
                }
                return false;
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }
}
