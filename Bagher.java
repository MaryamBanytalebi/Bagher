package Quera2;

import java.util.Scanner;

public class Bagher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a + b + c == 180 && a != 0 && b != 0 && c != 0 && (a + b > c || a + c > b))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
