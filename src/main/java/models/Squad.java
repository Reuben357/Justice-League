package models;

import java.util.ArrayList;

public class Squad {
    private String name;
    private int maxNum;
    private static ArrayList<Squad> instances = new ArrayList<>();

    private String cause;

    public Squad(String name, int maxNum, String cause){
        this.name= name;
        this.maxNum= maxNum;
        this.cause = cause;
        instances.add(this);
        
    }

    public String getName(){
        return name;
    }

    public int getMaxNum(){return maxNum;}

    public String getCause(){return cause;}

    public static ArrayList<Squad> getAll() {
        return instances;
    }


}

