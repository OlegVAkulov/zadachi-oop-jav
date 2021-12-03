package ru.javabase.oop.zadachi.city.object;

import java.util.ArrayList;
import java.util.Arrays;

public class Flat {
    private int numberOfFlat;
    ArrayList<Settler> settlerArrayList = new ArrayList<>();
    public void addSettler(Settler settler){
        if (settlerArrayList.contains(settler)){
            System.out.println("Can not move this resident second time");
            return;
        }
       if (settlerArrayList.size() >=2){
           System.out.println("Can not populate more that two residents");
           return;
       }
        settlerArrayList.add(settler);
    }

    public Flat() {
    }

    public Flat(int numberOfFlat, ArrayList<Settler> settlerArrayList) {
        this.numberOfFlat = numberOfFlat;
        this.settlerArrayList = settlerArrayList;
    }

    public int getNumberOfFlat() {
        return numberOfFlat;
    }

    public void setNumberOfFlat(int numberOfFlat) {
        this.numberOfFlat = numberOfFlat;
    }

    public ArrayList<Settler> getSettlerArrayList() {
        return settlerArrayList;
    }

    public void setSettlerArrayList(ArrayList<Settler> settlerArrayList) {
        this.settlerArrayList = settlerArrayList;
    }


}
