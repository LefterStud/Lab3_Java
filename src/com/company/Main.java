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
        int N = 36491;
        int tempN = N;
        int sizeN = 0;
        while (tempN > 0) {
            sizeN++;
            tempN /= 10;
        }
        char[] symbol = new char[sizeN];
        for (int i = sizeN; i > 0; i--) {
            symbol[i - 1] = (char) (N % 10 + 48);
            N /= 10;
        }
        for (int i = 0; i < sizeN; i++) {
            System.out.print(symbol[i] + " ");
        }
    }

    /**
     * Дана строка, состоящая из слов кириллицей,
     * набранных заглавными буквами и разделенных пробелами (одним или несколькими).
     * Найти количество слов, которые содержат хотя бы одну букву «А».
     */
    private static void task43() {
        System.out.println("\n\nTask 43");
        int ACounter = 0;
        String wordString = "ПОЕЗД КОМПЬЮТЕР МАШИНА СЛОВО ТАНК КУРИЦА";
        boolean onlyUpperKirilLetter = wordString.matches("^[А-Я\\s+]+$");
        if (onlyUpperKirilLetter) {
            for (String aWord : wordString.split("\\s+")) {
                if (aWord.contains("А")) {
                    ACounter++;
                }
            }
            System.out.println("Вы ввели " + ACounter + " слов с буквой 'А'");
        } else {
            System.out.println("Данные введены неккоректно!");
        }
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

    /**
     * Дана строка-предложение заданное кириллицей. Зашифровать ее,
     * выполнив циклическую замену каждой буквы на следующую за ней в алфавите и сохранив при этом регистр букв
     * («А» перейдет в «Б», «а» — в «б», «Б» — в «В», «я» — в «а» и т. д.). Букву «ё» в алфавите не учитывать
     * («е» должна переходить в «ж»). Знаки препинания и пробелы не изменять.
     */
    private static void task62() {
        System.out.println("\n\nTask 62");
        String wordString = "Дана Строка-Предложениёе Заданное Кириллицей.";
        String newWordString=wordString;
        boolean onlyKirilLetter = wordString.matches("^[-.,а-яёЁА-Я\\s+]+$");
        wordString = wordString.replace('ё', 'е');
        wordString = wordString.replace('Ё', 'Е');
        if (onlyKirilLetter) {
            int tempOldChar;
            int tempNewChar;
            for (int i = 0; i < wordString.length(); i++) {

                if ((wordString.charAt(i)!=' ')&&(wordString.charAt(i)!=',')&&(wordString.charAt(i)!='.')&&(wordString.charAt(i)!='-')) {
                    tempOldChar = wordString.charAt(i);
                    tempNewChar = wordString.charAt(i) + 1;
                    newWordString = wordString.replace((char) tempOldChar, (char) tempNewChar);
                    if(wordString.charAt(i)=='Я'){
                        newWordString = wordString.replace(wordString.charAt(i),'А');
                    }
                    if(wordString.charAt(i)=='я'){
                        newWordString = wordString.replace(wordString.charAt(i),'а');
                    }
                }
                System.out.print(newWordString.charAt(i));
            }
        } else {
            System.out.println("Данные введены неккоректно!");
        }
    }

    public static void main(String[] args) {
        task20();
        task43();
        task9();
        task62();
    }
}
