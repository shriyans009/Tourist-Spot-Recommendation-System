# 🌍 Tourist Spot Recommendation System

A modular and scalable Java-based desktop application that provides tourist spot recommendations based on user-inputted city names. Built using the MVC architecture with a Swing GUI and JDBC integration.

---

## 📌 Features

- 🔍 City-based tourist spot recommendations  
- 💻 User-friendly Java Swing GUI  
- 🗂️ Follows MVC + DAO architecture  
- ⚙️ JDBC integration with MySQL (can be extended to other DBs)  
- 🧪 Unit-test ready structure  
- 🚀 Easily extendable for web or mobile versions

---

## 🏗️ Project Structure

```plaintext
tourist-spot-recommender/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/travelguide/
│   │   │       ├── Main.java
│   │   │       ├── controller/
│   │   │       │   └── RecommendationGUI.java
│   │   │       ├── config/
│   │   │       │   └── DBConfig.java
│   │   │       ├── dao/
│   │   │       │   ├── DAOInterface.java
│   │   │       │   └── TouristSpotDAO.java
│   │   │       ├── exceptions/
│   │   │       │   ├── InvalidInputException.java
│   │   │       │   └── NoRecommendationFoundException.java
│   │   │       ├── model/
│   │   │       │   ├── TouristSpot.java
│   │   │       │   ├── AdventureSpot.java
│   │   │       │   ├── HistoricalSpot.java
│   │   │       │   └── User.java
│   │   │       ├── service/
│   │   │       │   └── RecommendationEngine.java
│   │   │       └── util/
│   │   │           └── InputHandler.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── log4j.properties
│   └── test/
│       └── com/travelguide/
│           └── (Test classes here)
├── database/
│   ├── schema.sql
│   └── sample_data.sql
├── README.md
├── pom.xml (if using Maven)
└── build.gradle (if using Gradle)
