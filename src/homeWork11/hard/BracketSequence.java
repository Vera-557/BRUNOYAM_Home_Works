package homeWork11.hard;

import java.util.*;

public class BracketSequence {
    public static boolean isValidBracketSequence(String sequence) {
        Stack<Character> stack = new Stack<>();

        for (char ch : sequence.toCharArray()) {
            // Если открывающая скобка - помещаем в стек
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Если закрывающая скобка
            else if (ch == ')' || ch == ']' || ch == '}') {
                // Если стек пуст - ошибка
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                // Проверяем соответствие скобок
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
            // Игнорируем все остальные символы (пробелы, буквы и т.д.)
        }

        // Если стек пуст - все скобки закрыты правильно
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }

    public static void main(String[] args) {
        String[] testCases = {
                "[ { () } ]",           // Правильно
                "[ [ { ] } ]",          // Неправильно
                "()",                   // Правильно
                "({[]})",               // Правильно
                "([)]",                 // Неправильно
                "((()))",               // Правильно
                "(()",                  // Неправильно
                "())",                  // Неправильно
                "{[()]}",               // Правильно
                "{[}]"                  // Неправильно
        };

        for (String test : testCases) {
            // Удаляем пробелы для проверки
            String clean = test.replaceAll("\\s+", "");
            boolean result = isValidBracketSequence(clean);
            System.out.println("\"" + test + "\" -> " + (result ? "Правильно" : "Неправильно"));
        }
    }
}