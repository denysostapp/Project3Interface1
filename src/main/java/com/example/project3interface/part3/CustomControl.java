package com.example.project3interface.part3;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class CustomControl extends Pane {
    private String text;
    private EventHandler eventHandler;

    public CustomControl(String text) {
        this.text = text;
        Label label = new Label(text);
        setPrefSize(75,75);
        setStyle("-fx-background-color: lightgrey");
        label.setLayoutX(20);
        label.setLayoutY(30);
        getChildren().add(label);

        setOnMouseClicked(event -> {
            if (eventHandler != null) {
                eventHandler.handleEvent();
            }
        });

    }

    public String getText() {
        return text;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }
}