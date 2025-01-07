package day2;

import java.util.Scanner;

public class rotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(char c:a.toCharArray()){
            System.out.println(c);
        }

        sc.close();
    }
}
