/*Написать метод для суммирования 2 интов
        Перегрузить его так, чтобы можно было суммировать long и long, double и double

        Return type - double для всех методов*/

public class Main {
    public static void main(String[] args) {
        Int i = new Int();
        System.out.println(i.getSum(85.99,45.88));

        Int l = new Long ();
        System.out.println(l.getSum(85.99, 45.88));

        Int d = new Long ();
        System.out.println(d.getSum(85.99, 45.88));
    }
}