package com.example.jeko.kilanmusic;

import java.util.ArrayList;

public class ArrayTracks extends ArrayList<Track> {

    public ArrayTracks() {
        super();
        this.add(new Track(0, "Title1", "Performer1", "Album1", "rock", "03:45"));
        this.add(new Track(1, "Title2", "Performer2", "Album2", "jazz", "10:05"));
        this.add(new Track(2, "Title3", "Performer3", "Album3", "minimal", "02:37"));
        this.add(new Track(3, "Title4", "Performer1", "Album1", "rock", "05:59"));
        this.add(new Track(4, "Title5", "Performer2", "Album2", "jazz", "03:33"));
        this.add(new Track(5, "Title6", "Performer4", "Album4", "classic", "07:46"));
        this.add(new Track(6, "Title7", "Performer3", "Album3", "minimal", "02:21"));
        this.add(new Track(7, "Title8", "Performer1", "Album5", "rock", "08:06"));
        this.add(new Track(8, "Title9", "Performer4", "Album4", "classic", "03:03"));
        this.add(new Track(9, "Title10", "Performer3", "Album3", "minimal", "04:52"));
        this.add(new Track(10, "Title11", "Performer1", "Album1", "rock", "03:45"));
        this.add(new Track(11, "Title12", "Performer2", "Album2", "jazz", "10:05"));
        this.add(new Track(12, "Title13", "Performer3", "Album3", "minimal", "02:37"));
        this.add(new Track(13, "Title14", "Performer1", "Album1", "rock", "05:59"));
        this.add(new Track(14, "Title15", "Performer2", "Album2", "jazz", "03:33"));
        this.add(new Track(15, "Title16", "Performer4", "Album4", "classic", "07:46"));
        this.add(new Track(16, "Title17", "Performer3", "Album3", "minimal", "02:21"));
        this.add(new Track(17, "Title18", "Performer1", "Album5", "rock", "08:06"));
        this.add(new Track(18, "Title19", "Performer4", "Album4", "classic", "03:03"));
        this.add(new Track(19, "Title20", "Performer3", "Album3", "minimal", "04:52"));
    }

    private boolean isPlaying = false;

    public void changIsPlaying() {
        if (isPlaying) isPlaying = false;
        else isPlaying = true;
    }

    public boolean getIsPlaying() {
        return isPlaying;
    }

    private int mSelectList = 0;
    private String mSelectListTitle;

    public void setSelectList(int choice, String title) {
        mSelectList = choice;
        mSelectListTitle = title;
    }

    public int getSelectList() {
        return mSelectList;
    }

    private int mIndex = 0;

    public void setPlayingTrackIndex(int index) {
        mIndex = index;
    }

    public int getPlayingTrackIndex() {
        return mIndex;
    }

    public ArrayList<Track> getPerformers() {

        ArrayList<Track> arrayPerformers = new ArrayList<Track>();
        arrayPerformers.add(this.get(0));

        IndexThis:
        for (int i = 1; i < this.size(); i++) {
            for (int j = 0; j < arrayPerformers.size(); j++) {
                if (this.get(i).getPerformer().equals(arrayPerformers.get(j).getPerformer())) {
                    continue IndexThis;
                }
            }
            arrayPerformers.add(this.get(i));
        }

        return arrayPerformers;
    }

    public ArrayList<Track> getAlbums() {

        ArrayList<Track> arrayAlbums = new ArrayList<Track>();
        arrayAlbums.add(this.get(0));

        IndexThis:
        for (int i = 1; i < this.size(); i++) {
            for (int j = 0; j < arrayAlbums.size(); j++) {
                if (this.get(i).getAlbum().equals(arrayAlbums.get(j).getAlbum())) {
                    continue IndexThis;
                }
            }
            arrayAlbums.add(this.get(i));
        }

        return arrayAlbums;
    }

    public ArrayList<Track> getPerformerTracks() {
        ArrayList<Track> arrayPerformerTracks = new ArrayList<Track>();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getPerformer().equals(mSelectListTitle)) {
                arrayPerformerTracks.add(this.get(i));
            }
        }
        return arrayPerformerTracks;
    }

    public ArrayList<Track> getAlbumTracks() {
        ArrayList<Track> arrayAlbumTracks = new ArrayList<Track>();
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getAlbum().equals(mSelectListTitle)) {
                arrayAlbumTracks.add(this.get(i));
            }
        }
        return arrayAlbumTracks;
    }
}
