package HomeWork7.Easy;

import java.time.LocalDateTime;

/*Создайте класс Clock, у которого будет 1 метод showTime().
Этот метод должен выводить на консоль текущее время, для этого воспользуйтесь
методом LocalDateTime.*now*(); из пакета java.time.LocalDateTime. В классе Main
создайте объект Clock и вызовите метод showTime().
 */
public class Clock {
     void showTime(){
         System.out.println(LocalDateTime.now());
    }
}