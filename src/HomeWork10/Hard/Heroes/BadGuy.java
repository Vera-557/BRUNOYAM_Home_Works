package HomeWork10.Hard.Heroes;

import HomeWork10.Hard.Weapon.Weapon;

public class BadGuy extends Character {
    public BadGuy(Weapon weapon, int health) {
        super(weapon,health);
    }
    public BadGuy(){
        this(null,100);
    }
}
