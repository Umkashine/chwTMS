package work4.ClassHork4;
//Задача 3:
//3.1 Создать пустой массив типа double с названием masDouble такого размера, который
//пользователь вводит с клавиатуры. +
//3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
//консоль.+
//3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//обратном порядке. +

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3masDoble {
    public static void main (String [] args){
         Scanner Scanner = new Scanner(System.in);
         int x = Scanner.nextInt(); // x - введённое число
         double MasDouble [] = new double[x]; // создаю новый массив и присваиваю ему знач. со сканера в скобках
         for (int v  = 0; v < MasDouble.length; v ++ ) { // v = 0, пока v меньше длины масива, v будет +1;
             MasDouble [v] = Math.random(); //индекс элемента V = рандом!
             if (v%2==0) { //если элемент массива деля на 2 дает нулевой остаток то
                 MasDouble[v] =v*2; //элемент массива V будет равен = V * 2
             }
         }
         System.out.println(Arrays.toString(MasDouble));
        for (int v = x - 1; v >= 0; v--) { //всё равно не понял
            System.out.print( MasDouble[v]+","); //вывод массива в обратном порядке
        }
    }
}
