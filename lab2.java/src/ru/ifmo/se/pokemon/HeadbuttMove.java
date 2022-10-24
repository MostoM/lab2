package ru.ifmo.se.pokemon;

public class HeadbuttMove extends PhysicalMove{
    public HeadbuttMove(){
        super(Type.NORMAL, 70, 1);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.NORMAL).attack(0.3).turns(-1);
        var1.setCondition(var2);
    }
}
