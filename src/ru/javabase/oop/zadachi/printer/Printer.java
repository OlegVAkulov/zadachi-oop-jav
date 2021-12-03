package ru.javabase.oop.zadachi.printer;

public class Printer implements IPrinter {
    private int paintVolume;

    @Override
    public int paintVolume() {
        return paintVolume;
    }

    public int getPaintVolume() {
        return paintVolume;
    }


    public Printer(int paintVolume) {
        this.paintVolume = paintVolume;
    }

    public Printer() {
    }

    @Override
    public void print(String text) {
//        System.out.println("На печать отправлен текст: " + text +
//                ", длина: " + text.length() + " символов");
        String result = String.format("На печать отправлен текст: %s , длина: %d символов", text, text.length());
        System.out.println(result);
        if (text.length() <= paintVolume) {
            paintVolume -= text.length();
            System.out.println("Текст распечатан: " + text +
                    ", у принтера осталось краски на " + paintVolume + " символа");

        } else {
            System.out.println("Не хватает краски! Всего краски в принтере на " + paintVolume + " символа");
        }


    }

    @Override
    public void charge(int charge) {
        System.out.println("Принтер пополнен на длину текста: " + charge + " всего краски в принтере: " + (paintVolume + charge));
        paintVolume += charge;
    }
}
