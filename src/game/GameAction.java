package game;

public abstract class GameAction {
    public final void executeAction() {
        System.out.println("Executing action...");
        action();
        System.out.println("Action completed.");
    }

    protected abstract void action();
}

class AttackAction extends GameAction {
    protected void action() {
        System.out.println("Executing attack action.");
    }
}

class DefendAction extends GameAction {
    protected void action() {
        System.out.println("Executing defend action.");
    }
}

class HealAction extends GameAction {
    protected void action() {
        System.out.println("Executing heal action.");
    }
}
