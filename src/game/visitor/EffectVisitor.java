package game.visitor;

import game.Character;

public interface EffectVisitor {
    void applyBoost(Character character);
    void applyDamage(Character character);
}
