import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Dummy;

public class dummyTest {
    private static final int DUMMY_HEALTH = 100;
    private static final int DUMMY_XP = 100;
    private static final int DEAD_DUMMY_HEALTH = 0;
    private static final int ATTACK_POINT = 10;


    private Dummy dummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {

        this.dummy = new Dummy(DUMMY_HEALTH, DUMMY_XP);
        this.deadDummy = new Dummy(DEAD_DUMMY_HEALTH, DUMMY_XP);
    }


    @Test
    public void testDummyLoseHealthWhenAttack() {

        int expectedPoint = dummy.getHealth() - ATTACK_POINT;
        dummy.takeAttack(ATTACK_POINT);

        Assert.assertEquals(expectedPoint, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyThrowsExceptionIfAttacked() {

        deadDummy.takeAttack(ATTACK_POINT);
    }

    @Test
    public void testDeadDummyGiveXP() {

        int giveExperience = deadDummy.giveExperience();

        Assert.assertEquals(DUMMY_XP, giveExperience);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyCannotGiveXp() {

        dummy.giveExperience();
    }
}
