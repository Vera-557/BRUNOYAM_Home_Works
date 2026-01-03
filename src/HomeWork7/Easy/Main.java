package HomeWork7.Easy;
/*Создайте класс Clock, у которого будет 1 метод showTime().
Этот метод должен выводить на консоль текущее время, для этого воспользуйтесь
методом LocalDateTime.*now*(); из пакета java.time.LocalDateTime. В классе Main
создайте объект Clock и вызовите метод showTime().
 */
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.showTime();
    }
}
