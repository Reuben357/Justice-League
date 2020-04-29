/*package models;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String mName;
    private int mAge;
    private String mSpecialPowers;
    private String mWeakness;
    private static List<Hero> instances = new ArrayList<Hero>();
    private int id;

    public Hero(String name, int age, String specialpowers, String weakness ){
        this.mName = name;
        this.mAge = age;
        this.mSpecialPowers = specialpowers;
        this.mWeakness = weakness;
        this.id = instances.size();
    }

    public String getName(){
        return mName;
    }

    public int getAge(){
        return mAge;
    }

    public String getSpecialPowers(){
        return mSpecialPowers;
    }

    public String getWeakness(){
        return mWeakness;
    }

    public static List<Hero> getAll(){
        return instances;
    }

    public int getId(){
        return id;
    }

    public static Hero findById(int id){
        return instances.get(id-1);
    }

    public void deleteHero(int idOfHeroToDelete){
        instances.remove(id-1);
    }

    public void update(String newName, int newAge, String newPower, String newWeakness) {
        update("", 0, "", "");
    }
}

 */

package models;
import java.util.ArrayList;
import java.util.Objects;

public class Hero {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age &&
                id == hero.id &&
                Objects.equals(name, hero.name) &&
                Objects.equals(power, hero.power) &&
                Objects.equals(weakness, hero.weakness);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, power, weakness, id);
    }

    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, int age, String power, String weakness){

        this.name=name;
        this.age =age;
        this.power=power;
        this.weakness=weakness;
        instances.add(this);
    }
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public static ArrayList<Hero>getAll(){
        return instances;
    }

    public static void clearAllHero(){
        instances.clear();
    }

    public void setId( int id){
        this.id = id;
    }

    public static Hero findById(int id){
        return instances.get(id-1);
    }

    public void update(String name, int age,String power,String weakness){
        this.name =name;
        this.age=age;
        this.power= power;
        this.weakness=weakness;
    }

    public void deleteById(int id){
        instances.remove(id-1);
    }

    public String getPower(){
        return power;
    };
    public String getWeakness(){
        return weakness;
    }

    public int getId(){
        return id;
    }
}


