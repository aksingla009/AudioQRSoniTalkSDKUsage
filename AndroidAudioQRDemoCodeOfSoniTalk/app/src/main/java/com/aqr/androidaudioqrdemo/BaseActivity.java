package com.aqr.androidaudioqrdemo;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // action with ID action_refresh was selected
            case R.id.help:
                openHelp();
                break;
            case R.id.settings:
                openSettings();
                break;

            default:
                return super.onOptionsItemSelected(item);
        }

        return true;
    }

    public void openSettings(){
        Intent myIntent = new Intent(this.getApplicationContext(), SettingsActivity.class);
        startActivityForResult(myIntent, 0);
    }


    public void openHelp(){
        String instructionsText = String.format(getApplicationContext().getString(R.string.instructions_text), getApplicationContext().getString(R.string.detection_crc_incorrect));
        new AlertDialog.Builder(this).setTitle(R.string.instructions_title).setMessage(instructionsText).setPositiveButton("OK", null).show();
    }
}
