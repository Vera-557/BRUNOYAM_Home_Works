package HomeWork8.Hard.First;

public abstract class Auto extends Vehicle {
    private String kpp;
    private String id;
    public Auto(String type, double price, String kpp, String id) {
        super("Легковой автомобиль", price);
        setKpp(kpp);
        setId(id);
    }
    public Auto(double price, String kpp, String id) {
        super("Легковой автомобиль", price);
        setKpp(kpp);
        setId(id);
    }
    Auto(){}
    public void setKpp(String kpp){
        if (kpp.equalsIgnoreCase("automatic") || kpp.equalsIgnoreCase("mechanical") || kpp.equalsIgnoreCase("Автоматическая")|| kpp.equalsIgnoreCase("Механическая")){
            this.kpp = kpp;
        }else throw new IllegalArgumentException("Неизвестный тип коробки передач");
    }
    public String getKpp(){
        return kpp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.isEmpty()){
            System.out.println("Введите название автомобиля");
            return;
        }
        this.id = id;
    }

    @Override
    public String toString() {
        return getType() + ": цена - " + getPrice() + ", коробка передач: " + kpp + ", модель: " + id;
    }
}
