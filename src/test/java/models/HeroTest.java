package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void testForHeroes() throws Exception{
        Hero myHeroes = new Hero("Flash",22, "Speed", "Stress");
            assertEquals(true, myHeroes instanceof Hero);
    }

    @Test
    public void testForAge() throws Exception {
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
            assertEquals(22, myHeroes.getAge());
    }

    @Test
    public void testForSpecialPowers() throws Exception{
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
            assertEquals("Speed",myHeroes.getPower());
    }

    @Test
    public void testForWeakness() throws Exception{
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
            assertEquals("Stress", myHeroes.getWeakness());
    }

    @Test
    public void testForId() {
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
        assertEquals(0, myHeroes.getId());
    }

    @Test
    public void testForName() throws Exception {
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
            assertEquals("Flash", myHeroes.getName());
    }
    @Test
    public void testForSquadName() throws Exception{
        Squad mySquad = new Squad("Justice League",5,"Stop computer theft");
        assertEquals("Justice League",mySquad.getName());
    }


}
