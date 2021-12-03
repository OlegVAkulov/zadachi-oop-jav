package ru.javabase.oop.zadachi.printer;

public interface IPrinter {
    int paintVolume();
    void print(String text);
    void charge(int symbolsCount);
}
