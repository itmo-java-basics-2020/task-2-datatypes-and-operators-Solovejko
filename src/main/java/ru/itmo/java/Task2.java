package ru.itmo.java;

import javax.swing.*;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */

    double getFractionalPart(double realNumber) {
        return realNumber - Math.floor(realNumber);
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */


    int charCode(char c) {
        return c;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.intValue() == b.intValue(); //your code here
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if (number == null || leftBound == null || rightBound == null || inclusively == null)
            return false;

        if (!inclusively.booleanValue())
            if (number.intValue() > leftBound.intValue() && number.intValue() < rightBound.intValue())
                return true;
            else
                return false;
        else
            if (number.intValue() >= leftBound.intValue() && number.intValue() <= rightBound.intValue())
                return true;
            else
                return false;
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */

    boolean atLeastOneIsDigit(char c1, char c2, char c3){
        if ((int)c1 >= '0' && (int)c1 <= '9' || (int)c2 >= '0' && (int)c2 <= '9' || (int)c3 >= '0' && (int)c3 <= '9')
            return true;
        else
            return false;
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        return Math.abs(a - b) < 1e-6;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        return n%10 + (n/10)%10 + (n/100)%10;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        if (n%2 == 1)
            return n+1;
        else
            return n+2;
    }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */

    int schoolDesks(int num1, int num2, int num3) {
        int out = 0;

        if (num1 % 2 == 0)
            out += num1 / 2;
        else
            out += num1 / 2 + 1;

        if (num2 % 2 == 0)
            out += num2 / 2;
        else
            out += num2 / 2 + 1;

        if (num3 % 2 == 0)
            out += num3 / 2;
        else
            out += num3 / 2 + 1;

        return out;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */

    int xorDigits(int N) {
        return ((N%100)/10) ^ (N%10);
    }
}
