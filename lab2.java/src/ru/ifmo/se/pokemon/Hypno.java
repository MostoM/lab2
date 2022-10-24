package ru.ifmo.se.pokemon;

public class Hypno extends Drowzee{
    public Hypno(){
        super();
    }

    public Hypno(String var1, int var2){
        super(var1, var2);
        this.addType(Type.PSYCHIC);
        this.addMove(new FocusBlastMove());
        this.setStats(85,73,70,73,115,67);
    }
}
