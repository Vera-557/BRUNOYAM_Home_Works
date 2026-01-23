package HomeWork9.Easy;

public class Easy {
   /* Вопросы:

    1. Дайте определение понятиям: инкапсуляция, модификатор доступа.
    2. Какие модификаторы доступа есть в java? Какие уровни доступа они имеют?
    3. Могут ли классы быть private? Приведите пример использования такого класса.
    4. Может ли конструктор быть private? Приведите пример использования такого конструктора.
    5. Почему в интерфейсах нельзя использовать private и protected модификаторы?
    6. Что такое default метод у интерфейса? Для чего нужен default?

1. Инкапсуляция — принцип ООП, объединяющий данные и методы для работы с ними в одном классе,
скрывая внутреннюю реализацию и защищая данные от некорректного использования.
Модификатор доступа — ключевое слово, определяющее видимость/доступность классов, методов и полей.

2. public - доступ во всем проекте
protected - Доступен в том же пакете + наследникам
default - доступен в том же пакете
private - доступен только внутри своего класса

3. Да, классы могут быть private, но только как вложенные (nested) классы внутри другого класса:
можно было писать дз так:

public class Bank {
private int size = 0;
private Account[] accs = new Account[10];

class Account {
    private double balance;
    private String name;

    public Account(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }
}
4. Да, конструкторы могут быть private. Примеры использования:

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // Инициализация соединения
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
5. Интерфейсы определяют публичный контракт для реализации, Все методы интерфейса должны быть доступны для реализации
С Java 9 можно использовать private методы в интерфейсах для default методов

6. Default метод — метод в интерфейсе с реализацией по умолчанию
    */
}
