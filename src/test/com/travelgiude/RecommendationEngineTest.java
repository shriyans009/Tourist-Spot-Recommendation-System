package com.travelguide;

import com.travelguide.service.RecommendationEngine;

public class RecommendationEngineTest {
    public static void main(String[] args) {
        RecommendationEngine engine = new RecommendationEngine();
        engine.recommendSpots("Delhi");
    }
}
