package com.bleh;

import java.util.ArrayList;

/**
 * Created by colinbradley on 10/11/16.
 */
public class Playlist {
    private String mPlaylistName;
    private ArrayList<Song> mSongs;

    public Playlist(String name){
        mPlaylistName = name;
        mSongs = new ArrayList<>();
    }

    public String getName(){
        return mPlaylistName;
    }

    public void playAll(){
        for (Song songName : mSongs){
            songName.play();
        }
    }

    public void addSong(Song songName){
        mSongs.add(songName);
    }

}

