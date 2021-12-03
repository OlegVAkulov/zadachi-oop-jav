package ru.javabase.oop.zadachi.computer;

public class Main {
    public static void main(String[] args) {
        Computer newComputer = new Computer("MacBook", new Monitor("Samsung"));


        newComputer.on();
        newComputer.stop();

    }
}
