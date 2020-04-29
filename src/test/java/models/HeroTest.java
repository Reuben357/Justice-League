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


}
