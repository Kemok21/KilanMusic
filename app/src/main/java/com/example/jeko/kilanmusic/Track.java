package com.example.jeko.kilanmusic;

/**
 * {@Link Track} represents a track that the user can to play.
 * It contains a title, performer, title album and a time for that track.
 */

public class Track {

    /** Index of the track */
    private int mIndex;
    /** Title of the track */
    private String mTitle;
    /** Name performer of the track */
    private String mPerformer;
    /** Name album of the track */
    private String mAlbum;
    /** Genre of the track */
    private String mGenre;
    /** Time of the track */
    private String mTime;

    public Track(int index, String title, String performer, String album, String genre, String time) {
        mIndex = index;
        mTitle = title;
        mPerformer = performer;
        mAlbum = album;
        mGenre = genre;
        mTime = time;
    }
    /**
     * Get the index of the track.
     */
    public int getIndex() {
        return mIndex;
    }
    /**
     * Get the title of the track.
     */
    public String getTitle() {
        return mTitle;
    }
    /**
     * Get the name performer of the track.
     */
    public String getPerformer() {
        return mPerformer;
    }
    /**
     * Get the name album of the track.
     */
    public String getAlbum() {
        return mAlbum;
    }
    /**
     * Get genre of the track.
     */
    public String getGenre() {
        return mGenre;
    }
    /**
     * Get time of the track.
     */
    public String getTime() {
        return mTime;
    }
}
