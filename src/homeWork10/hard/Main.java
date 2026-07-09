package homeWork10.hard;

import homeWork10.hard.heroes.BadGuy;
import homeWork10.hard.heroes.Player;

import java.util.Random;
import java.util.Scanner;
/*
Создайте свою вселенную с супергероями и злодеями. У каждого героя и злодея есть оружие (меч, пистолет, копье),
которое несёт в себе некое количество урона. Каждый персонаж в вашей вселенной может использовать своё оружие,
нанося урон противнику.

У каждого персонажа есть шкала здоровья, которая может уменьшаться. Во время сражения персонажи наносят друг
другу уроны (здесь можно использовать случайное число от 0 до 1, 0 — не попал, 1 — попал).

Задача: организовать дуэль между героями и злодеями. В начале игры компьютер должен предложить выбор из
персонажей. За злодея играет компьютер. На поле битвы с помощью случайного генератора наносятся уроны
вам и вашему сопернику. Проигрывает тот, у кого закончилось здоровье.

Создайте интерфейс для персонажа Hero и для оружия Weapon, а далее создавайте конкретных персонажей.

Не забудьте об абстрактных классах и избегайте дублирование кода. По возможности используйте абстрактные
классы, вынося в них повторяющийся код.
 */
public class Main {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Player player = new Player();
    BadGuy badGuy = new BadGuy();

    public static void main(String[] args) {
        Main main = new Main();
        main.area();
    }

    void area() {
        System.out.println("Выберите оружие:");
        System.out.println("1 - пистолет, 2 - меч, 3 - копьё");
        int sc = scanner.nextInt();
        player.choice(sc);
        System.out.println("Компьютер делает выбор:");
        int rn = random.nextInt(1, 4);
        badGuy.choice(rn);
        System.out.println("Игрок первый делает ход");
        scanner.nextLine();
        while ((player.getHealth() > 0) || (badGuy.getHealth() > 0)) {
            while (true) {
                System.out.println("Ваш выбор: 1 - ударить, 2 - восстановиться");
                int pull = scanner.nextInt();
                if (pull == 1) {
                    player.lossHP(badGuy);
                    System.out.println("Атака. Здоровье врага = " + badGuy.getHealth());
                    break;
                }
                if (pull == 2) {
                    player.defenceHP(player);
                    System.out.println("Восстановление здоровья " + player.getHealth());
                    break;
                }
            }
            System.out.println("Компьютер делает ход");
            int compPull = random.nextInt(1, 3);
            if (compPull == 1) {
                badGuy.lossHP(player);
                System.out.println("Атака. Здоровье игрока = " + player.getHealth());
            } else {
                badGuy.defenceHP(badGuy);
                System.out.println("Восстановление здоровья " + badGuy.getHealth());
            }
        }
        if (player.getHealth() > badGuy.getHealth()) {
            System.out.println("Вы выиграли");
        } else System.out.println("Вы проиграли");
    }
}
