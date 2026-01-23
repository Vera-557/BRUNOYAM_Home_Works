package HomeWork9.Middle.Elevator;
/*
Лифт может поместить в себя груз не больше 500 кг. У объекта класса Elevator есть 3 метода: добавить груз add(), везти push() и выгружать pop().
Задача такая: создать объекты класса Cargo, у которых есть номинальный вес.
Положить их в лифт. Перед каждым погружением объектов лифт должен проверить, не превышен ли лимит на грузоподъёмность.
Если лимит превышен, то лифт не может ехать, даже если пытаться вызвать метод push(). Подсказка: создайте поле isEnable,
которое будет указывать, на то, способен ли лифт ехать.
Когда лифт приехал, нужно методом pop() выгрузить все объекты и освободить лифт.
 */
public class Elevator {
    private boolean isEnable = true;
    private double maxWeight = 501;
    private double minWeight = 0;

    public double getMinWeight(){
        return minWeight;
    }
    void add(Cargo cargo){
        //Перед каждым погружением объектов лифт должен проверить, не превышен ли лимит на грузоподъёмность.
        //Чтоб вписаться в условие задачи сделала такой костыль
        if (cargo.getWeight() <= maxWeight && isEnable){
            minWeight += cargo.getWeight();
            if (minWeight >= maxWeight){
                isEnable = false;
                minWeight = 0;
            }
        }
        //проверили
    }
    String push(int num){
        //повезти груз на этаж
        if (minWeight != 0) {
            switch (num) {
                case 1:
                    return "Лифт едет на 1 этаж";
                case 2:
                    return "Лифт едет на 2 этаж";
                case 0:
                    return "Лифт едет на парковку";
            }
        }else return "Лифт перегружен!";
        return "";
    }
    void pop(){
        if (isEnable){
            System.out.println("Лифт приехал и выгружен");
        }else System.out.println("Лифт никуда не ехал");
    }

}
class Cargo{
    private String name;
    private double weight;
    Cargo(String name, double weight){
        setName(name);
        setWeight(weight);
    }
    public void setName(String name){
        if (name.isEmpty()){
            return;
        }
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        if (weight <= 0){
            return;
        }
        this.weight = weight;
    }
}
class Main{
    static void main() {
        Cargo cargo = new Cargo("Холодильник", 400);
        Elevator elevator = new Elevator();
        elevator.add(cargo);
        System.out.println(elevator.getMinWeight());
        System.out.println(elevator.push(1));
        elevator.pop();
        Cargo cargo1 = new Cargo("Шкаф", 100);
        Cargo cargo2 = new Cargo("Сейф", 200);
        Cargo cargo3 = new Cargo("Морозилка", 200);
        Elevator elevator1 = new Elevator();
        elevator1.add(cargo1);
        elevator1.add(cargo2);
        elevator1.add(cargo3);
        System.out.println(elevator1.getMinWeight());
        System.out.println(elevator1.push(0));
        elevator1.pop();
    }
}