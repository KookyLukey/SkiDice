package com.kooknluke.skidice;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


public class shakeSlope extends ActionBarActivity {

    String sel_diff = "";
    private Selection slopeSelection = new Selection();
    public static final String DIFF_SEL = "prefs_diff";
    TextView jTxt1;
    TextView jTxt2;
    TextView jTxt3;

    TextView rTxt1;
    TextView rTxt2;
    TextView rTxt3;

    private SensorManager mSensorManager;
    private float mAccel; // acceleration apart from gravity
    private float mAccelCurrent; // current acceleration including gravity
    private float mAccelLast; // last acceleration including gravity

    private final SensorEventListener mSensorListener = new SensorEventListener() {

        public void onSensorChanged(SensorEvent se) {
            float x = se.values[0];
            float y = se.values[1];
            float z = se.values[2];
            mAccelLast = mAccelCurrent;
            mAccelCurrent = (float) Math.sqrt((double) (x*x + y*y + z*z));
            float delta = mAccelCurrent - mAccelLast;
            mAccel = mAccel * 0.9f + delta; // perform low-cut filter

            if (mAccel > 12 && sel_diff.equals("Gaper")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

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

                jTxt1.setText(finalTrick);
                jTxt2.setText(finalTrick2);
                jTxt3.setText(finalTrick3);

                String rFinalTrick = "";
                String rFinalTrick2 = "";
                String rFinalTrick3 = "";

                String eRailSwitch = slopeSelection.switchSelector();
                String easyRail = slopeSelection.easyRails();
                String eRailSwitch2 = slopeSelection.switchSelector();
                String easyRail2 = slopeSelection.easyRails();
                String eRailSwitch3 = slopeSelection.switchSelector();
                String easyRail3 = slopeSelection.easyRails();

                rFinalTrick = eRailSwitch + " " + easyRail;
                rFinalTrick2 = eRailSwitch2 + " " + easyRail2;
                rFinalTrick3 = eRailSwitch3 + " " + easyRail3;

                rTxt1.setText(rFinalTrick);
                rTxt2.setText(rFinalTrick2);
                rTxt3.setText(rFinalTrick3);
            }
            else if (mAccel > 12 && sel_diff.equals("Ight")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

                String finalTrick = "";
                String finalTrick2 = "";
                String finalTrick3 = "";

                String eJumpSwitch = slopeSelection.switchSelector();
                String easyJump = slopeSelection.medJumps();
                String eJumpSwitch2 = slopeSelection.switchSelector();
                String easyJump2 = slopeSelection.medJumps();
                String eJumpSwitch3 = slopeSelection.switchSelector();
                String easyJump3 = slopeSelection.medJumps();

                finalTrick = eJumpSwitch + " " + easyJump;
                finalTrick2 = eJumpSwitch2 + " " + easyJump2;
                finalTrick3 = eJumpSwitch3 + " " + easyJump3;

                jTxt1.setText(finalTrick);
                jTxt2.setText(finalTrick2);
                jTxt3.setText(finalTrick3);

                String rFinalTrick = "";
                String rFinalTrick2 = "";
                String rFinalTrick3 = "";

                String eRailSwitch = slopeSelection.switchSelector();
                String easyRail = slopeSelection.medRails();
                String eRailSwitch2 = slopeSelection.switchSelector();
                String easyRail2 = slopeSelection.medRails();
                String eRailSwitch3 = slopeSelection.switchSelector();
                String easyRail3 = slopeSelection.medRails();

                rFinalTrick = eRailSwitch + " " + easyRail;
                rFinalTrick2 = eRailSwitch2 + " " + easyRail2;
                rFinalTrick3 = eRailSwitch3 + " " + easyRail3;

                rTxt1.setText(rFinalTrick);
                rTxt2.setText(rFinalTrick2);
                rTxt3.setText(rFinalTrick3);
            }

            else if (mAccel > 12 && sel_diff.equals("Pro")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

                String finalTrick = "";
                String finalTrick2 = "";
                String finalTrick3 = "";

                String eJumpSwitch = slopeSelection.switchSelector();
                String easyJump = slopeSelection.hardJumps();
                String eJumpSwitch2 = slopeSelection.switchSelector();
                String easyJump2 = slopeSelection.hardJumps();
                String eJumpSwitch3 = slopeSelection.switchSelector();
                String easyJump3 = slopeSelection.hardJumps();

                finalTrick = eJumpSwitch + " " + easyJump;
                finalTrick2 = eJumpSwitch2 + " " + easyJump2;
                finalTrick3 = eJumpSwitch3 + " " + easyJump3;

                jTxt1.setText(finalTrick);
                jTxt2.setText(finalTrick2);
                jTxt3.setText(finalTrick3);

                String rFinalTrick = "";
                String rFinalTrick2 = "";
                String rFinalTrick3 = "";

                String eRailSwitch = slopeSelection.switchSelector();
                String easyRail = slopeSelection.hardRails();
                String eRailSwitch2 = slopeSelection.switchSelector();
                String easyRail2 = slopeSelection.hardRails();
                String eRailSwitch3 = slopeSelection.switchSelector();
                String easyRail3 = slopeSelection.hardRails();

                rFinalTrick = eRailSwitch + " " + easyRail;
                rFinalTrick2 = eRailSwitch2 + " " + easyRail2;
                rFinalTrick3 = eRailSwitch3 + " " + easyRail3;

                rTxt1.setText(rFinalTrick);
                rTxt2.setText(rFinalTrick2);
                rTxt3.setText(rFinalTrick3);
            }

            else if (mAccel > 12 && sel_diff.equals("Todd Wallnuts")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

                String finalTrick = "";
                String finalTrick2 = "";
                String finalTrick3 = "";

                String eJumpSwitch = slopeSelection.switchSelector();
                String easyJump = slopeSelection.proJumps();
                String eJumpSwitch2 = slopeSelection.switchSelector();
                String easyJump2 = slopeSelection.proJumps();
                String eJumpSwitch3 = slopeSelection.switchSelector();
                String easyJump3 = slopeSelection.proJumps();

                finalTrick = eJumpSwitch + " " + easyJump;
                finalTrick2 = eJumpSwitch2 + " " + easyJump2;
                finalTrick3 = eJumpSwitch3 + " " + easyJump3;

                jTxt1.setText(finalTrick);
                jTxt2.setText(finalTrick2);
                jTxt3.setText(finalTrick3);

                String rFinalTrick = "";
                String rFinalTrick2 = "";
                String rFinalTrick3 = "";

                String eRailSwitch = slopeSelection.switchSelector();
                String easyRail = slopeSelection.proRails();
                String eRailSwitch2 = slopeSelection.switchSelector();
                String easyRail2 = slopeSelection.proRails();
                String eRailSwitch3 = slopeSelection.switchSelector();
                String easyRail3 = slopeSelection.proRails();

                rFinalTrick = eRailSwitch + " " + easyRail;
                rFinalTrick2 = eRailSwitch2 + " " + easyRail2;
                rFinalTrick3 = eRailSwitch3 + " " + easyRail3;

                rTxt1.setText(rFinalTrick);
                rTxt2.setText(rFinalTrick2);
                rTxt3.setText(rFinalTrick3);
            }
        }

        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);

//        SharedPreferences settings = getSharedPreferences(DIFF_SEL, 0);
//        sel_diff = settings.getString("df", "Nothing");

    }

    @Override
    protected void onPause() {
        mSensorManager.unregisterListener(mSensorListener);
        super.onPause();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shake_slope);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        mAccel = 0.00f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;

        rTxt1 = (TextView) findViewById(R.id.railTrick1);
        rTxt2 = (TextView) findViewById(R.id.railTrick2);
        rTxt3 = (TextView) findViewById(R.id.railTrick3);

        jTxt1 = (TextView) findViewById(R.id.jumpTrick1);
        jTxt2 = (TextView) findViewById(R.id.jumpTrick2);
        jTxt3 = (TextView) findViewById(R.id.jumpTrick3);

        SharedPreferences settings = getSharedPreferences(DIFF_SEL, 0);
        sel_diff = settings.getString("df", "Nothing");
        Toast toast = Toast.makeText(getApplicationContext(), sel_diff, Toast.LENGTH_LONG);
        toast.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_jump_shake, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
