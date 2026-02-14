package HomeWork10.Hard;

import java.util.Random;

public abstract class Weapon implements Powerebel {
    private int power;

    @Override
    public int attack() {
        Random random = new Random();
        return random.nextInt(1,power);
    }

    @Override
    public int defense() {
        Random random = new Random();
        return random.nextInt(1,2);
    }
    public int getPower(){
        return power;
    }

    Weapon(int power) {
        this.power = power;
    }
    Weapon(){}
}
