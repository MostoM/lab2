package ru.ifmo.se.pokemon;

public class DragonRageMove extends SpecialMove{
    public DragonRageMove() {
        super(Type.DRAGON, 0, 1);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.NORMAL).chance(1).attack(40).turns(-1);
        var1.setCondition(var2);
    }
}
