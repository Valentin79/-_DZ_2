import java.util.Map;

public class main {
    public static void main(String[] args) {
        NoviceSword noviceSword = new NoviceSword(4);
        MagicSword magicSword = new MagicSword(4, 3);
        NoviceBow noviceBow = new NoviceBow(4);
        MagicBow magicBow = new MagicBow(4, 3);
        SemiCompositArmor semiCompositArmor = new SemiCompositArmor(3);
        FullCompositArmor fullCompositArmor = new FullCompositArmor(5);
        LeatherArmor leatherArmor = new LeatherArmor(2);
        ChainArmor chainArmor = new ChainArmor(3);
        Swordsman swordsman1 = new Swordsman(noviceSword, semiCompositArmor, 50, true);
        Archer archer1 = new Archer(noviceBow, leatherArmor, 30, true);
        Swordsman swordsman2 = new Swordsman(magicSword, fullCompositArmor, 50, true);
        Archer archer2 = new Archer(magicBow, chainArmor, 30, true);


        Fight.duel(swordsman1,archer2);

    }
}
