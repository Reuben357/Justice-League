package models;

import java.util.ArrayList;
import java.util.List;

public class Heroe {
    private String mName;
    private int mAge;
    private String mSpecialPowers;
    private String mWeakness;
    private static List<Heroe> instances = new ArrayList<Heroe>();
    private int id;

    public Heroe(String name, int age, String specialpowers, String weakness ){
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

    public static List<Heroe> getAll(){
        return instances;
    }

    public int getId(){
        return id;
    }

    public static Heroe find(int id){
        return instances.get(id-1);
    }
}
