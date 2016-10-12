package com.bleh;

import java.util.Collection;
import java.util.HashMap;

/**
 * Created by colinbradley on 10/11/16.
 */
public class User {
    private String mUserName;
    private HashMap<String, Playlist> mPlaylistMap;

    public User(String user){
        mUserName = user;
        mPlaylistMap = new HashMap<>();
    }

    public void addPlaylist(Playlist playlist){
        mPlaylistMap.put(playlist.getName(), playlist);
    }

    public Collection<String> getAllPlaylists(){
        return mPlaylistMap.keySet();
    }

    public Playlist getPlaylistByName(String user){
        if (mPlaylistMap.containsKey(user)){
            return mPlaylistMap.get(user);
        }
        else{
            return null;
        }
    }

}
