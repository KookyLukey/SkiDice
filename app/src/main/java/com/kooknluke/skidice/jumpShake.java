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


public class jumpShake extends ActionBarActivity {

    String sel_diff = "";
    private Selection jumpSelection = new Selection();
    public static final String DIFF_SEL = "prefs_diff";
    TextView jShakeView;

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

                String finalTrick;
                String jumpSwitch = jumpSelection.switchSelector();
                String jump = jumpSelection.easyJumps();

                finalTrick = jumpSwitch + jump;
                jShakeView.setText(finalTrick);
            }
            else if (mAccel > 12 && sel_diff.equals("Ight")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

                String finalTrick;
                String jumpSwitch = jumpSelection.switchSelector();
                String jump = jumpSelection.medJumps();

                finalTrick = jumpSwitch + jump;
                jShakeView.setText(finalTrick);
            }

            else if (mAccel > 12 && sel_diff.equals("Pro")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

                String finalTrick;
                String jumpSwitch = jumpSelection.switchSelector();
                String jump = jumpSelection.hardJumps();

                finalTrick = jumpSwitch + jump;
                jShakeView.setText(finalTrick);
            }

            else if (mAccel > 12 && sel_diff.equals("Todd Wallnuts")) {
                Toast toast = Toast.makeText(getApplicationContext(), "Device has shaken.", Toast.LENGTH_LONG);
                toast.show();

                String finalTrick;
                String jumpSwitch = jumpSelection.switchSelector();
                String jump = jumpSelection.proJumps();

                finalTrick = jumpSwitch + jump;
                jShakeView.setText(finalTrick);
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
        setContentView(R.layout.activity_jump_shake);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mSensorManager.registerListener(mSensorListener, mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
        mAccel = 0.00f;
        mAccelCurrent = SensorManager.GRAVITY_EARTH;
        mAccelLast = SensorManager.GRAVITY_EARTH;
        jShakeView = (TextView) findViewById(R.id.txtShakeJump);

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
