package com.kooknluke.skidice;

import android.content.SharedPreferences;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Difficulty_Selection extends ActionBarActivity {

    public String difficulty = "";
    public static final String DIFF_SEL = "prefs_diff";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty__selection);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Button btnGaper = (Button) findViewById(R.id.btnGaper);
        Button btnIght = (Button) findViewById(R.id.btnIght);
        Button btnPro = (Button) findViewById(R.id.btnPro);
        Button btnTW = (Button) findViewById(R.id.btnTW);

        btnGaper.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open jump activity when jump is selected
                difficulty = "Gaper";
                setDiff("Gaper");
                Toast toast = Toast.makeText(getApplicationContext(), "Difficulty set to " + difficulty, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnIght.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open jump activity when jump is selected
                difficulty = "Ight";
                setDiff("Ight");
                Toast toast = Toast.makeText(getApplicationContext(), "Difficulty set to " + difficulty, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnPro.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open jump activity when jump is selected
                difficulty = "Pro";
                setDiff("Pro");
                Toast toast = Toast.makeText(getApplicationContext(), "Difficulty set to " + difficulty, Toast.LENGTH_LONG);
                toast.show();
            }
        });

        btnTW.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // open jump activity when jump is selected
                difficulty = "Todd Wallnuts";
                setDiff("Todd Wallnuts");
                Toast toast = Toast.makeText(getApplicationContext(), "Difficulty set to " + difficulty, Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    protected void onResume(){
        super.onResume();
        SharedPreferences settings = getSharedPreferences(DIFF_SEL, 0);
        difficulty = settings.getString("df", difficulty);
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences settings = getSharedPreferences(DIFF_SEL, 0);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString("df", difficulty);
        editor.commit();
    }

//    public String getDiff(){
//        return difficulty;
//    }
    public void setDiff(String var){
        difficulty = var;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_difficulty__selection, menu);
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
