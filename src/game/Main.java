package game;

import game.state.*;
import game.strategy.*;
import game.visitor.*;

public class Main {
    public static void main(String[] args) {
        Character character = new Character(new NormalState(), new MeleeStrategy());

        character.attack();

        character.setState(new PoweredUpState());
        character.setStrategy(new RangedStrategy());
        character.attack();

        GameAction attackAction = new AttackAction();
        attackAction.executeAction();

        EffectVisitor boostEffect = new BoostEffect();
        boostEffect.applyBoost(character);

        EffectVisitor damageEffect = new DamageEffect();
        damageEffect.applyDamage(character);
    }
}
