class Knight extends Hero {
    public Knight(String name, int hp, int mp, int level) {
        super(name, hp, mp, level);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName());
        target.setHp(target.getHp() - 50);
    }

    @Override
    public void useSkill(Character target) {
        if (mp >= 20) {
            System.out.println(name + " uses skill on " + target.getName());
            target.setHp(target.getHp() - 100);
            mp -= 20;
        } else {
            System.out.println(name + " does not have enough MP!");
        }
    }

    @Override
    public void applyStatusEffect(StatusEffect effect) {
        effect.applyEffect(this);
    }
}
