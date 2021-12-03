package ru.javabase.oop.zadachi.printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(10);
        printer.print("Hello world");
        printer.charge(5);
        printer.print("Hello world");
    }
}
