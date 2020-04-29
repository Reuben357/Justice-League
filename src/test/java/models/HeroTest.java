package models;

import org.junit.Test;
import static org.junit.Assert.*;

public class HeroesTest {
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
            assertEquals("Speed",myHeroes.getSpecialPowers());
    }

    @Test
    public void testForWeakness() throws Exception{
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
            assertEquals("Stress", myHeroes.getWeakness());
    }

    @Test
    public void testForId() {
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
        assertEquals(1, myHeroes.getId());
    }

    @Test
    public void testForName() throws Exception {
        Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
            assertEquals("Flash", myHeroes.getName());
    }

    @Test
    public void all(){
        Squad firstSquad = new Squad("Justice League");
        Squad secondSquad = new Squad("Young Justice");
        assertTrue(Squad.all().contains(firstSquad));
        assertTrue(Squad.all().contains(secondSquad));
    }

    @Test
    public void getId_HeroesInstantiateWithAnID_1() throws Exception{
        Squad.clear();
        Squad newSquad = new Squad("Justice League");
        assertEquals(0, newSquad.getId());
    }

    @Test
    public void getSquadName() throws Exception{
        Squad newSquad = new Squad("Justice League");
        assertEquals("Justice League", newSquad.getName());
    }

    @Test
    public void testForAddingHeroes(){
        Squad newSquad = new Squad("Justice League");
    Hero myHeroes = new Hero("Flash", 22, "Speed", "Stress");
    newSquad.addHeroes(myHeroes);
    assertTrue(newSquad.getHeroes().contains(myHeroes));
}

}
