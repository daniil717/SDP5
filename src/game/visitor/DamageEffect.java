package game.visitor;

import game.Character;

public class DamageEffect implements EffectVisitor {
    public void applyBoost(Character character) {
    }

    public void applyDamage(Character character) {
        System.out.println("Applying damage to character");
    }
}
