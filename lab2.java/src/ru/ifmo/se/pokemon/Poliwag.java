package ru.ifmo.se.pokemon;

public class Poliwag extends Pokemon{
    public Poliwag(){
        super();
    }
    public Poliwag(String var1, int var2){
        super(var1, var2);
        this.addType(Type.WATER);
        this.addMove(new WaterfallMove());
        this.addMove(new HypnosisMove());
        this.setStats(40,50,40,40,40,90);
    }
}
