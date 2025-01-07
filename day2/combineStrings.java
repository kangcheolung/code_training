package day2;

import java.util.Scanner;

public class combineStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String c = a + b;

        System.out.println(c);

        sc.close();
    }
}
