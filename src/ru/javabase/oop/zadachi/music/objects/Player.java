package ru.javabase.oop.zadachi.music.objects;

import ru.javabase.oop.zadachi.music.IPlaylist;
import ru.javabase.oop.zadachi.music.ISong;

import java.util.ArrayList;
import java.util.List;

public class Player implements IPlaylist {


    ArrayList<ISong> songlist = new ArrayList<>();

//    public Player() {
//    }
//
//    public Player(List<Song> songlist) {
//        this.songlist = songlist;
//    }


    @Override
    public ArrayList<ISong> playlist() {
        return songlist;
    }

    @Override
    public void addSong(ISong song) {
        if (songlist.contains(song)){
            System.out.println("Pesnya " + song.name() + "usze dobavlena!");
            return;
        }
        songlist.add(song);
    }

//    public void addSong(Song song) {
//        if (songlist.contains(song)){
//            System.out.println("Pesnya " + song.name() + "usze dobavlena!");
//            return;
//        }
//        songlist.add(song);
//    }

    public void playAllSongs() {
        for (ISong s:songlist){
            s.play();
        }
        System.out.println();

    }


    }

