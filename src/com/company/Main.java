package com.company;

import java.util.Scanner;

public class Main {

    public static void isDoubloon(String input) {
        int count = 0;
        int index = input.length() - 1;
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < input.length(); j++) {

                if (input.charAt(i) == input.charAt(j)) {
                    count++;
                }
            }
        }
        if (count != 0 && count % 2 == 0) {  // TODO Hvad betyder det her?
            System.out.println("String is Doubloon ");
        } else {
            System.out.println("String is not Doubloon ");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the character :");
        String input = scan.nextLine().toLowerCase();
        scan.close();
        isDoubloon(input);
    }
}
