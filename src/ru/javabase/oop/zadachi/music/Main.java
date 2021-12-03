package ru.javabase.oop.zadachi.music;

import ru.javabase.oop.zadachi.music.objects.Author;
import ru.javabase.oop.zadachi.music.objects.Player;
import ru.javabase.oop.zadachi.music.objects.Song;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Чайковский");
        Song song1 = new Song("Щелкунчик", author);
        Song song2 = new Song("Ночь под луной", author);
        Author author1 = new Author("Кинчев");
        Song song3 = new Song("Воин", author1);


//        List<Song> playlist = new ArrayList<>();
//        playlist.addSong(song1);
//        playlist.add(song2);
//        playlist.add(song3);
        song1.play();
        System.out.println();

        Player player = new Player();
//        player.playAllSongs();
        player.addSong(song1);
        player.addSong(song2);
        player.addSong(song3);
        System.out.println();

        player.playAllSongs();


    }
}
