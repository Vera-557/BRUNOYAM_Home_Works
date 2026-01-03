package HomeWork7.Hard.Gallow;

public class HangmanGame {
    private String wordToGuess;
    private char[] guessedLetters;
    private int attemptsLeft;
    private static final int MAX_ATTEMPTS = 3;

    public HangmanGame(String wordToGuess) {
        this.wordToGuess = wordToGuess.toLowerCase();
        this.guessedLetters = new char[wordToGuess.length()];
        this.attemptsLeft = MAX_ATTEMPTS;
    }

    public boolean isGameWon() {
        for (char letter : guessedLetters) {
            if (letter == '\u0000') {
                return false;
            }
        }
        return true;
    }

    public boolean isGameOver() {
        return attemptsLeft <= 0 || isGameWon();
    }

    public void guessLetter(char letter) { //буквы угадал
        letter = Character.toLowerCase(letter);
        if (wordToGuess.indexOf(letter) != -1) {
            for (int i = 0; i < wordToGuess.length(); i++) {
                if (wordToGuess.charAt(i) == letter) {
                    guessedLetters[i] = letter;
                }
            }
        } else {
            attemptsLeft--;
            printHanged();
        }
    }

    public String getCurrentProgress() {
        StringBuilder progress = new StringBuilder();
        for (char letter : guessedLetters) {
            progress.append(letter == '\u0000' ? '*' : letter).append(' ');
        }
        return progress.toString().trim();
    }

    public int getAttemptsLeft() {

        return attemptsLeft;
    }

    public void printHanged() {
        switch (getAttemptsLeft()) {
            case 2:
                System.out.println("\n" +
                        "        ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⣄⠀⡇⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣷⠃⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠉⡀⠀⠀⠀⠀⠀");
                break;
            case 1:
                System.out.println("        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⣄⠀⡇⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣷⠃⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠉⡀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⡇⢂⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⡇⠀⢂⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠀⠃⠀⠀⢂⠀⠀⠀");
                break;
            case 0:
                System.out.println("        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢀⣴⣶⣶⣶⣄⠀⡇⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⣾⣿⣿⣿⣿⣿⣷⠃⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠘⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⢻⣿⣿⣿⣿⣿⠏⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠙⠛⠛⠛⠉⡀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣇⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂⡇⢂⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⡇⠀⢂⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠀⠃⠀⠀⢂⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢄⠀⠀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡈⠈⡀⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡐⠀⠀⠰⠀⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠀⠀⠀⠀⠆⠀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠀⠠⠁⠀⠀⠀⠀⠈⡀⠀⠀⠀\n" +
                        "        ⠀⠀⠀⠀⠀⠀⠀⠠⠂⠀⠀⠀⠀⠀⠀⢁⠀⠀⠀");
                break;
        }
    }

}
