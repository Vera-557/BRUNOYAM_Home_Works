package homeWork11.middle;
/*
4. Олимпиада.
Вам нужно написать последовательный выход стран на открытии Олимпийских игр по алфавиту. Нужно учесть, что Греция всегда выходит первой.
На вход: неотсортированный список стран (Япония, Канада, Россия и т.д.)
На выходе: Греция, Австралия, Австрия ….. Япония
Подсказка: используйте для этого Comparable
 */

import java.util.*;

class Country implements Comparable<Country> {
    private String name;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Country other) {
        // Греция всегда первая
        if (this.name.equals("Греция")) {
            return -1;
        }
        if (other.name.equals("Греция")) {
            return 1;
        }
        // Остальные страны по алфавиту
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

 class OlympicParade {
    public static void main(String[] args) {
        // Неотсортированный список стран
        List<Country> countries = Arrays.asList(
                new Country("Япония"),
                new Country("Канада"),
                new Country("Россия"),
                new Country("Греция"),
                new Country("Австралия"),
                new Country("Бразилия"),
                new Country("Германия"),
                new Country("Франция"),
                new Country("Италия"),
                new Country("Китай"),
                new Country("США"),
                new Country("Австрия"),
                new Country("Великобритания"),
                new Country("Испания")
        );

        // Сортировка с использованием Comparable
        Collections.sort(countries);

        // Вывод результата
        System.out.println("Порядок выхода стран на открытии Олимпийских игр:");
        for (int i = 0; i < countries.size(); i++) {
            System.out.print(countries.get(i));
            if (i < countries.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}