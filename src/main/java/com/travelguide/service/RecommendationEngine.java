package com.travelguide.service;

import com.travelguide.dao.TouristSpotDAO;
import com.travelguide.exceptions.NoRecommendationFoundException;
import com.travelguide.model.TouristSpot;

import java.util.ArrayList;
import java.util.List;

public class RecommendationEngine {

    // Method to fetch recommendations based on the city
    public List<String> getRecommendations(String city) {
        TouristSpotDAO dao = new TouristSpotDAO();
        
        // Fetch tourist spots by city
        List<TouristSpot> spots = dao.getSpotsByCity(city);

        // If no spots are found, throw an exception
        if (spots.isEmpty()) {
            throw new NoRecommendationFoundException("No recommendations found for city: " + city);
        }

        // Create a result list to store the spot details as strings
        List<String> result = new ArrayList<>();
        
        // Loop through the spots and add their string representations to the result list
        for (TouristSpot spot : spots) {
            result.add(spot.toString());
        }

        // Return the final list of recommendations
        return result;
    }
}
