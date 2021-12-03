package ru.javabase.oop.zadachi.music;

import ru.javabase.oop.zadachi.music.objects.Song;

import java.util.ArrayList;
import java.util.List;

public interface IPlaylist {
    ArrayList<ISong> playlist();
    void addSong(ISong song);
    void playAllSongs();

}
