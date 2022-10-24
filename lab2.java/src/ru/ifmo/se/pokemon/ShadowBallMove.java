package ru.ifmo.se.pokemon;

public class ShadowBallMove extends SpecialMove{
    public ShadowBallMove(){
        super(Type.GHOST, 80, 1);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.NORMAL).attack(0.2).turns(-1);
        var1.setCondition(var2);
    }
}
