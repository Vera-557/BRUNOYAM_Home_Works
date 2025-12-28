package HomeWork5.Hard;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        System.out.println("Введите значение N");
        int n = new Scanner(System.in).nextInt();
        if (n <= 0) {
        } else {
            int[] fibonacci = new int[n];
            fibonacci[0] = 0;
            if (n > 1) {
                fibonacci[1] = 1;
                for (int i = 2; i < n; i++) {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }
            System.out.println("Числа Фибоначчи:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
        }



    }
}
