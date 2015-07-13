package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        Button btnApres = (Button) findViewById(R.id.btnApres);
        Button btnShakeJump = (Button) findViewById(R.id.btnJumps);
        Button btnDiffSel = (Button) findViewById(R.id.btnDifficulty);
        Button btnShakeRail = (Button) findViewById(R.id.btnRails);
        Button btnSlope = (Button) findViewById(R.id.btnSlopeStyle);
        
        
//        btnJump.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// open jump activity when jump is selected
//				Intent intent = new Intent(context, Jump.class);
//				startActivity(intent);
//			}
//		});
//
//        btnRail.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// open rail activity when rail is selected
//				Intent intentRail = new Intent(context, Rail.class);
//				startActivity(intentRail);
//			}
//		});
//
//        btnSlopeStyle.setOnClickListener(new View.OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// open slope activity when clicked
//				Intent intentSlope = new Intent(context, SlopeSelect.class);
//				startActivity(intentSlope);
//			}
//		});
        
        btnApres.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// open slope activity when clicked
				Intent intentSlope = new Intent(context, Apres.class);
				startActivity(intentSlope);
			}
		});

        btnShakeJump.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                Intent intentSlope = new Intent(context, jumpShake.class);
                startActivity(intentSlope);
            }
        });

        btnDiffSel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                Intent intentSlope = new Intent(context, Difficulty_Selection.class);
                startActivity(intentSlope);
            }
        });

        btnShakeRail.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                Intent intentSlope = new Intent(context, railShake.class);
                startActivity(intentSlope);
            }
        });

        btnSlope.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open slope activity when clicked
                Intent intentSlope = new Intent(context, shakeSlope.class);
                startActivity(intentSlope);
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
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
