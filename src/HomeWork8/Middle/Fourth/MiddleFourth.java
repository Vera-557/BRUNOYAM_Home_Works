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
