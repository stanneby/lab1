package bsu.rfe.java.group9.lab1.Nebyshinets.varC;

public class Dessert extends Food{
    private String component1;
    private String component2;

    public Dessert(String component1, String component2){
        super("Десерт");
        this.component1 = component1;
        this.component2 = component2;
    }

    public void consume(){ System.out.println( this + " съеден"); }

    public String getComponent1(){ return component1; }
    public void setComponent1(String component1){
        this.component1 = component1;
    }

    public String getComponent2(){
        return component2;
    }
    public void setComponent2(String component2){
        this.component2 = component2;
    }

    public boolean equals(Object arg0) {
        if(super.equals(arg0)){
            if(! (arg0 instanceof Dessert)) return false;
            if( component1.equals(((Dessert) arg0).component1) && component2.equals(((Dessert) arg0).component2)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public String toString() {
        return super.toString() + " из " + component1 + " и " + component2;
    }
}
