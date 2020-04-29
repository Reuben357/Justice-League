package models;


import java.util.ArrayList;

public class Squad {
    private String squadName;
    private int maxNum;
    private static ArrayList<Squad> instances = new ArrayList<>();

    private String cause;

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

    public int getMaxNum(){return maxNum;}

    public String getCause(){return cause;}



}

