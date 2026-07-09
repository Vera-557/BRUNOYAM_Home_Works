package homeWork11.hard;

import java.util.*;

public class SymmetricDifference {
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> result = new HashSet<>(set1);
        Set<Integer> temp = new HashSet<>(set2);

        // Удаляем из result все элементы, которые есть в set2
        result.removeAll(set2);
        // Удаляем из temp все элементы, которые есть в set1
        temp.removeAll(set1);
        // Объединяем результаты
        result.addAll(temp);

        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 5, 7));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 6, 8));

        Set<Integer> result = symmetricDifference(set1, set2);
        System.out.println("Симметричная разность: " + result); // {5, 6, 7, 8}
    }
}