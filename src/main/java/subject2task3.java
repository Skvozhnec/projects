/*Натуральное положительное число записано в переменную n.
Определить и вывести на экран, сколько цифр в числе n.*/

public class subject2task3 {
    public static void main(String[] args) {

        int n = 1233;

        System.out.println((int) Math.log10(n) + 1);  /* высчитываем десятичный логарифм числа, прибавляем единицу(минимально количество цифр)
        округляем выражение до целых чисел путем (int)

        Десятичный логарифм от аргумента x — это логарифм по основанию 10,
        т.е. степень, в которую надо возвести число 10, чтобы получить число x. Обозначение: lg x.*/
    }
}