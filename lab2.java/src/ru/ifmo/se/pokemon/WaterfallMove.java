package ru.ifmo.se.pokemon;

public class WaterfallMove extends PhysicalMove{
    public WaterfallMove() {
        super(Type.WATER, 80, 1);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).attack(0.2).turns(-1);
        var1.setCondition(var2);
    }
}
