package HomeWork11.Easy;

public class Easy {
    /*
   1. Что такое коллекции в java и для чего они используются?

    2. Назовите 3 основных интерфейса, которые наследуются от интерфейса Collection в java.
    - List, Set, Queue

    3. Назовите отличия реализаций ArrayList от LinkedList.
    - В основе арэй листа лежит массив, а линкед листа - связанный список. (По сути это тупо много объектов одного класса, имеющих ссылки друг на друга

    4. Что такое множества? Какие есть реализации интерфейса Set в java?

    5. Какая связь между методами equals() и hashCode()? Что такое коллизия?
    6. Истинно ли утверждение, что если у двух объектов хеш-код равен, значит и объекты равны?
    - нет
    7. Что такое ассоциативный массив в java? Какие реализации интерфейса Map вы знаете?
    8. Допишите реализацию метода equals() вместо знаков / / для класса Human из 4 урока:

     */
    public static void main(String[] args) {
        Human human1 = new Human("Василий Пупкин", "01.01.1990");
        Human human2 = new Human("Иванов Иван", "01.01.1991");
        System.out.println(human1);
        System.out.println(human1.toString());

    }
}
 class Human {
    private String birthday;
    private String fio;
    public Human(String fio, String birthday) {
        this.fio = fio;
        this.birthday = birthday;
    }
     @Override
     public String toString() {
         return "FIO " + fio + " Birthday " + birthday;
     }
     @Override
     public boolean equals(Object obj) {
         if (obj == null || getClass() != obj.getClass()) return false;
         Human humanObj = (Human) obj;
         boolean result = fio.equals(humanObj.fio)
                 && birthday.equals(humanObj.birthday);
         return result;
     }
}
