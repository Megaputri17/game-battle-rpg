abstract class StatusEffect {
    protected String name;
    protected int duration;

    public StatusEffect(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public abstract void applyEffect(Character target);
}

class WeakStatus extends StatusEffect {
    public WeakStatus() {
        super("Weak", 5);
    }

    @Override
    public void applyEffect(Character target) {
        System.out.println(target.getName() + " is now weak!");
        // Implement effect of weak status
    }
}
