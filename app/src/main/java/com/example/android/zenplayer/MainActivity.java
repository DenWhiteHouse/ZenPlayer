package com.example.android.zenplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Playlist category
        TextView playlist = (TextView) findViewById(R.id.playlist);
        // Set a click listener on that View
        playlist.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the playlist category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link the Activity Playlist}
                Intent playlistIntent = new Intent(MainActivity.this, Playlist.class);
                // Start the new activity
                startActivity(playlistIntent);
            }
        });

        // Find the View that shows the Discover category
        TextView discover = (TextView) findViewById(R.id.discover);
        // Set a click listener on that View
        discover.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the discover category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link the Activity Discover}
                Intent discoverIntent = new Intent(MainActivity.this, Discover.class);
                // Start the new activity
                startActivity(discoverIntent);
            }
        });

        // Find the View that shows the Breathing category
        TextView breathing = (TextView) findViewById(R.id.breathing);
        // Set a click listener on that View
        breathing.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the breathing category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link the Activity Breathing}
                Intent breathingIntent = new Intent(MainActivity.this, Breathing.class);
                // Start the new activity
                startActivity(breathingIntent);
            }
        });

        // Find the View that shows the Mindfulness category
        TextView mindfulness = (TextView) findViewById(R.id.mindfulness);
        // Set a click listener on that View
        mindfulness.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the mindfulness category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link the Activity Mindfulness}
                Intent mindfulnessIntent = new Intent(MainActivity.this, Mindfulness.class);
                // Start the new activity
                startActivity(mindfulnessIntent);
            }
        });






    }
}
