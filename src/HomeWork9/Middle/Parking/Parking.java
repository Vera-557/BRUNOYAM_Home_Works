package HomeWork9.Middle.Parking;
/*
Парковка.
Создайте объект парковка класса Parking. У парковки есть ограниченное количество мест, допустим 20.
Также есть метод push() — позволяет машине заехать на парковку, и метод pop(), который освобождает место,
когда машина уезжает. Если свободных мест на парковке не осталось, то нужно запретить машинам заезжать на
парковку, пока какая-нибудь машина не уедет и не освободит место.
Создайте объекты класса Car и в методе main заполните ими парковку. Не забывайте закрывать private поля для классов.
 */
public class Parking {
    private final int FULLSIZE = 20;
    private Car[] parkingArray = new Car[FULLSIZE];
    private int size = 0;

    //    Parking(Car[] parkingArray){
//        this.parkingArray = parkingArray;
//    }
    //заехала машинка
    void push(Car parking){
        if (size == FULLSIZE){
            System.out.println("Парковка заполнена");
            return;
        }
        parkingArray[size] = parking;
        size++;
    }
    //уехала машинка
    void pop(Car parking){
        for(int i = 0; i < size; i++){
            if (parkingArray[i] != null && parkingArray[i].getName().equals(parking.getName())){
                System.out.println("Машина " + parkingArray[i].getName() + " уехала");
                for (int j = i; j < size - 1; j++) {
                    parkingArray[j] = parkingArray[j + 1];
                }
                parkingArray[size - 1] = null;
                size--;
                break;
            }
        }
    }
    void print(){
        for (Car parking: parkingArray){
            if (parking != null) {
                System.out.println(parking.getName());
            }
        }
    }

    public static void main(String [] args) {
        Car car1 = new Car("Lada");
        Car car2 = new Car("Mazda");
        Car car3 = new Car("Volkswagen");
        Car car4 = new Car("BMW");
        //Parking parking = new Parking(new Car[]{car1,car2,car3,car4});
        Parking parking = new Parking();
        parking.push(car1);
        parking.push(car2);
        parking.push(car3);
        parking.push(car4);
        parking.print();
        System.out.println("--------------------");
        parking.pop(car2);
        System.out.println("---------------------");
        parking.print();

    }
}
class Car{
    private final String name;

    Car(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}