package com.mandeepk.weatherapplication;

import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class WeatherPreferenceActivity extends PreferenceActivity {

	@Override
	public void onCreate(Bundle bundle){
		super.onCreate(Bundle);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		String action = getIntent().getAction();
		
		addPreferencesFromResource(R.xml.weather_prefs);
		
		SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		//We set the current values in the description
		Preference prefLocation = getPreferenceScreen().findPreference("swa_loc");
		Preference prefTemp = getPreferenceScreen().findPreference("swa_temp_unit");
		
		prefLocation.setSummary(getResources().getText(R.string.summary_loc) + " " + prefs.getString("cityName", null) + "," + prefs.getString("country", null));
		
	}
}
