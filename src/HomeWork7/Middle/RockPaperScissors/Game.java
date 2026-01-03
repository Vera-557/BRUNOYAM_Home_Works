package HomeWork7.Middle.RockPaperScissors;
import java.util.Scanner;

/*Написать игру “Камень-ножницы-бумага” Программа выбирает случайным образом число от 0 до 2. Под каждым номером
содержится либо камень, либо ножницы, либо бумага. Например: 0-камень, 1-ножницы, 2-бумага Программа предлагает
ввести вам число от 0 до 2. Если ваши числа совпали — то ничья, если нет — то камень бьёт ножницы, ножницы —
бумагу и т.д. Подсказка: Получить случайное число от 0 до 2 можно, используя такую конструкцию
(int) (Math.*random*() * 3) Math — это пакет java.lang, с которым вы встречались в предыдущих модулях.
 */
public class Game {
    public static void main(String[] args) {
        Computer computer = new Computer();

        System.out.println("Камень - Ножницы - Бумага?");
        System.out.println(" 0 - камень, 1 - ножницы, 2 - бумага");
        int computerNumber = computer.inviteNumber();
        int answer = new Scanner(System.in).nextInt();
        if (answer == 0 && computerNumber == 1 || answer == 1 && computerNumber == 2 || answer == 2 && computerNumber == 0){
            System.out.println("Вы победили!");
        } else System.out.println("Вы проиграли!");


    }

}


