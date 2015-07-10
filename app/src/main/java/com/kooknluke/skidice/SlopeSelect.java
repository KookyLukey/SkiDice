package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SlopeSelect extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slope_select);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();

		Button btnSlopeEasy = (Button) findViewById(R.id.btnSlopeEasy);
		Button btnSlopeMed = (Button) findViewById(R.id.btnSlopeMed);
		Button btnSlopeHard = (Button) findViewById(R.id.btnSlopeHard);
		Button btnSlopePro = (Button) findViewById(R.id.btnSlopePro);

		

		final Context context = this;

		btnSlopeEasy.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// open jump activity when jump is selected
				Intent intent = new Intent(context, Slope.class);
				startActivity(intent);
			}
		});

		btnSlopeMed.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// open jump activity when jump is selected
				Intent intent = new Intent(context, MedSlope.class);
				startActivity(intent);
			}
		});
		
		btnSlopeHard.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// open jump activity when jump is selected
				Intent intent = new Intent(context, HardSlope.class);
				startActivity(intent);
			}
		});
		
		btnSlopePro.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// open jump activity when jump is selected
				Intent intent = new Intent(context, ProSlope.class);
				startActivity(intent);
			}
		});
	}

}
