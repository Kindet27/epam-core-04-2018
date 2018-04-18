package com.epam.homework;

import java.util.HashSet;
import java.util.Scanner;

public class Task4 {

    /**
     * Ввести с консоли N слов, состоящих из символов английского алфавита.
     * Найти слово, в котором число различных символов минимально.
     * Символы верхнего и нижнего регистра считать различными.
     * Если таких слов несколько, найти первое из них.
     *
     * Формат входных данных:
     * N (целое число) - количество слов в строке
     * Строка, содержащая указанное количество слов, разделенных пробелами
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должно быть выведено слово, содержащее наименьшее число различных символов.
     *
     * -------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 4
     * Cake is a lie
     *
     * Выходные данные:
     * a
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        //////////////////////////////////////////////////
        //First release. Without Sets
        /*String wordWithMinimalNumDiffLetters ="";
        int minNum = Integer.MAX_VALUE;

        for (String str : strings) {
            int min = 1;
            INNER: for (int i = str.length()-1; i >= 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        continue INNER;
                    }
                }
                min += 1;
            }
            if (min < minNum){
                minNum = min;
                wordWithMinimalNumDiffLetters = str;
            }
        }*////////////////////////////////////////////////

        System.out.println(WordWithMinimalNumDiffLetters(strings));
    }

    public static String WordWithMinimalNumDiffLetters(String[] strings){

        String wordWithMinimalNumDiffLetters = strings[0];
        int minimalNumDiffLetters = Integer.MAX_VALUE;
        for (String string : strings) {
            HashSet<Character> hashSet = new HashSet<>();
            for (int i = 0; i < string.length(); i++) {
                hashSet.add(string.charAt(i));
            }
            if (hashSet.size() < minimalNumDiffLetters){
                wordWithMinimalNumDiffLetters = string;
                minimalNumDiffLetters = hashSet.size();
            }
        }
        return wordWithMinimalNumDiffLetters;
    }
}
