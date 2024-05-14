
abstract class Hero extends Character {
    protected int level;

    public Hero(String name, int hp, int mp, int level) {
        super(name, hp, mp);
        this.level = level;
    }

    @Override
    public void useItem(Item item) {
        item.use(this);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
