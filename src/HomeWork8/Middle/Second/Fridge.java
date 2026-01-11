package HomeWork8.Middle.Second;

/*
Создайте родительский класс Product — продукт, от которого наследуйте множество продуктов, например,
колбаса, хлеб и т.д. Каждый продукт должен иметь свой объём. Также нужен объект холодильник класса
Fridge, который может принимать в себя объекты типа Product. Холодильник имеет конечный объем,
допустим 100. То есть в холодильник можно положить 2 продукта объёмом по 50, либо 10 объёмом по 10.
Ваша задача — посчитать возможности вашего холодильника и положить максимальное количество продуктов
разного объёма. Если холодильник полон, то должно выдаваться сообщение, что объём холодильника превышен.
 */
class Fridge {
    private int volumeFridge = 0;
    private int count = 0;
    private Product[] productsIn = new Product[10];

    int add(Product product) {
        if (product.getVolume() > 20) {
            System.out.println("Мы не можем положить это в холодильник, продукт слишком большой");
            return volumeFridge;
        } else if (product.getVolume() + volumeFridge > 20) {
            System.out.println("Объём холодильника превышен");
            return volumeFridge;
        } else {
            volumeFridge += product.getVolume();
            productsIn[count] = product;
            count++;
            for (int i = 0; i < productsIn.length; i++) {
                if (count == productsIn.length) {
                    Product[] temp = new Product[productsIn.length * 2];
                    temp[i] = productsIn[i];
                    productsIn = temp;
                }
            }
            return volumeFridge;
        }
    }

    void showIn() {
        System.out.println("В холодильнике лежит:");
        for (int i = 0; i < productsIn.length; i++) {
            if (productsIn[i] != null) System.out.println(productsIn[i]);
        }
    }

   public static void main(String [] args) {
        Product product1 = new Sausage(4);
        Product product2 = new Milk(2);
        Product product3 = new Bread(3);
        Product product4 = new Eggs(4);
        Product product5 = new Salad(5);
        Product product6 = new Milk(2);
        Product product7 = new Cheese(3);
        Fridge fridge = new Fridge();
        fridge.add(product1);
        fridge.add(product2);
        fridge.add(product3);
        fridge.add(product4);
        fridge.add(product5);
        fridge.add(product6);
        fridge.add(product7);
        System.out.println(fridge.volumeFridge);
        fridge.showIn();
    }
}
