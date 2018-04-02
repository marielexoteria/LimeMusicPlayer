package com.example.android.mymusicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class AudiobooksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sound_file_list);

        //Creating an ArrayList of the custom class "SoundFile" to display the info about the music files
        ArrayList<SoundFile> audiobookFiles = new ArrayList<SoundFile>();

        //Populating the ArrayList
        /*
         * @param audiobook_icon    The generic image that will represent an audiobook
         * @param artistOrAuthor    The author of the audiobook, for ex. J.K. Rowling
         * @param title             The title of the audiobook, for ex. Harry Potter and the Sorcerer's Stone
         */
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "JK Rowling", "Fantastic beasts and where to find them", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Paola Chaljub", "Soltera en tiempos modernos", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Stieg Larsson", "Män som hatar kvinnor", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Gabriel G. Márquez", "Del amor y otros demonios", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Camilla Läckberg", "Olycksfågeln", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Isabel Allende", "El cuaderno de Maya", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Jacinto Gimbernard", "Medalaganario", R.drawable.audiobook_image_now_playing));
        audiobookFiles.add(new SoundFile(R.drawable.audiobooks_icon, "Jens Lapidus", "Snabba cash", R.drawable.audiobook_image_now_playing));

        //Creating a GridView to display the tracks - child views and applying the background color
        SoundFileAdapter audiobookItemsAdapter = new SoundFileAdapter(this, audiobookFiles, R.color.background_color);
        final GridView audiobookGridView = (GridView) findViewById(R.id.sound_file_grid);
        audiobookGridView.setAdapter(audiobookItemsAdapter);
        audiobookGridView.setBackgroundColor(getResources().getColor(R.color.category_color));

        //Adding functionality of the back button > going back to the previous screen
        //Answer from https://stackoverflow.com/questions/4038479/android-go-back-to-previous-activity
        final Button backToPreviousScreen = (Button)findViewById(R.id.back_to_main_screen);
        backToPreviousScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
