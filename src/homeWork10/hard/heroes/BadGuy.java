package homeWork10.hard.heroes;

import homeWork10.hard.weapon.Weapon;

public class BadGuy extends Character {
    public BadGuy(Weapon weapon, int health) {
        super(weapon,health);
    }
    public BadGuy(){
        this(null,100);
    }
}
