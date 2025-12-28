package HomeWork5.Middle;

import java.util.Random;
import java.util.Scanner;

public class Sixth {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Генерация двух случайных чисел");
            int a = new Random().nextInt(9) + 1;
            int b = new Random().nextInt(9) + 1;
            System.out.println(a + " * " + b);
            System.out.println("Введите ответ");
            int userAnsw = new Scanner(System.in).nextInt();
            int c = a * b;
            if (userAnsw == c) {
                System.out.println("Yes!");
            } else System.out.println("No! - " + c + ". Go back to school! ");
        }

    }
}
