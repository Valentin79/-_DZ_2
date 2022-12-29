abstract class Weapon {
    private int damage;

    public Weapon(int damage) {
        this.damage = damage;
    }

    public int getDamage() {

        return damage;
    }

    public static int fighterDamage(Fighter fighter){
        return fighter.getWeapon().getDamage();
    }



}
