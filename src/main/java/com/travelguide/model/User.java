package com.travelguide.model;

public class User {
    private String name;
    private String preferredCity;

    public User(String name, String preferredCity) {
        this.name = name;
        this.preferredCity = preferredCity;
    }

    public String getPreferredCity() {
        return preferredCity;
    }

    public String getName() {
        return name;
    }
}
