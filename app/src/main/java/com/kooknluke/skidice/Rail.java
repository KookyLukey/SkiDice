package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rail extends ActionBarActivity {
	
	private Selection mSelectionM = new Selection();
	private Selection mSelectionP = new Selection();
	private Selection mSelectionH = new Selection();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rail);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();
		
		Button btnRailEasy = (Button) findViewById(R.id.btnRailEasy);
		Button btnRailMed = (Button) findViewById(R.id.btnRailMed);
		Button btnRailHard = (Button) findViewById(R.id.btnRailHard);
		Button btnRailPro = (Button) findViewById(R.id.btnRailPro);
		
		final TextView railTxtView = (TextView) findViewById(R.id.txtRail);
		
		btnRailEasy.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String finalTrick = "";
				String easyRail = mSelectionM.easyRails();

				finalTrick = easyRail;
				railTxtView.setText(finalTrick);
			}
		});
		
		btnRailMed.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String finalTrick = "";
				String medRail = mSelectionM.medRails();

				finalTrick = medRail;
				railTxtView.setText(finalTrick);
			}
		});
		
		btnRailHard.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String finalTrick = "";
				String hardRail = mSelectionH.hardRails();

				finalTrick = hardRail;
				railTxtView.setText(finalTrick);
			}
		});
		
		btnRailPro.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String finalTrick = "";
				String proRail = mSelectionP.proRails();

				finalTrick = proRail;
				railTxtView.setText(finalTrick);
			}
		});
		
	}
}
