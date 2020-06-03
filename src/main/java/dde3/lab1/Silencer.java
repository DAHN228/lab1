package dde3.lab1;

public class Silencer extends Decorator {
    Firearm firearm;

    public Silencer( Firearm firearm){
        this.firearm = firearm;
    }
    public double getPrice(){
        return firearm.getPrice()+2000;
    }
    public double getWeight(){
        return firearm.getWeight()+0.1;
    }
    public String getName() {
        return firearm.getName() + "+silencer";
    }
    public double getCaliber(){return  firearm.getCaliber();}

}

