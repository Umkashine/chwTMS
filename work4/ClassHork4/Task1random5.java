package work4.ClassHork4;
//Задача 1:
//Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.
public class Task1random5 {
    public static void main (String [] args) {
        for ( int x = 0; x < 5; x++){
        double a = Math.random();//привести к целым числам a = (int) Math....это если б x был бы < 100 например
        System.out.println(a);}
    }
}
