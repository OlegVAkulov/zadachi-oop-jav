package ru.javabase.oop.zadachi.city.object;

import java.util.ArrayList;

public class House {
    private String address;
    ArrayList<Flat> flatArrayList = new ArrayList<>();

    public void addFlat(Flat flat) {
        flatArrayList.add(flat);
    }

    public House() {
    }

    public House(String address, ArrayList<Flat> flatArrayList) {
        this.address = address;
        this.flatArrayList = flatArrayList;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Flat> getFlatArrayList() {
        return flatArrayList;
    }

    public void setFlatArrayList(ArrayList<Flat> flatArrayList) {
        this.flatArrayList = flatArrayList;
    }


}

