package com.travelguide.dao;

import com.travelguide.model.TouristSpot;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TouristSpotDAO implements DAOInterface {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String DB_USERNAME = "your_username";
    private static final String DB_PASSWORD = "your_password";

    @Override
    public List<TouristSpot> getSpotsByCity(String city) {
        List<TouristSpot> spots = new ArrayList<>();
        String query = "SELECT * FROM tourist_spots WHERE city = ?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, city);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String type = resultSet.getString("type");
                String description = resultSet.getString("description");

                // Create a new TouristSpot object and add it to the list
                TouristSpot spot = new TouristSpot(name, city, type, description);
                spots.add(spot);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return spots;
    }
}
