package com.example.android.mymusicplayer;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by marielbackman on 19/03/2018.
 */

/*
 * Custom class that will populate the ArrayList in MusicActivity.java,
 * PodcastsActivity.java and AudiobooksActivity.java
 */
public class SoundFile implements Parcelable {

    //Icon for the different sound files
    private int mIcon;

    // /Artist or author of the sound file (music/podcast/audiobook)
    private int mArtistOrAuthor;

    //Title of the sound file (music/podcast/audiobook)
    private int mTitle;

    //Image for the Now Playing activity
    private int mNowPlayingImage;

    //Creating the constructor
    public SoundFile (int icon, int artistOrAuthor, int title, int nowPlayingImage) {
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
    public int getArtistOrAuthor() {
        return mArtistOrAuthor;
    }

    //Get the title of the sound file (music/podcast/audiobook)
    public int getTitle() {
        return mTitle;
    }

    //Get the image according to the sound file to display in the Now Playing activity
    public int getNowPlayingImageID() {

        return mNowPlayingImage;
    }

    //Using the Parcelable interface to read the info about the pertinent file
    //in the position of the GridItem when the user of the app touches a specific file
    //they want to listen to
    protected SoundFile(Parcel in) {
        mIcon = in.readInt();
        mArtistOrAuthor = in.readInt();
        mTitle = in.readInt();
        mNowPlayingImage = in.readInt();
    }

    public static final Creator<SoundFile> CREATOR = new Creator<SoundFile>() {
        @Override
        public SoundFile createFromParcel(Parcel in) {
            return new SoundFile(in);
        }

        @Override
        public SoundFile[] newArray(int size) {
            return new SoundFile[size];
        }
    };
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mIcon);
        dest.writeInt(mArtistOrAuthor);
        dest.writeInt(mTitle);
        dest.writeInt(mNowPlayingImage);
    }

}