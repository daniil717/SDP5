package game.visitor;

import game.Character;

public class BoostEffect implements EffectVisitor {
    public void applyBoost(Character character) {
        System.out.println("Boosting character's stats.");
    }

    public void applyDamage(Character character) {
    }
}
