package ru.ifmo.se.pokemon;

public class Poliwrath extends Poliwhirl{
    public Poliwrath(){
        super();
    }

    public Poliwrath(String var1, int var2){
        super(var1, var2);
        this.addMove(new PsychicMove());
        this.setStats(90,95,95,70,90,70);
    }
}
