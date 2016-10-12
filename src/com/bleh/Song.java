package com.bleh;

/**
 * Created by colinbradley on 10/11/16.
 */
public class Song {
    private String mAlbum;
    private String mArtist;
    private String mSong;

    public Song(String album, String artist, String song){
        mAlbum = album;
        mArtist = artist;
        mSong = song;
    }

    public void play(){
        System.out.println("Now Playing: " + mSong + " by " + mArtist + " from " + mAlbum);
    }

}
