package bsu.rfe.java.group9.lab1.Nebyshinets.varC;

public class Sandwich extends Food {
    private String filling1 = null;
    private String filling2 = null;

    public Sandwich(String filling1, String filling2){
        super("бутерброд");
        this.filling1 = filling1;
        this.filling2 = filling2;
    }

    public void consume(){
        System.out.println(this + " съеден");
    }

    public String getFilling1(){ return filling1; }
    public void setFilling1(String filling1){
        this.filling1 = filling1;
    }

    public String getFilling2(){
        return filling2;
    }
    public void setFilling2(String filling2){
        this.filling2 = filling2;
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
        return super.toString() + " с " + filling1 + " и " + filling2;
    }
}
