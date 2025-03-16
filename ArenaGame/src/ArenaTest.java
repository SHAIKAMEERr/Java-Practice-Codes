import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest
{

    @Test
    public void testPlayerInitialization()
    {
        Player player = new Player(100, 10, 10);
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getStrength());
        assertEquals(15, player.getAttack());
    }

    @Test
    public void testFightLogic()
    {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Fight fight = new Fight(playerA, playerB);

        fight.execute();
        assertTrue(playerB.getHealth() < 100);
    }

    @Test
    public void testPlayerReductionInHealth()
    {
        Player player = new Player(100, 10, 10);
        player.reduceHealth(10);
        assertEquals(90, player.getHealth());
    }

    @Test
    public void testFightOutcome()
    {
        Player playerA = new Player(50, 5, 10);
        Player playerB = new Player(100, 10, 5);
        Arena arena = new Arena(playerA, playerB);
        arena.startFight();
        assertTrue(playerA.isAlive() || playerB.isAlive());
        assertFalse(playerA.isAlive() && playerB.isAlive());
    }

    @Test
    public void testPlayerDeath()
    {
        Player player = new Player(1, 5, 10);
        player.reduceHealth(1);
        assertFalse(player.isAlive());
    }
}