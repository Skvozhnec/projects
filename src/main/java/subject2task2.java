/*В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 Вычислить и вывести на экран площадь треугольника и его периметр.*/

public class subject2task2 {
    public static void main(String[] args) {
        int a = 4;  //вводить значение катета
        int b = 6;  //вводить значение катета

        /* Площадь прямоугольного треугольника равна половине произведения катетов треугольника:
         * S = (a * b) / 2   */

        int S = (a * b) / 2;

        System.out.println("площадь треугольника = " + S);
        /* чтобы найти гипотенузу используем теорему Пифагора:
         c в квадрате = a в квадрате + b в квадрате.

        чтобы найти периметр треугольника, надо сложить длины всех его сторон.
        * P = a + b + c            */

        double g = (Math.pow(a, 2)) + (Math.pow(b, 2)); //находим гипотенузу в квадрате

        double c = (Math.sqrt(g));  //извлекаем квадратный корень и находим значение гипотенузы

        double P = (a + b + c); //находим периметр

        System.out.println("периметр треугольника = " + P);
    }
}


