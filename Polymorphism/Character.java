abstract class Character {
    protected String name;
    protected int hp;
    protected int mp;

    public Character(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public abstract void attack(Character target);
    public abstract void useSkill(Character target);
    public abstract void applyStatusEffect(StatusEffect effect);

    public void useItem(Item item) {
        item.use(this);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
