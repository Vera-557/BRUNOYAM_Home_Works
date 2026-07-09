package HomeWork2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:\n");
        System.out.println("Создать новый проект. Создать класс с методом main. В методе main написать код выводящий ваше ФИО, номер телефона, адрес");
        exercise1();
        System.out.println("Задание 2:\n");
        System.out.println("Создать приложение, в котором есть две целочисленные переменные (задаются в коде, не нужно считывать из консоли), и на экран необходимо вывести  все возможные результаты арифметических операций");
        exercise2();
        System.out.println("Задание 3:\n");
        System.out.println("Создать приложение для вычисления периметра прямоугольника. В консоли вводятся длины двух сторон (целочисленные), необходимо вывести периметр прямоугольника.");
        exercise3();
        System.out.println("Задание 4:\n");
        System.out.println("Создать приложение для вычисления площади треугольника. Необходимо считать из консоли значения основания и высоты, они могут быть вещественными. Вывести на консоль площадь треугольника");
        exercise4();
        System.out.println("Задание 5:\n");
        System.out.println("Создать приложение для вычисления площади квадрата. Необходимо считать из консоли длину стороны квадрата и вывести его площадь.");
        exercise5();
        System.out.println("Задание 6:\n");
        System.out.println("Создать приложение, которое будет делить вводимое число на 2, на 5 и на 10. И выводить ответ на консоль. Для этого задайте вводимому числу тип данных float");
        exercise6();
        System.out.println("Задание 7:\n");
        System.out.println("Создать приложение, которое будет просчитывать примерное время ожидания в очереди на приёме к врачу. Известно, что врач тратит минимум 10 минут на приём одного пациента, а максимум 20. С консоли вводится количество пациентов в очереди, необходимо вывести минимальное, максимальное и среднее время ожидания в очереди.");
        exercise7();
        System.out.println("Задание 8:\n");
        System.out.println("Создать приложение для проведения выборов. С консоли вводится 2 числа: количество проголосовавших за первого и второго кандидата на выборах. Нужно вывести процент голосов которые были отданы за первого и второго кандидата соответственно. Например, при входных данных: 1 4 . Ответ будет: 20% 80%");
        exercise8();
        System.out.println("Задание 9:\n");
        System.out.println("Создать приложение для вычисления минимального значение из трёх введённых переменных. Пользователь вводит три переменные, нужно вывести минимальное значение. Для реализации задачи воспользоваться библиотекой Math.");
        exercise9();
        System.out.println("Задание 10:\n");
        System.out.println("Создать приложение, которое будет решать следующую задачу. На консоль вводится 4 числа — зарплаты сотрудников IT отделов. Нужно вывести на экран разницу между наибольшей и наименьшей зарплатой в отделе.");
        exercise10();
    }

    static void exercise1() {
        System.out.println();
        String name = "Вера ****; ";
        String adress = "Bottinger Straße 15a, March, Deautschland; ";
        String telefon = "8951518****.";
        System.out.println("Имя: " + name + "Адрес: " + adress + "Телефон: " + telefon);
        System.out.println();
    }

    static void exercise2() {
        System.out.println();
        int a = 10;
        int b = 2;
        System.out.println(a + " + " + b + " = " + a + b);
//пропущено вычитание
        System.out.println(a + " - " + b + " = " + (a - b));
//пропущено умножение
        System.out.println(a + " * " + b + " = " + a * b);
//пропущено деление
        System.out.println(a + " / " + b + " = " + a / b);
        System.out.println();
    }

    static void exercise3() {
        System.out.println();
        System.out.println("Для того, чтоб вычислить периметр прямоугольника, введите значения:");
        System.out.println("Введите длину короткой стороны прямоугольника без запятых:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите длину длинной стороны прямоугольника без запятых:");
        int b = new Scanner(System.in).nextInt();
        System.out.println("Периметр данного прямоугольника равен:");
        System.out.println(2 * (a + b) + "см");
        System.out.println();
    }

    static void exercise4() {
        System.out.println();
        System.out.println("Для того, чтоб вычислить площадь треугольника, введите значения:");
        System.out.println("Введите длину основния треугольника:");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Введите длину высоты треугольника:");
        double b = new Scanner(System.in).nextDouble();
        System.out.println("Площадь данного треугольника равна:");
        System.out.println((a * b) / 2 + "см");
        System.out.println();
    }

    static void exercise5() {
        System.out.println();
        System.out.println("Для того, чтоб вычислить площадь квадрата, введите значения:");
        System.out.println("Введите длину стороны квадрата:");
        int a = new Scanner(System.in).nextInt();
        a = a * a;
        System.out.println("Площадь квадрата = " + a + " см");
        System.out.println();
    }

    static void exercise6() {
        System.out.println();
        System.out.println("Практика деления чисел:");
        System.out.println("Введите число:");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("Сейчас мы поделим ваше число на два:");
        a = a / 2;
        System.out.println("Итого = " + a);
        System.out.println("Теперь результат разделим еще на 5, = " + (a / 5));
        System.out.println("Полученные данные разделим еще на 10 = " + (a / 10));
        System.out.println("Практика деления чисел:");
        System.out.println("Введите число:");
        System.out.println("Второй вариант вывода");
        System.out.println("Сейчас мы поделим ваше число на два: " + a / 2 + " А если разделим его на пять: " + a / 5 + " А если на десять: " + a / 10);
        System.out.println();
    }

    static void exercise7() {
        System.out.println();
        System.out.println("Введите количество пациентов в очереди:");
        int pacienti = new Scanner(System.in).nextInt();
        int timeMinimum = 10;
        int timeMaximum = 20;
        int timeMiddle = (timeMinimum + timeMaximum) / 2;

        System.out.println("Среднее время ожидания " + (timeMiddle * pacienti));
        System.out.println("Минимальное время ожидания " + (timeMinimum * pacienti));
        System.out.println("Максимальное время ожидания " + (timeMaximum * pacienti));
        System.out.println();
    }

    static void exercise8() {
        System.out.println();
        System.out.println("Введите количество избирателей, проголосовавших за Сеньёра Помидора:");
        int izberateliPomidora = new Scanner(System.in).nextInt();
        System.out.println("Введите количество избирателей, проголосовавших за Чополино:");
        int izberateliChopolino = new Scanner(System.in).nextInt();
        int vsegoIzbiratelej = izberateliChopolino + izberateliPomidora;

        System.out.println("Всего голосовавших: " + (vsegoIzbiratelej));

        System.out.println("За Сеньёра Помидора проголосовало " + (izberateliPomidora));
        System.out.println("За Чополино проголосовало " + (izberateliChopolino));
        float procentPomidora = ((float) izberateliPomidora / vsegoIzbiratelej) * 100;
        int a = (int) procentPomidora;
        float procentChopolino = ((float) izberateliChopolino / vsegoIzbiratelej) * 100;
        int b = (int) procentChopolino;
        System.out.println("В процентном соотношении: " + a + "% " + b + "%");
        System.out.println();
    }

    static void exercise9() {
        System.out.println();
        System.out.println("Введите три любых числа:");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        System.out.println((Math.min(a, Math.min(b, c))));
        System.out.println();
    }

    static void exercise10() {
        System.out.println();
        System.out.println("Введите зарплату четырёх сотрудников:");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int x = new Scanner(System.in).nextInt();

        int minimalka = ((Math.min(x, Math.min(a, Math.min(b, c)))));
        int maksimalka = ((Math.max(x, Math.max(a, Math.max(b, c)))));
        System.out.println("Разница между самой маленькой и самой большой з/п составляет - " + (maksimalka - minimalka));
        System.out.println();
    }
}