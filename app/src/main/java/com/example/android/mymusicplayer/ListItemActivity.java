package com.example.android.mymusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class ListItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item);

        Button playButton = (Button) findViewById(R.id.list_play_button);

        //Set a click listener on the Music view
        playButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Music View is clicked on.
            @Override
            public void onClick(View view) {
                /*Intent musicIntent = new Intent(ListItemActivity.this, NowPlaying.class);
                startActivity(musicIntent);*/
                Toast.makeText(ListItemActivity.this, "Coming soon", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
