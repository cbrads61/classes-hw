package com.bleh;

public class Main {

    public static void main(String[] args) {
        User user = new User("Colin");
        Song song1 = new Song("Shambhala 2016 Mix", "Excision", "Paradox");
        Song song2 = new Song("Battle Sirens - Single", "Knife Party ft. Tom Morello", "Battle Sirens");
        Song song3 = new Song("Welcome to Our Church", "Black Tiger Sex Machine", "Broadside");
        Song song4 = new Song("Into the Sun", "Bassnectar", "Chasing Heaven");
        Song song5 = new Song("Neon Grave", "Zomboy", "Lights Out");
        Song song6 = new Song("'Weird Al' in 3-D", "Weird Al Yankovic", "Eat It");
        Song song7 = new Song("Dare to Be Stupid", "Weird Al Yankovic", "Yoda");
        Song song8 = new Song("A Little Bit Special", "Stephen Lynch", "Jim Henson's Dead");
        Song song9 = new Song("Live at the El Ray", "Stephen Lynch", "Craig");
        Song song10 = new Song("Tuxicity", "Richard Cheese", "Down With the Sickness");

        Playlist playlistA = new Playlist("random EDM stuff :)");
        playlistA.addSong(song1);
        playlistA.addSong(song2);
        playlistA.addSong(song3);
        playlistA.addSong(song4);
        playlistA.addSong(song5);

        Playlist playlistB = new Playlist("a pretty funny playlist");
        playlistB.addSong(song6);
        playlistB.addSong(song8);
        playlistB.addSong(song10);
        playlistB.addSong(song7);
        playlistB.addSong(song9);

        user.addPlaylist(playlistA);
        user.addPlaylist(playlistB);

        System.out.println("Playlists: " + user.getAllPlaylists() + "\n");
        System.out.println("Playing: " + playlistA.getName());
            playlistA.playAll();
        System.out.println("\n");
        System.out.println("Playing: " + playlistB.getName());
            playlistB.playAll();
        System.out.println("\n");

    }

}
