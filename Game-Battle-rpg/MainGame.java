public class MainGame {
    public static void main(String[] args) {

        Hero hero = new Hero("Hero", "Race", 1, 100, 50, 20, "wp");
        Foe foe = new Foe("Foe", "Race", 1, 150, 70, 30, "Skill");

        hero.usePotion(30);
        hero.useElixir(50, 30);
        hero.useEther(20);

        foe.usePotion(20);
        foe.useElixir(40, 20);
        foe.useEther(10);

        System.out.println("Hero HP : " + hero.getCurrentHP());
        System.out.println("Foe HP : " + foe.getCurrentHP());
    }
}