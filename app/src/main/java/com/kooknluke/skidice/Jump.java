package com.kooknluke.skidice;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Jump extends ActionBarActivity {

	private Selection easyJumpSelection = new Selection();
	private Selection medJumpSelection = new Selection();
	private Selection hardJumpSelection = new Selection();
	private Selection proJumpSelection = new Selection();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jump);
		android.support.v7.app.ActionBar actionBar = getSupportActionBar();
    	actionBar.hide();
		

		//assign variables to gui buttons
		Button btnEasy = (Button) findViewById(R.id.btnEasy);
		Button btnMed = (Button) findViewById(R.id.btnMed);
		Button btnHard = (Button) findViewById(R.id.btnHard);
		Button btnPro = (Button) findViewById(R.id.btnPro);

		final TextView jumpTxtView = (TextView) findViewById(R.id.txtJump);

		btnEasy.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String finalTrick = "";
				String eJumpSwitch = easyJumpSelection.switchSelector();
				String easyJump = easyJumpSelection.easyJumps();

				finalTrick = eJumpSwitch + easyJump;
				jumpTxtView.setText(finalTrick);
			}
		});

		btnMed.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String medFinalTrick = "";
				String mJumpSwitch = medJumpSelection.switchSelector();
				String medJump = medJumpSelection.medJumps();

				medFinalTrick = mJumpSwitch + medJump;
				jumpTxtView.setText(medFinalTrick);
			}
		});
		
		btnHard.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String hardFinalTrick = "";
				String hJumpSwitch = hardJumpSelection.switchSelector();
				String hardJump = hardJumpSelection.hardJumps();

				hardFinalTrick = hJumpSwitch + hardJump;
				jumpTxtView.setText(hardFinalTrick);
			}
		});
		
		btnPro.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//
				String proFinalTrick = "";
				//String pJumpSwitch = proJumpSelection.switchSelector();
				String proJump = proJumpSelection.proJumps();

				proFinalTrick = proJump;
				jumpTxtView.setText(proFinalTrick);
			}
		});
	}
}
