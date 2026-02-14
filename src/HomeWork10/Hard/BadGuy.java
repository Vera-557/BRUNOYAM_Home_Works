package HomeWork10.Hard;

public class BadGuy extends Character {
    public BadGuy(Weapon weapon, int health) {
        super(weapon,health);
    }
    public BadGuy(){
        this(null,100);
    }
}
