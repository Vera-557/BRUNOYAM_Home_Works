package HomeWork7.Middle.GameOfLuck;
/*Написать игру “Напёрстки”
Компьютер прячет монетку в одном из трех стаканов. И предлагает угадать, в каком стакане монетка.
Игра идёт до трех побед. Подсказка: Получить случайное число от 0 до 2 можно, используя такую
конструкцию (int) (Math.*random*() * 3) . Math — это пакет java.lang, с которым вы встречались
в предыдущих модулях. Игра должны быть написана в ООП стиле, с использованием классов и методов.
 */
public class Thimble {
    public int showNumberThimble() {
        int number = (int) (Math.random() * 2);
        //System.out.println(number);
        return number;
    }
}
