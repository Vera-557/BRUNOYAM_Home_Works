package HomeWork5.Middle;

import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        System.out.println("Задайте необходимое количество значений");
        int n = new Scanner(System.in).nextInt();
        if (n >= 1 && n <= 100) {
            System.out.println("Введите ряд натуральных чисел, согласно заданному количеству");
            int[] nums = new int[n];
            for (int index = 0; index < n; index++) {
                nums[index] = new Scanner(System.in).nextInt();
                for (int element = 2; element < nums.length; element++) {
                    if (nums[index] % element == 0) {
                        System.out.println("Result " + element);
                    } else System.out.println("Нет делителя");
                }

            }

        } else System.out.println("Вы ввели неверное значение, код не может быть выполнен.");

    }
}
