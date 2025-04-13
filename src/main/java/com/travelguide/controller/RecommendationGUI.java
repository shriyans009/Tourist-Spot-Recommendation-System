package com.travelguide.controller;

import com.travelguide.service.RecommendationEngine;
import com.travelguide.exceptions.NoRecommendationFoundException;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class RecommendationGUI extends JFrame {
    private JTextField cityField;
    private JTextArea resultArea;

    public RecommendationGUI() {
        setTitle("Tourist Spot Recommender");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null); // Center window

        // Layout
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        JPanel inputPanel = new JPanel(new FlowLayout());

        JLabel cityLabel = new JLabel("Enter City:");
        cityField = new JTextField(20);
        JButton recommendBtn = new JButton("Recommend");

        inputPanel.add(cityLabel);
        inputPanel.add(cityField);
        inputPanel.add(recommendBtn);

        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(inputPanel, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);

        recommendBtn.addActionListener(e -> showRecommendations());

        setVisible(true);
    }

    private void showRecommendations() {
        String city = cityField.getText().trim();
        if (city.isEmpty()) {
            JOptionPane.showMessageDialog(this, "City name cannot be empty!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        RecommendationEngine engine = new RecommendationEngine();
        try {
            List<String> recommendations = engine.getRecommendations(city);
            resultArea.setText("");
            if (recommendations.isEmpty()) {
                resultArea.setText("No tourist spots found for " + city + ".");
            } else {
                resultArea.append("Recommended Tourist Spots in " + city + ":\n\n");
                for (String spot : recommendations) {
                    resultArea.append("• " + spot + "\n");
                }
            }
        } catch (NoRecommendationFoundException ex) {
            resultArea.setText("⚠️ " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(RecommendationGUI::new);
    }
}
