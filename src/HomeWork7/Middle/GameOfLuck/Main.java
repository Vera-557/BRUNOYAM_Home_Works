package HomeWork7.Middle.GameOfLuck;
/*Написать игру “Напёрстки”
Компьютер прячет монетку в одном из трех стаканов. И предлагает угадать, в каком стакане монетка.
Игра идёт до трех побед. Подсказка: Получить случайное число от 0 до 2 можно, используя такую
конструкцию (int) (Math.*random*() * 3) . Math — это пакет java.lang, с которым вы встречались
в предыдущих модулях. Игра должны быть написана в ООП стиле, с использованием классов и методов.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

           Thimble thimble = new Thimble();//создали игру
           Player player = new Player();// создали игрока
           do {
           Scanner scanner = new Scanner(System.in);//создали сканер для пользовательского ввода

           System.out.println("Введите номер наперстка от 0 до 2");
           int answer = scanner.nextInt();//считываем ответ игрока
           int realNumber = thimble.showNumberThimble();//получаем ответ от компьютера
           if (answer == realNumber) {//сравниваем ответы

               player.increaseWinCounter();

           } else System.out.println("Вы не угадали, попробуйте ещё раз");
           System.out.println("Ваш результат: " + player.getWinCounter());
       }while (player.getWinCounter() < 3);

    }
}