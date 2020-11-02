package com.company;

public class Main {

    public static void main (String[] args) {
        Samsung s = new Samsung();
        Xiaomi x = new Xiaomi();
        x.setColor("Black");
        x.setCost(800);
        x.setRAM("16GB");
        x.setAndroidVersion("Android 7");

        s.setColor("White");
        s.setCost(1000);
        s.setRAM("4GB");
        s.setAndroidVersion("Android 5");
        System.out.println("Samsung mobile details:");
        System.out.println("Cost: " + s.getCost());
        System.out.println("Color: " + s.getColor());
        System.out.println("RAM: " + s.getRAM());
        System.out.println("Android version: " + s.getAndroidVersion());
        System.out.println(" ");

        System.out.println("Xiaomi mobile details:");
        System.out.println("Cost: " + x.getCost());
        System.out.println("Color: " + x.getColor());
        System.out.println("RAM: " + x.getRAM());
        System.out.println("Android version: " + x.getAndroidVersion());
    }
}