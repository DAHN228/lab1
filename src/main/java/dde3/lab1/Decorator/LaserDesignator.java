package dde3.lab1.Decorator;

import dde3.lab1.Hierarchy.Firearm;

public class LaserDesignator extends Decorator {
    Firearm firearm;

    public LaserDesignator( Firearm firearm){
        this.firearm = firearm;
    }
    public double getPrice(){
        return firearm.getPrice()+2500.0;
    }
    public double getWeight(){
        return firearm.getWeight()+0.150;
    }
    public String getName() { return firearm.getName() + "+LaserDesignator"; }
    public double getCaliber(){return  firearm.getCaliber();}

}