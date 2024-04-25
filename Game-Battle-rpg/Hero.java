public class Hero extends Character {
   
    private String weaponType;
    private int attackPoint;

    public Hero(String name, String race, int level, int maxHP, int maxMP, int armor, String weaponType) {
        super(name, race, level, maxHP, maxMP, armor);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint){
        this.attackPoint = attackPoint;
    }

    public void attack(Character opponent) {
    }
}