package com.example.project3interface.part3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private CustomControl currentControl;
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Label label1 = new Label("No control selected");
        root.getChildren().add(label1);

        for (int i = 0; i < 6; i++) {
            CustomControl customControl = new CustomControl("Control" + (i+1));
            customControl.setTranslateX(50+i*105);
            customControl.setTranslateY(200);
            customControl.setEventHandler(()-> {
                customControl.setStyle("-fx-background-color: #ff0033;");
                label1.setText(customControl.getText());
                if (currentControl != null) {
                    currentControl.setStyle("-fx-background-color: lightgrey;");
                }
                currentControl = customControl;
            });
            root.getChildren().add(customControl);
        }

        Scene scene = new Scene(root,800,800);
        primaryStage.setTitle("Controller");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


