import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class heroTest {

    private static final int TARGET_XP = 100;
    private static final String HERO_NAME = "Name";

    @Test
    public void testHeroGainsXPWhenTargetDies(){
        Weapon weapon = new Weapon() {
            @Override
            public int getAttackPoints() {
                return 0;
            }

            @Override
            public int getDurabilityPoints() {
                return 10;
            }

            @Override
            public void attack(Target target) {

            }
        };

        Target target = new Target() {
            @Override
            public int getHealth() {
                return 0;
            }

            @Override
            public void takeAttack(int attackPoints) {

            }

            @Override
            public int giveExperience() {
                return TARGET_XP;
            }

            @Override
            public boolean isDead() {
                return true;
            }
        };

        Hero hero = new Hero(HERO_NAME,weapon);

        hero.attack(target);

        Assert.assertEquals(TARGET_XP,hero.getExperience());
    }
}
