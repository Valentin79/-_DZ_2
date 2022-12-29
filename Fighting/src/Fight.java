public class Fight {
    static void duel(Fighter fighter1, Fighter fighter2) {
        int hp1 = fighter1.getHealth();
        int hp2 = fighter2.getHealth();
        int round = 1;
        while (hp1 > 0 && hp2 > 0) {
            System.out.println("Round "+ round);

            hp2 = hp2 - (Weapon.fighterDamage(fighter1) - Armor.fighterProtection(fighter2));

            hp1 = hp1 - (Weapon.fighterDamage(fighter2) - Armor.fighterProtection(fighter1));

            System.out.println(fighter1 + "[" + hp1 + "hp]" +  fighter2+ "[" + hp2 + "hp]");
            round++;
        }
        if (hp1 <= 0) {
            System.out.println(fighter2 + "win");
        } else System.out.println(fighter1 + "win");

    }

}