package com.rmarchew;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create a simple root container
        StackPane root = new StackPane();
        
        // Create a scene with the root container
        Scene scene = new Scene(root, 800, 600);
        
        // Set up the stage (window)
        primaryStage.setTitle("CSC375 Project");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}