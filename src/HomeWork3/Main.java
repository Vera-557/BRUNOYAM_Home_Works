package HomeWork3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:\n");
        System.out.println("Введите 2 значения, Java поменяет их местами\n");
        exercise1();
        System.out.println("\nЗадание 2:\n");
        System.out.println("Ввести 3 числа, увидеть результат их сложения и умножения");
        exercise2();
        System.out.println("\nЗадание 3:\n");
        System.out.println("Расчет зарплаты работника за месяц");
        exercise3();
        System.out.println("\nЗадание 4:\n");
        System.out.println("Расчёт дискриминанта");
        exercise4();
        System.out.println("\nЗадание 5:\n");
        System.out.println("<< Работа со строками >>");
        exercise5();
        System.out.println("\nЗадание 6:\n");
        System.out.println("Вывести подстроку");
        exercise6();
        System.out.println("\nЗадание 7:\n");
        System.out.println("Найдем площадь треугольника по заданным точкам");
        exercise7();
    }

    static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //дописать недостающий код
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Пользователь ввел значение для a: " + a + " и b: " + b);
    }

    static void exercise2() {
        System.out.println("Введите три значения с плавающей точкой:");
        float a = new Scanner(System.in).nextFloat();
        float b = new Scanner(System.in).nextFloat();
        float c = new Scanner(System.in).nextFloat();

        System.out.println("Сумма заданных чисел равна: " + (a + b + c) + " Произведение заданных чисел равно: " + (a * b * c));
    }

    static void exercise3() {
        System.out.println("Введите количество отработанных дней:");
        int rabochieDni = new Scanner(System.in).nextInt();
        System.out.println("Введите зарплату рабочего за день");
        float zarplataDen = new Scanner(System.in).nextFloat();
        float zarplataMesjac = rabochieDni * zarplataDen;
        System.out.println("Работник заработал " + zarplataMesjac + " рублей.");
    }

    static void exercise4() {
        System.out.println("Введите три значения квадратного уравнения");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int d = (b * b) - (4 * a * c);
        System.out.println("Дискриминант равен = " + d);
    }

    static void exercise5() {
        String a = "Hello Java!";
        System.out.println("Выведем номер буквы J - " + a.indexOf('J') + ", строка в верхнем регистре - " + a.toUpperCase());
        System.out.println("Введите строку:");
        String b = new Scanner(System.in).nextLine();
        System.out.println("Длина строки - " + b.length());
    }

    static void exercise6() {
        String stroka = "Hello world!";
        System.out.println("Подстрока с 6 по 11 - " + stroka.substring(6, 11));
    }

    static void exercise7() {
        System.out.println("Введите координаты вершин треугольника:");
        System.out.println("Введите координаты X и Y первой вершины:");
        float a1 = new Scanner(System.in).nextFloat();
        float a2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координаты X и Y второй вершины:");
        float b1 = new Scanner(System.in).nextFloat();
        float b2 = new Scanner(System.in).nextFloat();
        System.out.println("Введите координаты X и Y третьей вершины:");
        float c1 = new Scanner(System.in).nextFloat();
        float c2 = new Scanner(System.in).nextFloat();
        System.out.println("Найдем длину сторон треугольника");
        double dlinaABX = Math.pow(b1, 2) - Math.pow(a1, 2);
        double dlinaABY = Math.pow(b2, 2) - Math.pow(a2, 2);
        double dlinaAB = Math.sqrt(dlinaABX + dlinaABY);
        System.out.println("Длина АB = " + dlinaAB);
        double dlinaBCX = Math.pow(b1, 2) - Math.pow(c1, 2);
        double dlinaBCY = Math.pow(b2, 2) - Math.pow(c2, 2);
        double dlinaBC = Math.sqrt(dlinaBCX + dlinaBCY);
        System.out.println("Длина BC = " + dlinaBC);
        double dlinaACX = Math.pow(c1, 2) - Math.pow(a1, 2);
        double dlinaACY = Math.pow(c2, 2) - Math.pow(a2, 2);
        double dlinaAC = Math.sqrt(dlinaACX + dlinaACY);
        System.out.println("Длина AC = " + dlinaAC);
        System.out.println("Площадь треугольника = " + (dlinaAB + dlinaBC + dlinaAC) / 2);
    }
}
