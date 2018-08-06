/*Вычислить и вывести на экран косинусы углов в 60, 45 и 40 градусов
 без использования функции Math.toDegrees(n).*/

public class subject2task1edited {
    public static void main(String[] args) {

        int a = 60;
        int b = 45;
        int c = 40;

        //формула перевода градусов в радианы "y градусов = (y * PI)/180"

        double aa = (a * Math.PI) / 180;   //расчитываем значение угла в радианах
        double bb = (b * Math.PI) / 180;   //расчитываем значение угла в радианах
        double cc = (c * Math.PI) / 180;   //расчитываем значение угла в радианах

        System.out.println("косинус угла в 60 градусов = " + Math.cos (aa));  //расчитываем косинус угла
        System.out.println("косинус угла в 45 градусов = " + Math.cos (bb));
        System.out.println("косинус угла в 40 градусов = " + Math.cos (cc));
    }
}
