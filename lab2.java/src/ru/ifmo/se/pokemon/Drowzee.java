package ru.ifmo.se.pokemon;

public class Drowzee extends Pokemon{
    public Drowzee(){
        super();
    }
    public Drowzee(String var1, int var2){
        super(var1, var2);
        this.addType(Type.PSYCHIC);
        this.addMove(new DoubleTeamMove());
        this.addMove(new ShadowBallMove());
        this.addMove(new HeadbuttMove());
        this.setStats(60,48,45,43,90,42);
    }
}
