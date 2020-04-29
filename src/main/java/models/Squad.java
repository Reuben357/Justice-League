package models;

import java.util.ArrayList;
import java.util.List;

public class HeroSquads {
    private String mName;
    private static List<HeroSquads> instances = new ArrayList<HeroSquads>();
    private List<Hero> mHero;
    private int id;

    public HeroSquads(String name){
        this.mName = name;
        this.id = instances.size();
        instances.add(this);
        this.mHero = new ArrayList<Hero>();
    }

    public String getName(){
        return mName;
    }

    public static List<HeroSquads> getAll(){
        return instances;
    }

    public static void clear() {
        instances.clear();
    }

    public int getId(){
        return id;
    }

    public static HeroSquads find(int id){
        return instances.get(id-1);
    }

    public List<Hero>getHeroes(){
        return mHero;
    }

  public void addHeroes(Hero heroes){
     mHero.add(heroes);
   }
}
