package org.fasttrackit.util;


import java.util.Scanner;

/**
 * @author flo
 * @since 15/12/2016.
 */
public class Calc {

    public static void main(String[] args) {

        int option;
        do {
            System.out.println("1-Create");
            System.out.print("2-UpdateByName\n");
            System.out.print("3-DeleteByName | 4 - searchByName |");
            System.out.println(" 5 - printAll");
            System.out.println("9 - Exit");

            option = Calc.readIntFromConsole();
        }
        while (option != 9);

    }

    public static int readIntFromConsole() {
        return Integer.valueOf(new Scanner(System.in).nextLine());
    }
}

