package bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods;

import bsu.rfe.java.group9.lab1.Nebyshinets.varC.Food;

public class Butter extends Food {
    public Butter(){
        super("масло");
    }

    public void consume(){ System.out.println(this + "съедено"); }

    public int calculateCalories(){
        return 50;
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(arg0 instanceof Butter){
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

