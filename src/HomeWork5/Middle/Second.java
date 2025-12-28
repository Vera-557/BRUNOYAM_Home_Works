package HomeWork5.Middle;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        System.out.println("Введите необходимое количество ячеек массива от 1 до 100");
        int size = new Scanner(System.in).nextInt();
        if (1 <= size && size <= 100) {
            double[] massiv = new double[size];
            System.out.println("Введите числовые значения массива");
            for (int element = 0; element < size; element++) {//это индекс
                massiv[element] = new Scanner(System.in).nextDouble();
            }
            double maximum = 0;
            for (double i : massiv) {//это элемент
                int absValue = (int) Math.abs(i);//здесь преобразуем число в абсолют
                if (absValue > maximum) {//сравниваем с максимумом
                    maximum = absValue;//перезаписываем
                }
            }
            System.out.println("Максимальное значение внутри массива = " + maximum);
        } else System.out.println("Вы ввели значение меньше 1 и больше 100, программа не может отработать.");
    }
}
