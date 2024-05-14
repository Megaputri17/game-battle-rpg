class Dragon extends Foe {
    public Dragon(String name, int hp, int mp) {
        super(name, hp, mp);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName());
        target.setHp(target.getHp() - 40);
    }

    @Override
    public void useSkill(Character target) {
        if (mp >= 30) {
            System.out.println(name + " uses fire skill on " + target.getName());
            target.setHp(target.getHp() - 80);
            mp -= 30;
            target.applyStatusEffect(new WeakStatus());
        } else {
            System.out.println(name + " does not have enough MP!");
        }
    }

    @Override
    public void applyStatusEffect(StatusEffect effect) {
        effect.applyEffect(this);
    }

    @Override
    public void applyFoeSpecificStatus() {
        // Implement specific status effect for Dragon
    }
}
