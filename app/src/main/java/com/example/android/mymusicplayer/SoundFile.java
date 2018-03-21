package com.example.android.mymusicplayer;

/**
 * Created by marielbackman on 19/03/2018.
 */

/*
 * Custom class that will populate the ArrayList in MusicActivity.java,
 * PodcastsActivity.java and AudiobooksActivity.java
 */
public class SoundFile {

    //Icon for the different sound files
    private int mIcon;

    // /Artist or author of the sound file (music/podcast/audiobook)
    private String mArtistOrAuthor;

    //Title of the sound file (music/podcast/audiobook)
    private String mTitle;

    //Image for the Now Playing activity
    private int mNowPlayingImage;

    //Creating the constructor
    public SoundFile (int icon, String artistOrAuthor, String title, int nowPlayingImage) {
        mIcon = icon;
        mArtistOrAuthor = artistOrAuthor;
        mTitle = title;
        mNowPlayingImage = nowPlayingImage;
    }

    //Get the icon of the sound file
    public int getIconID() {
        return mIcon;
    }

    //Get the artist or author of the sound file (music/podcast/audiobook)
    public String getArtistOrAuthor() {
        return mArtistOrAuthor;
    }

    //Get the title of the sound file (music/podcast/audiobook)
    public String getTitle() {
        return mTitle;
    }

    //Get the image according to the sound file to display in the Now Playing activity
    public int getmNowPlayingImageID() {

        return mNowPlayingImage;
    }

}