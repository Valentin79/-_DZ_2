abstract class Armor {
    private int protection;

    public Armor(int protection) {
        this.protection = protection;
    }

    public int getProtection() {
        return protection;
    }

    public static int fighterProtection(Fighter fighter){
        return fighter.getArmor().getProtection();
    }
}
