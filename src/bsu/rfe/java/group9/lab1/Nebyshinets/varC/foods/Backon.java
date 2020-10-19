package bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods;

import bsu.rfe.java.group9.lab1.Nebyshinets.varC.Food;

public class Backon extends Food {
    public Backon(){
        super("бекон");
    }

    public void consume(){ System.out.println(this + "съеден"); }

    public int calculateCalories(){
        return 270;
    }

    public boolean equals(Object arg0){
        if(super.equals(arg0)){
            if(arg0 instanceof Backon){
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


