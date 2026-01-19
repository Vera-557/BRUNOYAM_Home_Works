package HomeWork9.Middle.Parking;

public class Parking { private final int fullSize = 20;
    private Car[] parkingArray = new Car[fullSize];
    private int size = 0;

    //    Parking(Car[] parkingArray){
//        this.parkingArray = parkingArray;
//    }
    //заехала машинка
    void push(Car parking){
        parkingArray[size] = parking;
        size++;
        if (size == parkingArray.length){
            return;
        }
    }
    //уехала машинка
    void pop(Car parking){
        Car [] temp = new Car[size];
        for(int i = 0; i < parkingArray.length; i++){
            if (parkingArray[i] != null && parkingArray[i].getName().equals(parking.getName())){
                System.out.println("Машина " + parkingArray[i].getName() + " уехала");
                parkingArray[i] = parkingArray[i + 1];
                //size--;
            }
            temp[i] = parkingArray[i];

        }
        parkingArray = temp;
    }
    void print(){
        for (Car parking: parkingArray){
            if (parking != null) {
                System.out.println(parking.getName());
            }
        }
    }

    static void main() {
        Car car1 = new Car("Lada");
        Car car2 = new Car("Mazda");
        Car car3 = new Car("VolksWagen");
        Car car4 = new Car("BMW");
        //Parking parking = new Parking(new Car[]{car1,car2,car3,car4});
        Parking parking = new Parking();
        parking.push(car1);
        parking.push(car2);
        parking.push(car3);
        parking.push(car4);
        parking.print();
        parking.pop(car2);
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