import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class axeTest {
    private static final int AXE_ATTACK = 10;
    private static final int AXE_DURABILITY = 10;
    private static final int AXE_DURABILITY_AFTER_ATTACK = AXE_DURABILITY-1;
    private static final int BROKEN_AXE_DURABILITY = 0;
    private static final int DUMMY_HEALTH = 100;
    private static final int DUMMY_XP = 100;

    private Axe axe;
    private Axe brokenAxe;
    private Dummy dummy;

    @Before
    public void setUp(){
        this.axe = new Axe(AXE_ATTACK,AXE_DURABILITY);
        this.brokenAxe = new Axe(AXE_ATTACK,BROKEN_AXE_DURABILITY);
        this.dummy = new Dummy(DUMMY_HEALTH,DUMMY_XP);
    }

    @Test
    public void testAxeLoseDurabilityAfterAttack() {

        axe.attack(dummy);

        Assert.assertEquals(AXE_DURABILITY_AFTER_ATTACK, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testBrokenAxeAttackThrowsException(){

        brokenAxe.attack(dummy);
    }
}
