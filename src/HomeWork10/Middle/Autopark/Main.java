package HomeWork10.Middle.Autopark;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", 2010, 5000.20);
        Porsсhe porsсhe = new Porsсhe("Porsche", 2020, 1000.5);
        Zhiguli zhiguli = new Zhiguli("Жигули", 2026, 100.1);
        Auto [] autos = {bmw,porsсhe,zhiguli};

        for (Auto auto : autos){
            System.out.println(auto.toString());
            System.out.println("Стоимость аренды: " + auto.rentCounter(10) + " за " + auto.getRentTime() + " часов");
        }
    }
}
