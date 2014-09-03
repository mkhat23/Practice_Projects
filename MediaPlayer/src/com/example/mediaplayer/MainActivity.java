package com.example.mediaplayer;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	public TextView songName, startTimeField, endTimeField;
	private MediaPlayer mediaPlayer;
	private double startTime = 0;
	private double finalTime = 0;
	private Handler myHandler = new Handler();
	private int forwardTime = 3000;
	private int rewindTime =3000;
	private SeekBar seekBar;
	private ImageButton playButton, pauseButton;
	public static int oneTimeOnly = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        songName = (TextView)findViewById(R.id.textView4);
        startTimeField =(TextView)findViewById(R.id.textView1);
        endTimeField =(TextView)findViewById(R.id.textView2);
        seekBar = (SeekBar)findViewById(R.id.seekBar1);
        playButton = (ImageButton)findViewById(R.id.imageButton1);
        pauseButton = (ImageButton)findViewById(R.id.imageButton2);
        songName.setText("song.mp3");
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        seekBar.setClickable(false);
        pauseButton.setEnabled(false);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
