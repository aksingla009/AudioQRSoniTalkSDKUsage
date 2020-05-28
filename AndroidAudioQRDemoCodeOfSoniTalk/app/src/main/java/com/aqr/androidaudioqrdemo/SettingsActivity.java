package com.aqr.androidaudioqrdemo;

import android.os.Bundle;

public class SettingsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_container);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(R.id.preference_container, new SettingsFragment()) //replace the layout file with the settingsFragment
                .commit();
    }
}
