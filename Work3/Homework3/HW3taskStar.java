package Work3.Homework3;

import java.util.Scanner;

public class HW3taskStar {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("вперёд");
        int b = Scanner.nextInt();
        int c;
        if (b >= 1) {
            c = b * (b + 1) / 2;
            System.out.print(c);
        }
        else {
            System.out.print("go norm");
        }
    }
}