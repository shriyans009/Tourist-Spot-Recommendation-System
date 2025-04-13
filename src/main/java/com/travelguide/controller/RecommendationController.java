package com.travelguide.controller;

import com.travelguide.service.RecommendationEngine;
import com.travelguide.util.InputHandler;

import java.util.Scanner;

public class RecommendationController {
    public static void startApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(\"Enter city name to get recommendations:\");
        String city = scanner.nextLine();

        RecommendationEngine engine = new RecommendationEngine();
        engine.recommendSpots(city);
    }
}
