package work4.ClassHork4;
//Задача 3:
//3.1 Создать пустой массив типа double с названием masDouble такого размера, который
//пользователь вводит с клавиатуры. +
//3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
//консоль.
//3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//обратном порядке.

import java.util.Arrays;
import java.util.Scanner;

public class Task3masDoble {
    public static void main (String [] args){
         Scanner Scanner = new Scanner(System.in);
         int x = Scanner.nextInt();
         double MasDouble [] = new double[x]; // создаю новый массив и присваиваю ему знач. со сканера в скобках
         MasDouble[0] = Math.random();
         MasDouble[1] = Math.random();//ЗАПОЛНИЛ РАНДОМНЫМИ ЧИСЛАМИ
         MasDouble[2] = Math.random();
         MasDouble[3] = Math.random();
         MasDouble[4] = Math.random();
         System.out.println(Arrays.toString(MasDouble));
    }
}
