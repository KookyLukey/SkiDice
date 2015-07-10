package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MedSlope extends ActionBarActivity {
	
	Selection slopeSelection = new Selection();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_med_slope);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();
		
		Button btnSlopeJump1 = (Button) findViewById(R.id.MJ1);
		Button btnSlopeJump2 = (Button) findViewById(R.id.MJ2);
		Button btnSlopeJump3 = (Button) findViewById(R.id.MJ3);
		Button btnSlopeRail1 = (Button) findViewById(R.id.MR1);
		Button btnSlopeRail2 = (Button) findViewById(R.id.MR2);
		Button btnSlopeRail3 = (Button) findViewById(R.id.MR3);

		final TextView txtJump1 = (TextView) findViewById(R.id.MJ1t);
		final TextView txtJump2 = (TextView) findViewById(R.id.MJ2t);
		final TextView txtJump3 = (TextView) findViewById(R.id.MJ3t);
		final TextView txtRail1 = (TextView) findViewById(R.id.MR1t);
		final TextView txtRail2 = (TextView) findViewById(R.id.MR2t);
		final TextView txtRail3 = (TextView) findViewById(R.id.MR3t);

		btnSlopeJump1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String mJumpSwitch = slopeSelection.switchSelector();
				String medJump = slopeSelection.medJumps();

				finalTrick = mJumpSwitch + " " + medJump;
				txtJump1.setText(finalTrick);
				txtJump2.setText("");
				txtJump3.setText("");

			}
		});

		btnSlopeJump2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String finalTrick2 = "";
				String medJumpSwitch = slopeSelection.switchSelector();
				String medJump = slopeSelection.medJumps();
				String medJumpSwitch2 = slopeSelection.switchSelector();
				String medJump2 = slopeSelection.medJumps();

				finalTrick = medJumpSwitch + " " + medJump;
				finalTrick2 = medJumpSwitch2 + " " + medJump2;
				txtJump1.setText(finalTrick);
				txtJump2.setText(finalTrick2);
				txtJump3.setText("");

			}
		});
		
		btnSlopeJump3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String finalTrick2 = "";
				String finalTrick3 = "";
				
				String medJumpSwitch = slopeSelection.switchSelector();
				String medJump = slopeSelection.medJumps();
				String medJumpSwitch2 = slopeSelection.switchSelector();
				String medJump2 = slopeSelection.medJumps();
				String medJumpSwitch3 = slopeSelection.switchSelector();
				String medJump3 = slopeSelection.medJumps();

				finalTrick = medJumpSwitch + " " + medJump;
				finalTrick2 = medJumpSwitch2 + " " + medJump2;
				finalTrick3 = medJumpSwitch3 + " " + medJump3;
				
				txtJump1.setText(finalTrick);
				txtJump2.setText(finalTrick2);
				txtJump3.setText(finalTrick3);

			}
		});
		
		btnSlopeRail1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String medRailSwitch = slopeSelection.switchSelector();
				String medRail = slopeSelection.medRails();

				finalTrick = medRailSwitch + " " + medRail;
				txtRail1.setText(finalTrick);
				txtRail2.setText("");
				txtRail3.setText("");

			}
		});
		
		btnSlopeRail2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String finalTrick2 = "";
				String medRailSwitch = slopeSelection.switchSelector();
				String medRail = slopeSelection.medRails();
				String medRailSwitch2 = slopeSelection.switchSelector();
				String medRail2 = slopeSelection.medRails();

				finalTrick = medRailSwitch + " " + medRail;
				finalTrick2 = medRailSwitch2 + " " + medRail2;
				txtRail1.setText(finalTrick);
				txtRail2.setText(finalTrick2);
				txtRail3.setText("");

			}
		});
		
		btnSlopeRail3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String finalTrick2 = "";
				String finalTrick3 = "";
				
				String medRailSwitch = slopeSelection.switchSelector();
				String medRail = slopeSelection.medRails();
				String medRailSwitch2 = slopeSelection.switchSelector();
				String medRail2 = slopeSelection.medRails();
				String medRailSwitch3 = slopeSelection.switchSelector();
				String medRail3 = slopeSelection.medRails();

				finalTrick = medRailSwitch + " " + medRail;
				finalTrick2 = medRailSwitch2 + " " + medRail2;
				finalTrick3 = medRailSwitch3 + " " + medRail3;
				
				txtRail1.setText(finalTrick);
				txtRail2.setText(finalTrick2);
				txtRail3.setText(finalTrick3);

			}
		});
		
	}

	
}
