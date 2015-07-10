package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HardSlope extends ActionBarActivity {
	
	Selection slopeSelection = new Selection();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hard_slope);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();
		
		Button btnSlopeJump1 = (Button) findViewById(R.id.HJ1);
		Button btnSlopeJump2 = (Button) findViewById(R.id.HJ2);
		Button btnSlopeJump3 = (Button) findViewById(R.id.HJ3);
		Button btnSlopeRail1 = (Button) findViewById(R.id.HR1);
		Button btnSlopeRail2 = (Button) findViewById(R.id.HR2);
		Button btnSlopeRail3 = (Button) findViewById(R.id.HR3);

		final TextView txtJump1 = (TextView) findViewById(R.id.HJ1t);
		final TextView txtJump2 = (TextView) findViewById(R.id.HJ2t);
		final TextView txtJump3 = (TextView) findViewById(R.id.HJ3t);
		final TextView txtRail1 = (TextView) findViewById(R.id.HR1t);
		final TextView txtRail2 = (TextView) findViewById(R.id.HR2t);
		final TextView txtRail3 = (TextView) findViewById(R.id.HR3t);
		
		btnSlopeJump1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String hardJumpSwitch = slopeSelection.switchSelector();
				String hardJump = slopeSelection.hardJumps();

				finalTrick = hardJumpSwitch + " " + hardJump;
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
				String hardJumpSwitch = slopeSelection.switchSelector();
				String hardJump = slopeSelection.hardJumps();
				String hardJumpSwitch2 = slopeSelection.switchSelector();
				String hardJump2 = slopeSelection.hardJumps();

				finalTrick = hardJumpSwitch + " " + hardJump;
				finalTrick2 = hardJumpSwitch2 + " " + hardJump2;
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
				
				String hardJumpSwitch = slopeSelection.switchSelector();
				String hardJump = slopeSelection.hardJumps();
				String hardJumpSwitch2 = slopeSelection.switchSelector();
				String hardJump2 = slopeSelection.hardJumps();
				String hardJumpSwitch3 = slopeSelection.switchSelector();
				String hardJump3 = slopeSelection.hardJumps();

				finalTrick = hardJumpSwitch + " " + hardJump;
				finalTrick2 = hardJumpSwitch2 + " " + hardJump2;
				finalTrick3 = hardJumpSwitch3 + " " + hardJump3;
				
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
				String hardRailSwitch = slopeSelection.switchSelector();
				String hardRail = slopeSelection.hardRails();

				finalTrick = hardRailSwitch + " " + hardRail;
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
				String hardRailSwitch = slopeSelection.switchSelector();
				String hardRail = slopeSelection.hardRails();
				String hardRailSwitch2 = slopeSelection.switchSelector();
				String hardRail2 = slopeSelection.hardRails();

				finalTrick = hardRailSwitch + " " + hardRail;
				finalTrick2 = hardRailSwitch2 + " " + hardRail2;
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
				
				String hardRailSwitch = slopeSelection.switchSelector();
				String hardRail = slopeSelection.hardRails();
				String hardRailSwitch2 = slopeSelection.switchSelector();
				String hardRail2 = slopeSelection.hardRails();
				String hardRailSwitch3 = slopeSelection.switchSelector();
				String hardRail3 = slopeSelection.hardRails();

				finalTrick = hardRailSwitch + " " + hardRail;
				finalTrick2 = hardRailSwitch2 + " " + hardRail2;
				finalTrick3 = hardRailSwitch3 + " " + hardRail3;
				
				txtRail1.setText(finalTrick);
				txtRail2.setText(finalTrick2);
				txtRail3.setText(finalTrick3);

			}
		});
	}

	
}
