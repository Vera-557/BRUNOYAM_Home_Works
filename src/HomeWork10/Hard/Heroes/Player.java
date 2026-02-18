package HomeWork10.Hard.Heroes;

import HomeWork10.Hard.Weapon.Weapon;

public class Player extends Character {
    public Player(Weapon weapon, int health) {
        super(weapon, health);
    }
    public Player(){
        this(null,100);
    }
}
