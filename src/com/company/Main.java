package com.company;

/**
 * Lefter Olexii, #18
 */
public class Main {

    /**
     * Дано целое положительное число. Вывести символы,
     * изображающие цифры этого числа (в порядке слева направо).
     */
    private static void task20() {
        System.out.println("Task 20");

    }

    /**
     * Дана строка, состоящая из слов кириллицей,
     * набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Найти количество слов, которые содержат хотя бы одну букву «А».
     */
    private static void task43() {
        System.out.println("\n\nTask 43");
        int spaceCounter=0;
        String wordString = "ПОЕЗД КОМПЬЮТЕР МАШИНА СЛОВО ТАНК";
        System.out.print(wordString.charAt(2));
    }

    /**
     * Дано четное число N (> 0) и символы C1 и C2. Вывести строку длины N,
     * которая состоит из чередующихся символов C1 и C2, начиная с C1.
     */
    private static void task9() {
        System.out.println("\n\nTask 9");
        final int N = 100;
        final char c1 = 'A';
        final char c2 = 'B';
        for (int i = 1; i <= N; i++) {
            if ((i % 2) != 0) {
                System.out.print(c1);
            } else {
                System.out.print(c2);
            }
        }
    }

    public static void main(String[] args) {
        task20();
        task43();
    //    task9();
    }
}
