package HomeWork7.Middle.RockPaperScissors;

import java.util.Scanner;

public class GameSecondVariant {
    static int computerNumber;
    static int answer;

    public static void main(String[] args) {
        Computer computer = new Computer();

        System.out.println("Камень - Ножницы - Бумага?");
        System.out.println(" 0 - камень, 1 - ножницы, 2 - бумага");
        computerNumber = computer.inviteNumber();

        userAnswer();
        System.out.print("   ⚔\uFE0F   ");
        computerAnswer();

        if (answer == computerNumber) {
            System.out.println("\nНичья");
        }

    }

    protected static void userAnswer() {
        answer = new Scanner(System.in).nextInt();
        switch (answer) {
            case 0:
                if (computerNumber == 1) System.out.print("\nВы победили\n");
                if (computerNumber == 2) System.out.print("\nВы проиграли\n");
                System.out.print("\uD83D\uDC8E");
                break;
            case 1:
                if (computerNumber == 2) System.out.print("\nВы победили\n");
                if (computerNumber == 0) System.out.print("\nВы проиграли\n");
                System.out.print("✂\uFE0F");
                break;
            case 2:
                if (computerNumber == 0) System.out.print("\nВы победили\n");
                if (computerNumber == 1) System.out.print("\nВы проиграли\n");
                System.out.print("\uD83D\uDCC4");
                break;

        }
    }

    protected static void computerAnswer() {
        switch (computerNumber) {
            case 0:
                System.out.print("\uD83D\uDC8E");
                break;
            case 1:
                System.out.print("✂\uFE0F");
                break;
            case 2:
                System.out.print("\uD83D\uDCC4");
                break;
        }
    }
}
