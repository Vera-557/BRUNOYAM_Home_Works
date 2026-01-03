package HomeWork7.Hard.RockPaperScissors;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    String name;
    int count;

    public String getName() {
        name = new Scanner(System.in).next().trim();
        return name;
    }
    public int makeChoice(){
        int card = scanner.nextInt();
        while (card < 0 || card > 3){
            System.out.println("Упс! Вы не туда нажали. От 0 до 3");
            card = scanner.nextInt();
        }
        return card;
    }

    public int getCount() {
        count++;
        return count;
    }

}
