package homeWork10.hard.heroes;

import homeWork10.hard.weapon.Weapon;

public class Player extends Character {
    public Player(Weapon weapon, int health) {
        super(weapon, health);
    }
    public Player(){
        this(null,100);
    }
}
