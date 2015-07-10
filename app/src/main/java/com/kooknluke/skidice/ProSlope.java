package com.kooknluke.skidice;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProSlope extends ActionBarActivity {
	
	Selection slopeSelection = new Selection();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pro_slope);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();
		

		Button btnSlopeJump1 = (Button) findViewById(R.id.PJ1);
		Button btnSlopeJump2 = (Button) findViewById(R.id.PJ2);
		Button btnSlopeJump3 = (Button) findViewById(R.id.PJ3);
		Button btnSlopeRail1 = (Button) findViewById(R.id.PR1);
		Button btnSlopeRail2 = (Button) findViewById(R.id.PR2);
		Button btnSlopeRail3 = (Button) findViewById(R.id.PR3);

		final TextView txtJump1 = (TextView) findViewById(R.id.PJ1t);
		final TextView txtJump2 = (TextView) findViewById(R.id.PJ2t);
		final TextView txtJump3 = (TextView) findViewById(R.id.PJ3t);
		final TextView txtRail1 = (TextView) findViewById(R.id.PR1t);
		final TextView txtRail2 = (TextView) findViewById(R.id.PR2t);
		final TextView txtRail3 = (TextView) findViewById(R.id.PR3t);
		
		btnSlopeJump1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				String finalTrick = "";
				String proJumpSwitch = slopeSelection.switchSelector();
				String proJump = slopeSelection.proJumps();

				finalTrick = proJumpSwitch + " " + proJump;
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
				String proJumpSwitch = slopeSelection.switchSelector();
				String proJump = slopeSelection.proJumps();
				String proJumpSwitch2 = slopeSelection.switchSelector();
				String proJump2 = slopeSelection.proJumps();

				finalTrick = proJumpSwitch + " " + proJump;
				finalTrick2 = proJumpSwitch2 + " " + proJump2;
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
				
				String proJumpSwitch = slopeSelection.switchSelector();
				String proJump = slopeSelection.proJumps();
				String proJumpSwitch2 = slopeSelection.switchSelector();
				String proJump2 = slopeSelection.proJumps();
				String proJumpSwitch3 = slopeSelection.switchSelector();
				String proJump3 = slopeSelection.proJumps();

				finalTrick = proJumpSwitch + proJump;
				finalTrick2 = proJumpSwitch2 + proJump2;
				finalTrick3 = proJumpSwitch3 + proJump3;
				
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
				String proRailSwitch = slopeSelection.switchSelector();
				String proRail = slopeSelection.proRails();

				finalTrick = proRailSwitch + " " + proRail;
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
				String proRailSwitch = slopeSelection.switchSelector();
				String proRail = slopeSelection.proRails();
				String proRailSwitch2 = slopeSelection.switchSelector();
				String proRail2 = slopeSelection.proRails();

				finalTrick = proRailSwitch + " " + proRail;
				finalTrick2 = proRailSwitch2 + " " + proRail2;
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
				
				String proRailSwitch = slopeSelection.switchSelector();
				String proRail = slopeSelection.proRails();
				String proRailSwitch2 = slopeSelection.switchSelector();
				String proRail2 = slopeSelection.proRails();
				String proRailSwitch3 = slopeSelection.switchSelector();
				String proRail3 = slopeSelection.proRails();

				finalTrick = proRail;
				finalTrick2 = proRail2;
				finalTrick3 = proRail3;
				
				txtRail1.setText(finalTrick);
				txtRail2.setText(finalTrick2);
				txtRail3.setText(finalTrick3);

			}
		});
		
	}
}
