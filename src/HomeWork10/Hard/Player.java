package HomeWork10.Hard;

public class Player extends Character{
    public Player(Weapon weapon, int health) {
        super(weapon, health);
    }
    public Player(){
        this(null,100);
    }
}
