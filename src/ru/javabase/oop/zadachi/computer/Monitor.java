package ru.javabase.oop.zadachi.computer;

public class Monitor implements IMonitor{
    private String nameOfMonitor;

    public Monitor() {
    }

    public Monitor(String nameOfMonitor) {
        this.nameOfMonitor = nameOfMonitor;
    }

    public void setNameOfMonitor(String nameOfMonitor) {
        this.nameOfMonitor = nameOfMonitor;
    }

    @Override
    public String getNameOfMonitor() {
        return nameOfMonitor;
    }
}
