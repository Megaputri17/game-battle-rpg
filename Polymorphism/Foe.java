abstract class Foe extends Character {
    public Foe(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    public abstract void applyFoeSpecificStatus();
}
