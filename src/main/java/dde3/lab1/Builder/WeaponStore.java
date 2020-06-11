package dde3.lab1.Builder;

import dde3.lab1.Hierarchy.*;

public class WeaponStore {
    protected String name;
    protected Pistol pistol = null;
    protected Rifle rifle = null;

    public void showAssortment(){
        System.out.println("Welcome to " + name);
        if(pistol != null) System.out.println(pistol.toString());
        if(rifle!= null)System.out.println(rifle.toString());
    }
    public static class Builder {
        private  WeaponStore newweaponstore;
        public  Builder(){
            newweaponstore = new WeaponStore();
        }

    public Builder withName(String storeName) {
        newweaponstore.name = storeName;
        return this;
        }
        public Builder withPistol(Pistol newPistol) {
            newweaponstore.pistol = newPistol;
            return this;
        }
        public Builder withRifle(Rifle newRifle) {
            newweaponstore.rifle = newRifle;
            return this;
        }
        public WeaponStore build(){
            return newweaponstore;
        }
    }
}
