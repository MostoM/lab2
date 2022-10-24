package ru.ifmo.se.pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Zekrom p1 = new Zekrom("Zekrom", 1);
        Drowzee p2 = new Drowzee("Drowzee", 1);
        Hypno p3 = new Hypno("Hypno", 1);
        Poliwag p4 = new Poliwag("Poliwag", 1);
        Poliwhirl p5 = new Poliwhirl("Poliwhirl", 1);
        Poliwrath p6 = new Poliwrath("Poliwrath", 1);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p6);
        b.go();

    }
}
