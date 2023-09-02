package Work3.Homework3;

import java.util.Scanner;

public class HW3task1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int a = Scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Число чётное");
        }
        else  {
            System.out.println("Число нечетное");
        }
    }
}