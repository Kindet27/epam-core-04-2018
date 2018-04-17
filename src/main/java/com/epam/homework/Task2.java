package com.epam.homework;

import java.io.*;

public class Task2 {

    /**
     * Ввести N строк с консоли.
     * Упорядочить и вывести строки в порядке возрастания значений их длины.
     * В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
     *
     * Формат входных данных:
     * N (целое число, 0 < N < 100) - количество доступных для чтения строк
     * Строка_1
     * Строка_2
     * ...
     * Строка_N
     *
     * Формат выходных данных:
     * В результате выполнения в выходной поток должны быть выведены N строк следующего вида:
     * (длина строки): строка наименьшей длины
     * (длина строки): строка большей длины
     * (длина строки): строка большей длины
     * ...
     * (длина строки): строка наибольшей длины
     *
     * ----------------------------------------------------------------------------------------------
     * Пример выполнения задания:
     *
     * Входные данные:
     * 4
     * Тихо струится река серебристая
     * В царстве вечернем зеленой весны.
     * Солнце садится за горы лесистые.
     * Рог золотой выплывает луны.
     *
     * Выходные данные:
     * (27): Рог золотой выплывает луны.
     * (30): Тихо струится река серебристая
     * (32): Солнце садится за горы лесистые.
     * (33): В царстве вечернем зеленой весны.
     */
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] result = new String[Integer.parseInt(reader.readLine())];
        result[0] = reader.readLine();

        for (int i = 1; i < result.length; i++) {
            result[i] = reader.readLine();

            for (int j = i; j >0; j--) {
                if(result[j].length() < result[j-1].length() || (result[j].length() == result[j-1].length() && result[j].compareTo(result[j-1]) < 0)){
                    String sSub = result[j-1];
                    result[j-1] = result[j];
                    result[j] = sSub;
                }
                else break;
            }
        }

        for(String current : result) {
            System.out.println("(" + current.length() + "): " + current);
             }
    }
}
