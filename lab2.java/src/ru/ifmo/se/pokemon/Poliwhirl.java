package ru.ifmo.se.pokemon;

public class Poliwhirl extends Poliwag{
    public Poliwhirl(){
        super();
    }
    public Poliwhirl(String var1, int var2){
        super(var1, var2);
        this.addMove(new BellyDrumMove());
        this.setStats(65,65,65,50,50,90);
    }
}
