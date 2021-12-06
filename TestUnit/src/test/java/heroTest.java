import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import rpg_lab.Hero;
import rpg_lab.Target;
import rpg_lab.Weapon;

public class heroTest {

    private static final int TARGET_XP = 100;
    private static final String HERO_NAME = "Name";

    private Hero hero;


    @Before
    public void setUp() {
        Weapon mock = Mockito.mock(Weapon.class);
        this.hero = new Hero("Thor", mock);
    }

    @Test
    public void testHeroGainsXPWhenTargetDies() {
        Target mockedTarget = Mockito.mock(Target.class);

        Mockito.when(mockedTarget.isDead()).thenReturn(true);
        Mockito.when(mockedTarget.giveExperience()).thenReturn(100);

        this.hero.attack(mockedTarget);

        Assert.assertEquals(TARGET_XP, hero.getExperience());
    }

    @Test
    public void testUponTargetAttackWhileTargetIsStillAliveHeroGetsNoXP() {
        Target mockedTarget = Mockito.mock(Target.class);
        Mockito.when(mockedTarget.isDead()).thenReturn(true);

        this.hero.attack(mockedTarget);

        Assert.assertEquals(0, hero.getExperience());
    }
}
