package HomeWork8.Hard.First;

import java.util.Arrays;

/*
Создайте свой дилерский центр.
Центр должен уметь получать новые автомобили и продавать. Автомобили должны быть разные — от легковушки до тракторов.
Если нужного автомобиля нет, то центр должен выводить сообщение об этом.
Центр должен уметь предоставлять информацию обо всех своих автомобилях, а также показывать “самый дорогой” и
“самый дешёвый” автомобиль.
 */
public class Center {
    Vehicle [] vehicles = new Vehicle[10];
    int size = 0;
    void add(Vehicle vehicle){
        vehicles[size] = vehicle;
        size ++;
        if (size == vehicles.length){
            Vehicle [] temp = new Vehicle[vehicles.length * 2];
            for (int i = 0; i < vehicles.length; i ++){
                temp[i] = vehicles[i];
            }
            vehicles = temp;
        }
    }
    void sell(Vehicle vehicle){
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (vehicle.getType().equals(vehicles[i].getType()) && vehicle.getPrice() == vehicles[i].getPrice()) {
                System.out.println("Продажа состоялась");
                for (int j = i; j < size - 1; j++) {
                    vehicles[j] = vehicles[j + 1];
                }
                vehicles[size - 1] = null;
                size--;
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Такого товара нет");
        }
    }
    void showInfo(){
        for (Vehicle vehicle : vehicles){
            if (vehicle != null) {
                System.out.println(vehicle.toString());
            }
        }
    }
    void topPrice(){
        double max = vehicles[0].getPrice();
        double min = vehicles[0].getPrice();
        for (int i = 0; i < vehicles.length; i ++){
            if (vehicles[i] != null) {
                if (vehicles[i].getPrice() > max) {
                    max = vehicles[i].getPrice();
                }
                if (vehicles[i].getPrice() < min) {
                    min = vehicles[i].getPrice();
                }
            }
        }
        System.out.println("Самая большая цена = " + max);
        System.out.println("Самая маленькая цена = " + min);
    }

    public static void main(String[] args) {
        Center center = new Center();
        center.add(new Lada(1_500_000.00, "механическая", "Приора"));
        center.add(new Lada(2_200_000.00, "механическая", "Нива"));
        center.add(new Kamaz(6_300_000.00, 750, "Тягач"));
        center.add(new Kamaz(4_400_000.00, 380, "Грузовик"));
        center.add(new Man(8_550_000.00, 880, "Тягач"));
        center.add(new Man(2_900_000.00, 260, "Трактор"));
        center.add(new Volkswagen(4_200_000.00, "механическая", "Поло"));
        center.add(new Volkswagen(4_900_000.00, "Автоматическая", "Поло"));
        center.add(new Volkswagen(3_150_000.00, "механическая", "Гольф"));
        center.add(new Volkswagen(3_900_000.00, "Автоматическая", "Тигуан"));
        center.add(new Lada(2_900_000.00, "механическая", "Крыса"));
        System.out.println();
        center.showInfo();
        center.topPrice();
        center.sell(new Lada(2_200_000.00, "механическая", "Нива"));
        center.showInfo();
    }
}
