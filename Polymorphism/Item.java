abstract class Item {
    protected String name;

    public Item(String name) {
        this.name = name;
    }

    public abstract void use(Character target);
}

class Potion extends Item {
    public Potion() {
        super("Potion");
    }

    @Override
    public void use(Character target) {
        target.setHp(target.getHp() + 100);
        System.out.println(target.getName() + " used a Potion. HP increased by 100.");
    }
}

class Ether extends Item {
    public Ether() {
        super("Ether");
    }

    @Override
    public void use(Character target) {
        target.setMp(target.getMp() + 100);
        System.out.println(target.getName() + " used an Ether. MP increased by 100.");
    }
}

class Elixir extends Item {
    public Elixir() {
        super("Elixir");
    }

    @Override
    public void use(Character target) {
        target.setHp(target.getHp() + 150);
        target.setMp(target.getMp() + 100);
        System.out.println(target.getName() + " used an Elixir. HP increased by 150 and MP increased by 100.");
    }
}
