package HomeWork8.Middle.Fourth;
/*
Зачем нужно слово super в java?
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
}
Попробуйте создать такой класс и разобраться, для чего нужно здесь super(name)?
Есть ли в java множественное наследование? Почему?
Как объяснить такую конструкцию и почему такое возможно?
public interface Dog extends Mammal, Anumal{
}
 */
//В Java нет множественного наследования для того, чтоб не создавалась путаница. Тем не менее мы скрытно наследуемся от Object
//А вот интерфейсы способны наследоваться от множества интерфейсов, так как все равно в них нет реализации, они не создают путаницы

public class MiddleFourth {

}
 class Dog extends Animal {

    public Dog(String name) {
        super(name);// Это нужно для того, чтоб унаследовать конструктор класса родителя. Так, передавая значение в конструкторе - потомке оно перенаправляется
    }//к родителю
}
class Animal{
    String name;

    public Animal(String name) {
        this.name = name;
    }
}
