package Work3.Homework3;

import java.util.Scanner;

public class HW3task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if ( t >-5 ){
        System.out.println("Warm");
        }
        if ( -5 >= t &&t >-20) {
        System.out.println("Normal");
        }
        if ( -20 >=t ) {
        System.out.println("Cold");
        }
    }
}