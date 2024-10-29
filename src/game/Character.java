package game;

import game.state.CharacterState;
import game.strategy.FightingStrategy;

public class Character {
    private CharacterState state;
    private FightingStrategy strategy;

    public Character(CharacterState initialState, FightingStrategy initialStrategy) {
        this.state = initialState;
        this.strategy = initialStrategy;
    }

    public void setState(CharacterState state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        System.out.println("Character attacks:");
        strategy.fight();
        state.attack();
    }
}
