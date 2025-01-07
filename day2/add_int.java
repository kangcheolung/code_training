package day2;

import java.util.Scanner;

public class add_int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = a + b;

        System.out.printf("%d + %d = %d", a, b, c);
    }
}
