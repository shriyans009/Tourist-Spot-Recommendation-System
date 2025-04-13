package com.travelguide.util;

import java.util.Scanner;

public class InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static String getCityInput() {
        System.out.print("Enter city name: ");
        return scanner.nextLine().trim();
    }
}
