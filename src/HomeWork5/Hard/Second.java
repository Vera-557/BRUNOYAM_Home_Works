package HomeWork5.Hard;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Введите количество ячеек в массиве");
        int kolichestvoYacheek = new Scanner(System.in).nextInt();
        System.out.println("Введите числа внутрь ячейки");
        int[] array = new int[kolichestvoYacheek];
        for (int i = 0; i < kolichestvoYacheek; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        int[] novijMassiv = new int[kolichestvoYacheek];
        int Count = 0;
        for (int i = 0; i < kolichestvoYacheek; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < Count; j++) {
                if (array[i] == novijMassiv[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                novijMassiv[Count] = array[i];
                Count++;
            }
        }

        System.out.println("Массив без повторяющихся элементов:");
        for (int i = 0; i < Count; i++) {
            System.out.print(novijMassiv[i] + " ");


        }
    }
}
