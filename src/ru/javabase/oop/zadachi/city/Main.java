package ru.javabase.oop.zadachi.city;

import ru.javabase.oop.zadachi.city.object.City;
import ru.javabase.oop.zadachi.city.object.Flat;
import ru.javabase.oop.zadachi.city.object.House;
import ru.javabase.oop.zadachi.city.object.Settler;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Settler settler1 = new Settler("Ivan");
        Settler settler2 = new Settler("Petr");
        Settler settler3 = new Settler("Tatyana");
        Settler settler4 = new Settler("Oleg");
        Settler settler5 = new Settler("Semen");
        Settler settler6 = new Settler("Marya");
        Settler settler7 = new Settler("Ludmila");
        Settler settler8 = new Settler("Marfa");
        Settler settler9 = new Settler("Avdotya");

        ArrayList<Settler> settlerArrayList1 = new ArrayList<>();
        ArrayList<Settler> settlerArrayList2 = new ArrayList<>();
        ArrayList<Settler> settlerArrayList3 = new ArrayList<>();
        ArrayList<Settler> settlerArrayList4 = new ArrayList<>();

        Flat flat1 = new Flat(2, settlerArrayList1);
        flat1.addSettler(settler1);
        flat1.addSettler(settler2);

        Flat flat2 = new Flat(1, settlerArrayList2);
        flat2.addSettler(settler3);
        flat2.addSettler(settler4);

        ArrayList<Flat> flatArrayList1 = new ArrayList<>();

        House house1 = new House("Lenina 21",flatArrayList1);
        house1.addFlat(flat1);
        house1.addFlat(flat2);

        Flat flat3 = new Flat(1,settlerArrayList3);
        flat3.addSettler(settler5);
        flat3.addSettler(settler6);

        Flat flat4 = new Flat(2,settlerArrayList4);
        flat4.addSettler(settler7);
        flat4.addSettler(settler8);

        ArrayList<Flat> flatArrayList2 = new ArrayList<>();

        House house2 = new House("Mira 36",flatArrayList2);
        house2.addFlat(flat3);
        house2.addFlat(flat4);

        ArrayList<House> houseArrayList = new ArrayList<>();
        City city = new City("Lipetsk",houseArrayList);
        city.addHouse(house1);
        city.addHouse(house2);

        city.showSettlersList();

        flat1.addSettler(settler9);
        flat1.addSettler(settler1);




    }
}
