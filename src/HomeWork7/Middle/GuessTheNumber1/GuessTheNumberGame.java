package HomeWork7.Middle.GuessTheNumber1;
/*
Написать игру “Угадай число”.
Должно быть 2 игрока. Первый (сама программа) загадывает число от 1 до 10. Второй должен угадать число,
вводя его на клавиатуре. Если число больше предложенного, программа должна выводить “число больше”,
если меньше — то “число меньше”. Должно быть 2 режима игры: без указания количество попыток и с
ограниченным числом попыток. Игра должны быть написана в ООП стиле, с использованием классов и методов.
 */

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Player player = new Player();
        computer.inviteNumber();

            Scanner scanner = new Scanner(System.in);//создали сканер для пользовательского ввода

            System.out.println("Введите число от 1 до 10 у вас есть 3 попытки");
            int realNumber = computer.inviteNumber();//получаем ответ от компьютера
            int answer = scanner.nextInt();//считываем ответ игрока
        while (answer != realNumber && player.getTryCounter() < 3){
            System.out.println("Нет");
            if (answer < realNumber) {
                player.increaseTryCounter();
                System.out.println("Число больше");
                answer = scanner.nextInt();
                continue;
            } else System.out.println("Число меньше");
            player.increaseTryCounter();
            answer = scanner.nextInt();
        }
        if (player.getTryCounter() < 3){
            System.out.println("Угадал!");
        } else  System.out.println("Проиграл!");
        System.out.println("Количество попыток " + player.getTryCounter());











    }

}
