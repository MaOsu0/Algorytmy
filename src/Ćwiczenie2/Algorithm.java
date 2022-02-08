package Ćwiczenie2;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        int multi = 1;

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 5; index++) {
            int next = scanner.nextInt();
            multi *= next;
        }
        if (multi >= 0) {
            System.out.println("nieujemna");
        } else {
            System.out.println("ujemna");
        }

        scanner.close();
        System.out.println("Koniec programu");
    }

}