package homeWork11.middle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Middle {
    /*
 1.  “Частота слов в тексте”
На вход подаётся некий текст, на выходе должно быть слово и частота его появления в тексте. Например:
“ Идут три брата: брат Клим брит, брат Глеб брит, брат Игнат бородат.”
брат [3]
брит [2]
бородат [1]
Клим [1]
брата [1]
Игнат [1]
Идут [1]
три [1]
Глеб [1]
Подсказка: чтобы разбить сроку на массив, используйте метод класса String split(DELIMITER), который вернёт массив строк.
Используйте для решения задачи коллекции.

2. “Уникальные числа”
Вводится n целых чисел. Определите, сколько различных чисел было введено.
Например: 1 3 3 5 6 7 7 7 8
Ответ: 6
Используйте для решения задачи коллекции.

3. Какое слово встречается чаще всего?
На вход подаётся текст, например отрывок из книги “Война и Мир”
Нужно определить, какое слово появляется в тексте чаще всего. Используйте для решения задачи коллекции.


4. Олимпиада.
Вам нужно написать последовательный выход стран на открытии Олимпийских игр по алфавиту. Нужно учесть, что Греция всегда выходит первой.
На вход: неотсортированный список стран (Япония, Канада, Россия и т.д.)
На выходе: Греция, Австралия, Австрия ….. Япония
Подсказка: используйте для этого Comparable
     */
    private static final String text = "Идут три брата: брат Клим брит, брат Глеб брит, брат Игнат бородат.";

    public static void wordsCounter(String text) {
        String[] words = text.split("[\\s,:.]");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " [" + entry.getValue() + "]");
        }
    }

    public static void unicNumbers() {
        int[] array = {1, 3, 3, 5, 6, 7, 7, 7, 8};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        System.out.println("Всего уникальных " + set.size() + " чисел");
    }

    public static void mostPopularWord() {
        String text = "Судьба забросила меня на целых шесть месяцев в глухую деревушку Волынской губернии, " +
                "на окраину Полесья, и охота была единственным моим занятием и удовольствием. Признаюсь, " +
                "в то время, когда мне предложили ехать в деревню, я вовсе не думал так нестерпимо скучать. " +
                "Я поехал даже с радостью. «Полесье... глушь... лоно природы... простые нравы... первобытные натуры, – " +
                "думал я, сидя в вагоне, – совсем незнакомый мне народ, со странными обычаями, своеобразным " +
                "языком… и уж, наверно, какое множество поэтических легенд, преданий и песен!» А я в то время " +
                "(рассказывать, так все рассказывать) уж успел тиснуть в одной маленькой газетке рассказ с " +
                "двумя убийствами и одним самоубийством и знал теоретически, что для писателей полезно наблюдать нравы";
        String[] words = text.split("[\\s,.?:-«»()]");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }
        int max = 0;
        String mostPopular = "";
        for (Map.Entry<String, Integer> num : map.entrySet()) {
            if (num.getValue() > max) {
                max = num.getValue();
                mostPopular = num.getKey();
            }
        }
        System.out.println("Самое частое слово в тексте: \"" + mostPopular + "\" (встречается " + max + " раз)");
    }

    public static void main(String[] args) {
        System.out.println("\nЗадание 1 :\n");
        Middle.wordsCounter(text);
        System.out.println("\nЗадание 2 :\n");
        Middle.unicNumbers();
        System.out.println("\nЗадание 3 :\n");
        Middle.mostPopularWord();
    }
}
