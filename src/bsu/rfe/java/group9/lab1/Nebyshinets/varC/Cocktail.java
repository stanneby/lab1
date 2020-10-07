package bsu.rfe.java.group9.lab1.Nebyshinets.varC;

public class Cocktail extends Food{
    private String drink;
    private String fruit;

    public Cocktail(String drink, String fruit){
        super("коктейль");
        this.drink = drink;
        this.fruit = fruit;
    }

    public void consume() { System.out.println(this + " выпит");}

    public String getDrink(){ return drink; }
    public void setDrink(String drink){
        this.drink = drink;
    }

    public String getFruit(){
        return fruit;
    }
    public void setFruit(String fruit){
        this.fruit = fruit;
    }

    public boolean equals(Object arg0) {
        if(super.equals(arg0)){
            if(! (arg0 instanceof Cocktail)) return false;
            if( drink.equals(((Cocktail) arg0).drink) && fruit.equals(((Cocktail) arg0).fruit)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return super.toString() + " с " + drink + " и " + fruit;
    }
}
