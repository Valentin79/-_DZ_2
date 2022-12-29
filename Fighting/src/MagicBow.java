public class MagicBow extends Bow{
    private int magicDamage;

    public MagicBow(int damage, int magicDamage) {
        super(damage);
        this.magicDamage = magicDamage;
    }

    public int getMagicDamage() {
        return magicDamage;
    }
    @Override
    public int getDamage() {
        return super.getDamage() + getMagicDamage();
    }
}
