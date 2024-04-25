public class Weapon {

    private String name;
    private int attackPoint;

    public Weapon(String name, int attackPoint) {
        this.name = name;
        this.attackPoint = attackPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }
}