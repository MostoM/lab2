package ru.ifmo.se.pokemon;

public class ThunderFangMove extends PhysicalMove{
    public ThunderFangMove() {
        super(Type.ELECTRIC, 65, 0.95);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.PARALYZE).chance(0.1).attack(0.0).turns(-1);
        var1.setCondition(var2);
    }
}
