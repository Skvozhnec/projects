/*В переменной n лежит некоторое вещественное число.
Вычислить и вывести на экран значение функции «сигнум» от этого числа
(-1,если число отрицательное; 0, если нулевое; 1 если, положительное).
*/
public class subject2task4 {
    public static void main(String[] args) {

        int n = 7;
        int b = 0;
        int c = -5;

        //sgn(x)=1 при x>0; sgn(x)=0 при x=0; sgn(x)=-1 при x<0;

        System.out.println("сигнум положительного числа = " + Math.signum(n));
        System.out.println("сигнум нулевого числа = " + Math.signum(b));
        System.out.println("сигнум торицательного числа = " + Math.signum(c));

    }
}
