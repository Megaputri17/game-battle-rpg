public class Main {
    public static void main(String[] args) {
        Character knight1 = new Knight("Arthur", 500, 100, 10);
        Character knight2 = new Knight("Bayu", 420, 124, 8);
        Character knight3 = new Knight("Aldo", 400, 115, 12);
        Character knight4 = new Knight("Deka", 390, 100, 7);

        Character dragon1 = new Dragon("Draco", 700, 150);
        Character dragon2 = new Dragon("Potter", 650, 140);
        Character dragon3 = new Dragon("Harry", 800, 130);
        Character dragon4 = new Dragon("Lani", 800, 200);

        knight1.attack(dragon1);
        knight1.useSkill(dragon1);
        dragon1.attack(knight1);
        dragon1.useSkill(knight1);

        knight1.attack(dragon2);
        knight1.useSkill(dragon2);
        dragon2.attack(knight1);
        dragon2.useSkill(knight1);

        knight1.attack(dragon3);
        knight1.useSkill(dragon3);
        dragon3.attack(knight1);
        dragon3.useSkill(knight1);

        knight1.attack(dragon4);
        knight1.useSkill(dragon4);
        dragon4.attack(knight1);
        dragon4.useSkill(knight1);


        knight2.attack(dragon1);
        knight2.useSkill(dragon1);
        dragon1.attack(knight2);
        dragon1.useSkill(knight2);

        knight2.attack(dragon2);
        knight2.useSkill(dragon2);
        dragon2.attack(knight2);
        dragon2.useSkill(knight2);

        knight2.attack(dragon3);
        knight2.useSkill(dragon3);
        dragon3.attack(knight2);
        dragon3.useSkill(knight2);

        knight2.attack(dragon4);
        knight2.useSkill(dragon4);
        dragon4.attack(knight2);
        dragon4.useSkill(knight2);


        knight3.attack(dragon1);
        knight3.useSkill(dragon1);
        dragon1.attack(knight3);
        dragon1.useSkill(knight3);

        knight3.attack(dragon2);
        knight3.useSkill(dragon2);
        dragon2.attack(knight3);
        dragon2.useSkill(knight3);

        knight3.attack(dragon3);
        knight3.useSkill(dragon3);
        dragon3.attack(knight3);
        dragon3.useSkill(knight3);

        knight3.attack(dragon4);
        knight3.useSkill(dragon4);
        dragon4.attack(knight3);
        dragon4.useSkill(knight3);


        knight4.attack(dragon1);
        knight4.useSkill(dragon1);
        dragon1.attack(knight4);
        dragon1.useSkill(knight4);

        knight4.attack(dragon2);
        knight4.useSkill(dragon2);
        dragon2.attack(knight4);
        dragon2.useSkill(knight4);

        knight4.attack(dragon3);
        knight4.useSkill(dragon3);
        dragon3.attack(knight4);
        dragon3.useSkill(knight4);

        knight4.attack(dragon4);
        knight4.useSkill(dragon4);
        dragon4.attack(knight4);
        dragon4.useSkill(knight4);


        System.out.println("Dragon 1 HP after being attacked: " + dragon1.getHp());
        System.out.println("Dragon 2 HP after being attacked: " + dragon2.getHp());
        System.out.println("Dragon 3 HP after being attacked: " + dragon3.getHp());
        System.out.println("Dragon 4 HP after being attacked: " + dragon4.getHp());


        Item potion = new Potion();
        knight1.useItem(potion);
        System.out.println("Knight 1 HP after using potion: " + knight1.getHp());
    }
}
