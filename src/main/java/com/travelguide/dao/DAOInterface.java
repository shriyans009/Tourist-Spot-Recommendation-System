package com.travelguide.dao;

import com.travelguide.model.TouristSpot;
import java.util.List;

public interface DAOInterface {
    List<TouristSpot> getSpotsByCity(String city);
}
