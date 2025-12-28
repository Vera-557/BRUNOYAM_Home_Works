package HomeWork4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Моя домашняя работа");
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
    }

    static void exercise1() {
        System.out.println("Введите значение Х");
        int x = new Scanner(System.in).nextInt();
        if (x == 6) {
            int y = 2 * x;
            System.out.println("Результат = " + y);
        } else System.out.println("Результат = " + (-2 * x));
    }

    static void exercise2() {
        System.out.println("Введите номер месяца года");
        int nomerMesjaca = new Scanner(System.in).nextInt();
        switch (nomerMesjaca) {
            case (12):
            case (1):
            case (2): {
                System.out.println("Зима");
                break;
            }
            case (3):
            case (4):
            case (5): {
                System.out.println("Весна");
                break;
            }
            case (6):
            case (7):
            case (8): {
                System.out.println("Лето");
                break;
            }
            case (9):
            case (10):
            case (11): {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Такого месяца года нет");

            }

        }
        //Второй способ
        System.out.println("Введите значение от 1 до 4");
        switch (nomerMesjaca) {
            case (1): {
                System.out.println("Зима");
                break;
            }
            case (2): {
                System.out.println("Весна");
                break;
            }
            case (3): {
                System.out.println("Лето");
                break;
            }
            case (4): {
                System.out.println("Осень");
                break;
            }
            default: {
                System.out.println("Не верное значение");

            }
        }
        //Третий способ
        System.out.println("Введите номер месяца года от 1 до 12");
        while (true) {
            if (1 <= nomerMesjaca && nomerMesjaca <= 12) {
                if (3 <= nomerMesjaca && nomerMesjaca <= 5) {
                    System.out.println("Весна");
                    break;
                } else if (6 <= nomerMesjaca && nomerMesjaca <= 8) {
                    System.out.println("Лето");
                    break;
                } else if (9 <= nomerMesjaca && nomerMesjaca <= 11) {
                    System.out.println("Осень");
                    break;

                } else System.out.println("Зима");
                break;
            } else System.out.println("Попробуй ещё раз");
            nomerMesjaca = new Scanner(System.in).nextInt();
        }
    }

    static void exercise3() {
        System.out.println("Введите три значения");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();
        int num = Math.max(c, Math.max(a, b));

        if (num == a) {
            System.out.println("Самое большое значение - " + a);
            int num1 = Math.max(c, b);
            if (num1 == b) {
                System.out.println("Среднее значение - " + b + " Минимальное значение - " + c);
            } else System.out.println("Среднее значение - " + c + " Минимальное значение - " + b);

        } else if (num == b) {
            System.out.println("Самое большое значение - " + b);
            int num1 = Math.max(c, a);
            if (num1 == a) {
                System.out.println("Среднее значение - " + a + " Минимальное значение - " + c);
            } else System.out.println("Среднее значение - " + c + " Минимальное значение - " + a);
        } else {
            System.out.println("Самое большое значение - " + c);
            int num1 = Math.max(b, a);
            if (num1 == a) {
                System.out.println("Среднее значение - " + a + " Минимальное значение - " + b);
            } else System.out.println("Среднее значение - " + b + " Минимальное значение - " + a);

        }
        //Второй способ
        if ((a == b) && (b == c)) {
            System.out.println("Вы ввели два одинаковых числа");
        } else if ((a == b || a == c || b == c)) {
            System.out.println("Вы ввели три одинаковых числа");

        } else if (num == a) {
            int num1 = Math.max(b, c);
            System.out.print("Самое большое число = " + a);
            if (num1 == b) {
                System.out.println("Среднее число = " + b + " Самое маленькое число " + c);
            } else System.out.println("Среднее число = " + c + " Самое маленькое число " + b);
        } else if (num == b) {
            int num1 = Math.max(a, c);
            System.out.println("Самое большое число = " + b);
            if (num1 == a) {
                System.out.println("Среднее число = " + a + " Самое маленькое число " + c);
            } else System.out.println("Среднее число = " + c + " Самое маленькое число " + a);
        } else {
            int num1 = Math.max(a, b);
            System.out.println("Самое большое число = " + c);
            if (num1 == a) {
                System.out.println("Среднее число = " + a + " Самое маленькое число " + b);
            } else System.out.println("Среднее число = " + b + " Самое маленькое число " + a);
        }
    }

    static void exercise4() {
        System.out.println("Введите два числа");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        double num = a % b;
        if (num == 0) {
            System.out.println(a + " кратно " + b);
        } else System.out.println("Остаток от деления = " + num);
    }

    static void exercise5() {
        System.out.println("Введите три стороны треугольника");
        float a = new Scanner(System.in).nextFloat();
        float b = new Scanner(System.in).nextFloat();
        float c = new Scanner(System.in).nextFloat();

        if ((a + b) < c) {
            System.out.println("Неверные параметры!");
        } else if ((a + c) < b) {
            System.out.println("Неверные параметры!");
        } else if ((b + c) < a) {
            System.out.println("Неверные параметры!");
        } else System.out.println("Возможно построение треугольника" + a + b + c);

    }

    static void exercise6() {
        System.out.println("Здравствуйте, я ваш персональный помощник на кухне!");
        System.out.println("Давайте что-нибудь приготовим, введите продукты, которые есть в наличии");
        System.out.println("Обычно в вашем холодильнике есть: мясо, рыба, молоко, масло, яйца, кофе, чай, овощи");

        String produkti = new Scanner(System.in).next().trim();

        switch (produkti) {
            case ("мясо"): {
                System.out.println("Можно приготовить:");
                System.out.println("Гуляш, котлеты, запеченное в духовке мясо");
                System.out.println("У вас есть в наличии картошка?");
                char a = new Scanner(System.in).next().charAt(0);
                System.out.println("Д = да; Н = нет");
                char y = 'д';
                char n = 'н';
                if (a == y) {
                    System.out.println("Тогда можно сделать мясо по-французски");
                } else if (a == n) {
                    System.out.println("Тогда идём дальше");
                } else System.out.println("Ладно, можете не отвечать, идём дальше");
                break;
            }
            case ("рыба"): {
                System.out.println("Можно приготовить:");
                System.out.println("Запеченную рыбу, жаренную рыбу, рыбный салат");
                break;
            }

            case ("молоко"): {
                System.out.println("Можно сделать омлет или кашу");
                break;
            }

            case ("масло"): {
                System.out.println("Сделайте бутерброд");
                break;
            }

            case ("яйца"): {
                System.out.println("Яичница");
                System.out.println("У вас есть молоко?");
                char a = new Scanner(System.in).next().charAt(0);
                System.out.println("Д = да; Н = нет");
                char y = 'д';
                char n = 'н';
                while (true) {
                    if (a == y) {
                        System.out.println("Омлет");
                        break;
                    } else if (a == n) {
                        System.out.println("Яичница");
                        break;
                    } else a = new Scanner(System.in).next().charAt(0);
                }
            }
            case ("кофе"): {
                System.out.println("Кофе без сахара");
                break;
            }
            case ("чай"): {
                System.out.println("Чай");
                break;
            }
            case ("овощи"): {
                System.out.println("Салат, свежие овощи, запечённые овощи");
                break;
            }
            default: {
                System.out.println("Я не знаю таких продуктов");
            }
        }
        System.out.println("Здравствуйте, я ваш персональный помощник на кухне!");
        System.out.println("Давайте что-нибудь приготовим, введите продукты, через запятую, которые есть в наличии");
        System.out.println("Обычно в вашем холодильнике есть: мясо, молоко, масло, яйца, кофе, чай, овощи");
        //Второй способ

        label:
        while (true) {
            switch (produkti) {
                case "мясо, овощи":
                    System.out.println("Мясо с овощами, мясо по-французски, котлеты");
                    break label;
                case "молоко, яйца, чай":
                    System.out.println("Омлет, чай с молоком, чай, яичница");
                    break label;
                case "Мясо":
                    System.out.println("Запечь, сварить, поджарить");
                    break label;
                case "молоко":
                    System.out.println("Каша");
                    break label;
                case "яйца":
                    System.out.println("яичница");
                    break label;
                case "чай":
                    System.out.println("Добавь кипяток и выпей чай");
                    break label;
                case "яйца, чай":
                    System.out.println("чай, яичница");
                    break label;
                case "молоко, яйца, кофе":
                    System.out.println("Омлет, кофе с молоком, кофе, яичница");
                    break label;
                case "молоко, яйца":
                    System.out.println("Омлет, яичница");
                    break label;
                case "молоко, чай, кофе":
                    System.out.println("чай с молоком, чай, кофе, кофе с молоком");
                    break label;
                case "овощи":
                    System.out.println("Овощи Запечь, сварить, поджарить");
                    break label;
                default:
                    System.out.println("Я не знаю других рецептов, попробуй ещё раз");
                    break;
            }
            produkti = new Scanner(System.in).nextLine();

        }
    }

    static void exercise7() {
        System.out.println("Введите три значения переменных");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        int c = new Scanner(System.in).nextInt();

        double d = Math.pow(b, 2) - (4 * a * c);

        if (d < 0) {
            System.out.println("У уравнения нет действительных корней.");
            System.out.println("Дискриминант = " + d);

        } else if (d == 0) {
            System.out.println("У уравнения два равных корня");
            double koren = ((double) b / (2 * a));
            System.out.println("Дискриминант = " + d + " Корень = " + koren);
        } else if (d > 0) {
            System.out.println("У уравнения два различных корня");
            double koren = (b - Math.sqrt(d)) / (2 * a);
            double koren2 = (b + Math.sqrt(d)) / (2 * a);
            System.out.println("Дискриминант = " + d + " Корень 1 = " + koren + " Корень 2 = " + koren2);
        }
    }

    static void exercise8() {
        System.out.println("Выберите геометрическую фигуру для вычисления:");
        System.out.println("прямоугольника, треугольника или круга");
        String wibor = new Scanner(System.in).next().trim();

        switch (wibor) {
            case "прямоугольник":
                System.out.println("Вычислим площадь прямоугольника");
                System.out.println("Введите дину разного размера сторон прямоугольника");
                int a = new Scanner(System.in).nextInt();
                int b = new Scanner(System.in).nextInt();
                int s = a * b;
                System.out.println("S = a * b; S = " + s);
                break;
            case "треугольник":
                System.out.println("Вычислим площадь треугольника");
                System.out.println("Введите дину основания и высоту");
                int q = new Scanner(System.in).nextInt();
                int h = new Scanner(System.in).nextInt();
                int w = (q * h) / 2;
                System.out.println("S = (a * h) / 2; S = " + w);
                break;
            case "круг":
                System.out.println("Вычислим площадь круга");
                System.out.println("Введите дину радиуса");
                int r = new Scanner(System.in).nextInt();
                double o = Math.pow(r, 2) * Math.PI;
                System.out.println("S = r *2 * Pi; S = " + o);
                break;
        }
    }

    static void exercise9() {
        System.out.println("Введите координаты слона Y");
        char slonY = new Scanner(System.in).next().charAt(0);
        System.out.println("Введите координаты слона X");
        int slonX = new Scanner(System.in).nextInt();
        System.out.println("Введите координаты пешки Y");
        char peshkaY = new Scanner(System.in).next().charAt(0);
        System.out.println("Введите координаты слона X");
        int peshkaX = new Scanner(System.in).nextInt();

        int osY = Math.abs(slonY - peshkaY);
        int osX = Math.abs(slonX - peshkaX);

        if (osY == osX) {
            System.out.println("Пешка под боем");
        } else System.out.println("Пешка не под боем");
    }
}
