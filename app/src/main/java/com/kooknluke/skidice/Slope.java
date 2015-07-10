package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Slope extends ActionBarActivity {

	Selection slopeSelection = new Selection();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slope);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();

		Button btnSlopeJump1 = (Button) findViewById(R.id.bEJ1);
		Button btnSlopeJump2 = (Button) findViewById(R.id.bEJ2);
		Button btnSlopeJump3 = (Button) findViewById(R.id.bEJ3);
		Button btnSlopeRail1 = (Button) findViewById(R.id.bER1);
		Button btnSlopeRail2 = (Button) findViewById(R.id.bER2);
		Button btnSlopeRail3 = (Button) findViewById(R.id.bER3);

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
				String eJumpSwitch = slopeSelection.switchSelector();
				String easyJump = slopeSelection.easyJumps();

				finalTrick = eJumpSwitch + " " + easyJump;
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
				String eJumpSwitch = slopeSelection.switchSelector();
				String easyJump = slopeSelection.easyJumps();
				String eJumpSwitch2 = slopeSelection.switchSelector();
				String easyJump2 = slopeSelection.easyJumps();

				finalTrick = eJumpSwitch + " " + easyJump;
				finalTrick2 = eJumpSwitch2 + " " + easyJump2;
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
				
				String eJumpSwitch = slopeSelection.switchSelector();
				String easyJump = slopeSelection.easyJumps();
				String eJumpSwitch2 = slopeSelection.switchSelector();
				String easyJump2 = slopeSelection.easyJumps();
				String eJumpSwitch3 = slopeSelection.switchSelector();
				String easyJump3 = slopeSelection.easyJumps();

				finalTrick = eJumpSwitch + " " + easyJump;
				finalTrick2 = eJumpSwitch2 + " " + easyJump2;
				finalTrick3 = eJumpSwitch3 + " " + easyJump3;
				
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
				String eRailSwitch = slopeSelection.switchSelector();
				String easyRail = slopeSelection.easyRails();

				finalTrick = eRailSwitch + " " + easyRail;
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
				String eRailSwitch = slopeSelection.switchSelector();
				String easyRail = slopeSelection.easyRails();
				String eRailSwitch2 = slopeSelection.switchSelector();
				String easyRail2 = slopeSelection.easyRails();

				finalTrick = eRailSwitch + " " + easyRail;
				finalTrick2 = eRailSwitch2 + " " + easyRail2;
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
				
				String eRailSwitch = slopeSelection.switchSelector();
				String easyRail = slopeSelection.easyRails();
				String eRailSwitch2 = slopeSelection.switchSelector();
				String easyRail2 = slopeSelection.easyRails();
				String eRailSwitch3 = slopeSelection.switchSelector();
				String easyRail3 = slopeSelection.easyRails();

				finalTrick = eRailSwitch + " " + easyRail;
				finalTrick2 = eRailSwitch2 + " " + easyRail2;
				finalTrick3 = eRailSwitch3 + " " + easyRail3;
				
				txtRail1.setText(finalTrick);
				txtRail2.setText(finalTrick2);
				txtRail3.setText(finalTrick3);

			}
		});
	}

}
