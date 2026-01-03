package HomeWork7.Hard.Gallow;


import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player playerFirst = new Player();
        Player playerSecond = new Player();
        System.out.println("Первый игрок вводит имя");
        playerFirst.getName();
        System.out.println("Второй игрок вводит имя");
        playerSecond.getName();
        System.out.println(playerFirst.name + " загадывает слово: ");
        String wordToGuess = scanner.nextLine();
        HangmanGame game = new HangmanGame(wordToGuess);

        while (!game.isGameOver()) {
            System.out.println("Текущий прогресс: " + game.getCurrentProgress());
            System.out.println("Осталось попыток: " + game.getAttemptsLeft());
            System.out.print("Введите букву: ");
            char guessedLetter = scanner.nextLine().charAt(0);
            game.guessLetter(guessedLetter);
        }

        if (game.isGameWon()) {
            System.out.println("Вы угадали слово: " + wordToGuess);
        } else {
            System.out.println("Вы проиграли ☠\uFE0F . Загаданное слово было: " + wordToGuess);
        }

        scanner.close();


    }


}
