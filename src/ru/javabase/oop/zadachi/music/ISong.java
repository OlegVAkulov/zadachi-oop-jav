package ru.javabase.oop.zadachi.music;

import ru.javabase.oop.zadachi.music.objects.Author;

public interface ISong {
    String name();
    Author author();
    void play();


}
