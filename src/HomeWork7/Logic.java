package HomeWork7;

public class Logic {
    public static void main(String[] args) {
        System.out.println(newMetod());//интовый метод можно сразу распечатать
        System.out.println();
        System.out.println();

        newMetod();//интовый метод, внутри нет печати метода, поэтому он печатает свое значение в 3 строке, тут я его просто вызвала по заданию
        newMetod2();//метод без возврата значения
        //можно создать переменную а и дать ей значение метода int a = newMetod();  System.out.println(a);
        int number = 20; // вынести эти две строчки в метод и вызвать этот метод в этом месте
        int result = number * number; // вынести эти две строчки в метод и вызвать этот метод в этом месте

        System.out.println(result); // эту строчку оставить здесь, чтобы рапечатывался результат, который вернется из метода, который ты напишешь
    }//закрылся метод мейн

    static int newMetod(){//создали метод с возвратным значением, без аргументов
        int number = 20; //
        int result = number * number;
        return result;
    }
    static void newMetod2(){//создали метод без возвратного значения и без аргументов
        int number = 20; //
        int result = number * number;
        System.out.println(result);
    }

}
