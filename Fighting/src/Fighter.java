abstract class Fighter {
    private Weapon weapon;
    private Armor armor;
    private int health;
    private boolean isAlive;

    public Fighter(Weapon weapon, Armor armor, int health, boolean isAlive) {
        this.weapon = weapon;
        this.armor = armor;
        this.health = health;
        this.isAlive = isAlive;
    }

    public void attak(){}
    public void takeDamage(){}

    public Weapon getWeapon() {
        return weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }


    @Override
    public String toString() {
        return "[" + Fighter.super.getClass().getName()+ "]";
    }
}
