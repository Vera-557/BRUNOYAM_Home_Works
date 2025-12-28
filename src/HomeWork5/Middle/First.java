package HomeWork5.Middle;

public class First {
    public static void main(String[] args) {
        System.out.println("Массив целочисленных чисел");
        int[] array = new int[]{2, 4, 7, 9};
        int summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
        }
        System.out.println(summa);

        int summaVruchnuy = array[0] + array[1] + array[2] + array[3];
        System.out.println(summaVruchnuy);

        int summaVstolbik = 0;
        summaVstolbik += array[0];
        summaVstolbik += array[1];
        summaVstolbik += array[2];
        summaVstolbik += array[3];
        System.out.println(summaVstolbik);
    }
}
