public class MagicSword extends Sword{
    private int magicDamage;

    public MagicSword(int damage, int magicDamage) {
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
