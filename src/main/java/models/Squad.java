package models;

import java.util.ArrayList;

public class Squad {
    private final String squadName;
    private final int maxNum;
    private static final ArrayList<Squad> instances = new ArrayList<>();

    private final String cause;

    public Squad(String squadName, int maxNum, String cause){
        this.squadName= squadName;
        this.maxNum= maxNum;
        this.cause = cause;
        
    }

    public static ArrayList<Squad> getAll() {
        return instances;
    }

    public String getName(){
        return squadName;
    }

    public int getMaxNum(){
        return maxNum;
    }

    public String getCause(){
        return cause;
    }



}

