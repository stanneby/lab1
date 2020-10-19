package bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods;

import bsu.rfe.java.group9.lab1.Nebyshinets.varC.Food;

public class Cheese extends Food {
    public Cheese(){
        super("сыр");
    }

    public void consume(){ System.out.println(this + "съеден"); }

    public int calculateCalories(){
        return 200;
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(arg0 instanceof Cheese){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String tiString(){ return super.toString(); }
}
