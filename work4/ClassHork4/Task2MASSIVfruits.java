package work4.ClassHork4;
//Задача 2:
//2.1 Создать массив fruits и заполнить его 4 произвольными фруктами.+
//2.2 вывести в консоль второй и четвертый.+
//2.3 вывести в консоль длину массива.+
//2.4 третий фрукт заменить на иной.+
//2.5 проверить результат в консоли.+

import java.util.Arrays;

public class Task2MASSIVfruits {
    public static void main (String [] args){
        String [] fruits = {"Pineapple","Orange","Coconut","Raspberry"};
        int d = fruits.length;

        System.out.println((fruits[1] +"," + fruits[3]));
        System.out.println(d);
        String temp = fruits [0];
        fruits [0] = fruits [3];
        fruits [3] = temp;
        System.out.println(Arrays.toString(fruits));
    }
}
