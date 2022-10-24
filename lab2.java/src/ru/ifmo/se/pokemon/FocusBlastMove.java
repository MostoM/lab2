package ru.ifmo.se.pokemon;

public class FocusBlastMove extends SpecialMove{
    public FocusBlastMove(){
        super(Type.FIGHTING, 120, 0.7);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.NORMAL).attack(0.1).turns(-1);
        var1.setCondition(var2);
    }
}
