public class Foe extends Character {

    private String skill;
    private int attackPoint;

    public Foe(String name, String race, int level, int maxHP, int maxMP, int armor, String skill) {
        super(name, race, level, maxHP, maxMP, armor);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    
    public int getAttackPoint() {
        return attackPoint;
    }
    
    public void setAttackPoint () {    
    }

    public void attack(Character opponent) {
    }
}