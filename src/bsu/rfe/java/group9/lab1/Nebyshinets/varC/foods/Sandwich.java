package bsu.rfe.java.group9.lab1.Nebyshinets.varC.foods;

import bsu.rfe.java.group9.lab1.Nebyshinets.varC.Food;

public class Sandwich extends Food {
    private Food filling1;
    private Food filling2;

    private int calories;

    public Sandwich(Food f1, Food f2){
        super("бутерброд");
        filling1 = f1;
        filling2 = f2;
    }

    public Sandwich(Food f1){
        super("бутерброд");
        filling1 = f1;
        filling2 = null;
    }

    public void consume(){
        System.out.println(this + " съеден");
    }

    public int calculateCalories(){
        int calories = 100 + filling1.calculateCalories();
        if(filling2 != null){calories += filling2.calculateCalories();}
        return calories;
    }

    public boolean equals(Object arg0) {
        if(super.equals(arg0)){
            if(! (arg0 instanceof Sandwich)) return false;
            if( filling1.equals(((Sandwich) arg0).filling1) && filling2.equals(((Sandwich) arg0).filling2)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        String text = super.toString() + " с " + filling1 + "ом";
        if(filling2 != null){ text += " и " + filling2 + "ом";}
        return text;
    }
}
