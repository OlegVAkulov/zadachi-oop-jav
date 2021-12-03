package ru.javabase.oop.zadachi.music.objects;

import ru.javabase.oop.zadachi.music.ISong;

public class Song implements ISong {
    private String name;
    private Author author;

    public Song(String name, Author author) {
        this.name = name;
        this.author = author;
    }

    public Song() {
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public Author author() {
        return author;
    }

    @Override
    public void play() {
        System.out.println("Играет песня: " + name + " автор: " + author.getName());

    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", author=" + author.getName() +
                '}';
    }

    public String getNameOfSong() {
        return name;
    }

    public void setNameOfSong(String name) {
        this.name = name;
    }
}
