package com.travelguide.model;

public class TouristSpot {

    private String name;
    private String city;
    private String type;
    private String description;

    // Constructor
    public TouristSpot(String name, String city, String type, String description) {
        this.name = name;
        this.city = city;
        this.type = type;
        this.description = description;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for city
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    // Getter and Setter for type
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Override the toString method to return the object data as a string
    @Override
    public String toString() {
        return "TouristSpot{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
