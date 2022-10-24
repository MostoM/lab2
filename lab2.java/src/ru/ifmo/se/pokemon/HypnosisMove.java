package ru.ifmo.se.pokemon;
public class HypnosisMove extends StatusMove{
    public HypnosisMove() {
        super(Type.PSYCHIC, 0, 0.6);
    }

    public void applyOppEffects(Pokemon var1){
        Effect var2 = (new Effect()).condition(Status.SLEEP).chance(1).attack(0.0).turns(-1);
        var1.setCondition(var2);
    }
}
