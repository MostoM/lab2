package ru.ifmo.se.pokemon;

public class Zekrom extends Pokemon {
    public Zekrom(){
        super();
    }
    public Zekrom(String var1, int var2){
        super(var1, var2);
        this.addType(Type.DRAGON);
        this.addType(Type.ELECTRIC);
        this.addMove(new ThunderFangMove());
        this.addMove(new DragonBreathMove());
        this.addMove(new DragonRageMove());
        this.addMove(new SteelWingMove());
        this.setStats(100,150,120,120,100,90);
    }
}