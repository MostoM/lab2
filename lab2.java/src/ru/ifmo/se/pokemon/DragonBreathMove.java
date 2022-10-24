package ru.ifmo.se.pokemon;

public class DragonBreathMove extends SpecialMove{
    public DragonBreathMove() {
        super(Type.DRAGON, 60, 1);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.PARALYZE).chance(0.3).attack(0.0).turns(-1);
        var1.setCondition(var2);
    }
}
