package ru.javabase.oop.zadachi.city.object;

import java.util.ArrayList;

public class City {
    private String nameOfCity;
    ArrayList<House> houseArrayList = new ArrayList<>();

    public City() {
    }

    public City(String nameOfCity, ArrayList<House> houseArrayList) {
        this.nameOfCity = nameOfCity;
        this.houseArrayList = houseArrayList;
    }

    public String getNameOfCity() {
        return nameOfCity;
    }

    public void setNameOfCity(String nameOfCity) {
        this.nameOfCity = nameOfCity;
    }

    public ArrayList<House> getHouseArrayList() {
        return houseArrayList;
    }

    public void setHouseArrayList(ArrayList<House> houseArrayList) {
        this.houseArrayList = houseArrayList;
    }
    public void showSettlersList(){
        System.out.println("City: " + nameOfCity);

        for (House h:houseArrayList){
            System.out.println("House: " + h.getAddress());
            for (Flat f: h.flatArrayList){
            System.out.println("-Flat: " + f.getNumberOfFlat());
            for (Settler s:f.getSettlerArrayList()){
                System.out.println("--Settler: " + s.getNameOfSettler());
            }
            }
            System.out.println();
        }

    }
    public void addHouse(House house){
        houseArrayList.add(house);
    }


}
