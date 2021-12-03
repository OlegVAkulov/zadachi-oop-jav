package ru.javabase.oop.zadachi.computer;

public class Computer implements IComputer{
    private String nameOfComputer;
    private IMonitor monitor;


    @Override
    public String getName() {
        return nameOfComputer;
    }

    public Computer() {
    }

    public Computer(String nameOfComputer, IMonitor monitor) {
        this.nameOfComputer = nameOfComputer;
        this.monitor = monitor;
    }

    @Override
    public IMonitor getMonitor() {
        return monitor;
    }

    @Override
    public void on() {
        System.out.println("Computer on: " + nameOfComputer + ", with monitor: " + monitor.getNameOfMonitor());


    }

    @Override
    public void stop() {
        System.out.println("Computer off: " + nameOfComputer + ", with monitor: " + monitor.getNameOfMonitor());

    }
}
