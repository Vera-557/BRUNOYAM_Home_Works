package HomeWork10.Hard.Heroes;

import HomeWork10.Hard.Weapon.Pistol;
import HomeWork10.Hard.Weapon.Spear;
import HomeWork10.Hard.Weapon.Sword;
import HomeWork10.Hard.Weapon.Weapon;

public abstract class Character implements Herorebel {
    private Weapon weapon;
    private int health;

     Character(Weapon weapon, int health) {
        this.weapon = weapon;
        this.health = health;
    }

    public void lossHP(Character character) {
        health = character.health -= this.weapon.attack();
    }
    public void defenceHP(Character character) {
        health = character.health += this.weapon.defense();
    }
    @Override
    public void choice(int choice) {
        while (true){
            if (choice == 1){
                System.out.println("Пистолет");
                weapon = new Pistol();
                break;
            } else if (choice == 2) {
                System.out.println("Меч");
                weapon = new Sword();
                break;
            }else {
                System.out.println("Копьё");
                weapon = new Spear();
                break;
            }
        }
    }

    public int getHealth() {
        return health;
    }
}
