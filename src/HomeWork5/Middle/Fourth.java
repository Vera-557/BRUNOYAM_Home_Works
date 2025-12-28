package HomeWork5.Middle;

import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        System.out.println("Введите число, из которого мы вычислим факториал");
        int num = new Scanner(System.in).nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
            System.out.println("Факториал = " + factorial);
        }

    }
}
