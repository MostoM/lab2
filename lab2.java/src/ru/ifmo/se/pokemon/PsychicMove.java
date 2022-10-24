package ru.ifmo.se.pokemon;

public class PsychicMove extends SpecialMove{
    public PsychicMove() {
        super(Type.PSYCHIC, 90, 1);
    }
    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).attack(0.1).turns(-1);
        var1.setCondition(var2);
    }
}
